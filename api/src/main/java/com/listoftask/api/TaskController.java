package com.listoftask.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class TaskController {
    @GetMapping("/api/tasks")
    public List<Task> getTask() {
        return List.of(
                new Task(21,"Spring Boot RESTful API usuage",true),
                new Task(25,"Spring Boot EndPoint Returning List of Tasks as JSON", false),
                new Task(45, "C++ Syntax leraning for DSA course",false)
        );
    }
}
