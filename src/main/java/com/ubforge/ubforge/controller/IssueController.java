package com.ubforge.ubforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ubforge.ubforge.model.Issue;
import com.ubforge.ubforge.service.IssueService;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//to do filter pagination and permission

@RestController
@RequestMapping("issue")
public class IssueController {
    @Autowired
    private IssueService issueService;


    @PostMapping("/create")
    public ResponseEntity<Void> createIssue(@RequestBody Issue issue) {
        issueService.createIssue(issue);
        return ResponseEntity.ok().build();
    }

    @GetMapping("/getAll")
    public ResponseEntity<Iterable<Issue>> getAllIssues() {
        return ResponseEntity.ok(issueService.getAllIssues());
    }

    //getById
    @GetMapping("/get/{id}")
    public ResponseEntity<Issue> getIssueById(@PathVariable int id) {
        return ResponseEntity.ok(issueService.getIssueById(id));
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Issue> updateIssue(@PathVariable int id, @RequestBody Issue issue) {
        return ResponseEntity.ok(issueService.updateIssue(id, issue));

    }

    //delete issue
    @DeleteMapping("/delete/{id}")
    public ResponseEntity<Void> deleteIssue(@PathVariable int id) {
        issueService.deleteIssue(id);
        return ResponseEntity.ok().build();
    }

}
