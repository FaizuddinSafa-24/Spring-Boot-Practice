package com.fb.chatsummarize;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Message(
        @JsonProperty("sender_name")
        String senderName,

        @JsonProperty("timestamp_ms")
        long timeStampMs,

        String content,
        String type,
        String share
) {
}
