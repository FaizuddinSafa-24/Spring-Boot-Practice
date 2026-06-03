package com.safa.taskapi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
@RestController
public class TaskController {
    @GetMapping("/api/tasks")
    public  List<String> getTask() {
        return List.of("Buy groceries","Read docs","Ship code");
    }
}
