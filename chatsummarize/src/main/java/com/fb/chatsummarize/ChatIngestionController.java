package com.fb.chatsummarize;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chatsummarize/chat")
public class ChatIngestionController {
    private final ChatProcessorService service;

    public ChatIngestionController(ChatProcessorService service) {
        this.service = service;
    }
    @PostMapping("/chatsummarize/process-raw")
    public ResponseEntity<String> ingestChatJSon(@RequestBody MessageRoot raw) {
        String formatChat = service.formatChat(raw);
        return ResponseEntity.ok(formatChat);
    }
}
