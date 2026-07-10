package com.fb.chatsummarize;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;
@Service
public class ChatProcessorService {
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern("HH:mm").withZone(ZoneId.systemDefault());
    public String formatChat(MessageRoot root) {
        if(root.msg() == null || root.msg().isEmpty()) {
            return "No messages found to process";
        }
        List<Message> cleanup = root.msg().stream()
                .filter(msg -> msg.content() != null && !msg.content().isBlank())
                .filter(msg -> !"UserEventhandler".equals(msg.type()))
                .collect(Collectors.toList());
        int left =0, right = cleanup.size() -1;
        while(left < right) {
            Message temp = cleanup.get(left);
            cleanup.set(left,cleanup.get(right));
            cleanup.set(right,temp);
            left++;
            right--;
        }
        StringBuilder prompt = new StringBuilder();
        prompt.append("Chat log Title: ").append(root.title()).append("\n\n");
        for(Message msg : cleanup) {
            String time = TIME_FORMATTER.format(Instant.ofEpochMilli(msg.timeStampMs()));
            prompt.append("[").append(time).append("]").append(msg.senderName()).append(": ").append(msg.content()).append("\n");
        }
        return prompt.toString();
    }
}
