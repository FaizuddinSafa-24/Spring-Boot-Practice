package com.example.crudapi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class TaskService {
    @Autowired
    private TaskRepository taskrepo;


    public Task createTask(Task task) {
        return taskrepo.save(task);
    }

    public List<Task> getAllTask() {
        return taskrepo.findAll();
    }

    public Task getTaskById(Long id) {
        return taskrepo.findById(id).orElse(null);
    }

    public void deleteTask(Long id) {
        taskrepo.deleteById(id);
    }
}
