package com.crud.task;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskrepo;

    public Task createTask(Task entity) {
        return taskrepo.save(entity);
    }

    public Task findById(Long id) {
        return taskrepo.findById(id).orElse(null);
    }
    public List<Task> getAllTask() {
        return taskrepo.findAll();
    }
    public void deleteTaskById(Long id) {
        taskrepo.deleteById(id);
    }
    public void deleteAllTask() {
        taskrepo.deleteAll();
    }

}
