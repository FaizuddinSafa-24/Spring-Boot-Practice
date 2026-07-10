package com.fb.chatsummarize;

import java.util.List;

public record MessageRoot(
        List<Participant> participants,
        List<Message> msg,
        String title
) {}
