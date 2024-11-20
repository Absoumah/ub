package com.ubforge.ubforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import com.ubforge.ubforge.model.Task;
import com.ubforge.ubforge.service.TaskService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TaskController {
    @Autowired
    private TaskService taskService;

    @PostMapping("/api/createTask")
    public ResponseEntity<Void> createTask(@RequestBody Task task) {
        taskService.createTask(task);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/getAllTasks")
    public ResponseEntity<Iterable<Task>> getAllTasks() {
        return ResponseEntity.ok(taskService.getAllTasks());
    }

    @PostMapping("/api/updateTask")
    public ResponseEntity<Void> updateTask(@RequestBody Task task) {
        taskService.updateTask(task);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/api/deleteTask")
    public ResponseEntity<Void> deleteTask(@RequestBody int id) {
        taskService.deleteTask(id);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/getTaskById")
    public ResponseEntity<Task> getTaskById(@RequestBody int id) {
        return ResponseEntity.ok(taskService.getTaskById(id));
    }

    
    
}
