package com.listoftask.api;

public class Task {
    private int id;
    private String topic;
    private boolean status;

    public Task() {
    }

    public Task(int id, String topic, boolean status) {
        this.id = id;
        this.topic = topic;
        this.status = status;
    }

    public int getId() {
        return id;
    }

    public String getTopic() {
        return topic;
    }

    public boolean isStatus() {
        return status;
    }
}
