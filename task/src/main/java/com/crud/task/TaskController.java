package com.crud.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    TaskService taskOp;

    @PostMapping("/task/tasks/")
    public Task createtask(@RequestBody Task task) {
        return taskOp.createTask(task);
    }

    @GetMapping("/task/tasks/{id}")
    public Task findById(@PathVariable Long id) {
        return taskOp.findById(id);
    }

    @GetMapping("/task/tasks/")
    public List<Task> getAllTask() {
        return taskOp.getAllTask();
    }

    @DeleteMapping("/task/tasks/{id}/")
    public void deleteTaskById(@PathVariable Long id) {
        taskOp.deleteTaskById(id);
    }

    @DeleteMapping("/task/tasks/")
    public void deleteAllTask() {
        taskOp.deleteAllTask();
    }

}
