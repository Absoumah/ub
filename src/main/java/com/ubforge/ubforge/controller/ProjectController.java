package com.ubforge.ubforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ubforge.ubforge.model.Project;
import com.ubforge.ubforge.service.ProjectService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@RestController
public class ProjectController {

    @Autowired
    private ProjectService projectService;

    @PostMapping("/api/createProject")
    public ResponseEntity<Void> createProject(@RequestBody Project project) {
        projectService.createProject(project);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/getProjectById")
    public ResponseEntity<Project> getProjectById(@RequestParam Long id) {
        return ResponseEntity.ok(projectService.getProjectById(id).get());
    }

    @GetMapping("/api/getAllProjects")
    public ResponseEntity<Iterable<Project>> getAllProjects() {
        return ResponseEntity.ok(projectService.getAllProjects());
    }

    @PostMapping("/api/updateProject")
    public ResponseEntity<Void> updateProject(@RequestBody Project project) {
        projectService.updateProject(project);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/api/deleteProject")
    public ResponseEntity<Void> deleteProject(@RequestParam Long id) {
        projectService.deleteProject(id);
        return ResponseEntity.ok().build();
    }
    
    
}
