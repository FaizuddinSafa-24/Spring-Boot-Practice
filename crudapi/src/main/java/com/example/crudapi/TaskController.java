package com.example.crudapi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TaskController {
    @Autowired
    private TaskService task;


    @PostMapping("/crudapi/tasks/")
    public Task createTask(@RequestBody Task work) {
        return task.createTask(work);
    }

    @GetMapping("/crudapi/tasks/")
    public List<Task> getAllTask() {
        return task.getAllTask();
    }

    @GetMapping("/crudapi/tasks/{id}/")
    public Task getTaskById(@PathVariable Long id) {
        return task.getTaskById(id);
    }

    @DeleteMapping("/crudapi/tasks/{id}/")
    public void deleteTask(@PathVariable Long id) {
        task.deleteTask(id);
    }
}
