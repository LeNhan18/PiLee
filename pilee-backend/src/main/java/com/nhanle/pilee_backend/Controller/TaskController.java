package com.nhanle.pilee_backend.Controller;

import com.nhanle.pilee_backend.Model.Task;
import com.nhanle.pilee_backend.Repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
    @Autowired
    private TaskRepository taskRepository;

    @GetMapping("")
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    @PostMapping("")
    public Task createTask(@RequestBody Task task) {
        return taskRepository.save(task);
    }
} 