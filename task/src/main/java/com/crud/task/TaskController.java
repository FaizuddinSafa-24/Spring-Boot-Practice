package com.crud.task;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TaskController {
    TaskService taskOp;

    @PostMapping("/task/tasks/")
    public Task createtask(@RequestBody Task task) {
        return taskop.createTask(task);
    }
    @GetMapping

}
