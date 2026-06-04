package com.example.crudapi;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String topic;

    private boolean completed;


    public Task() {
    }


    public Task(long id, String topic, boolean completed) {
        this.id = id;
        this.topic = topic;
        this.completed = completed;
    }


    public long getId() {
        return id;
    }


    public String getTopic() {
        return topic;
    }


    public boolean isCompleted() {
        return completed;
    }

}
