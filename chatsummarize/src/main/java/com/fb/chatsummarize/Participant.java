package com.fb.chatsummarize;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties(ignoreUnknown = true)
public record Participant(
        String name
) {
}
