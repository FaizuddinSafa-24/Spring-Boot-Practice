package com.example.crudapi;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class TaskService {
    @Autowired
    private TaskRepository taskrepo;

    public List<Task> getAllTask() {
        return taskrepo.findAll();
    }

    public Optional<Task> getTaskById(Long id) {
        return taskrepo.findById(id);
    }

    public Task createTask(Task task) {
        return taskrepo.save(task);
    }

    public void deleteTask(Long id) {
        taskrepo.deleteById(id);
    }
}
