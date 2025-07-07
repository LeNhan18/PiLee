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

    @GetMapping("/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Task updateTask(@PathVariable Long id, @RequestBody Task task) {
        Task existing = taskRepository.findById(id).orElse(null);
        if (existing != null) {
            existing.setTitle(task.getTitle());
            existing.setDescription(task.getDescription());
            existing.setDueDate(task.getDueDate());
            existing.setPriority(task.getPriority());
            existing.setStatus(task.getStatus());
            existing.setCreator(task.getCreator());
            return taskRepository.save(existing);
        }
        return null;
    }

    @DeleteMapping("/{id}")
    public void deleteTask(@PathVariable Long id) {
        taskRepository.deleteById(id);
    }
} 