package com.ubforge.ubforge.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ubforge.ubforge.model.Issue;
import com.ubforge.ubforge.service.IssueService;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
public class IssueController {
    @Autowired
    private IssueService issueService;

    //create issue
    @PostMapping("/api/createIssue")
    public ResponseEntity<Void> createIssue(@RequestBody Issue issue) {
        issueService.createIssue(issue);
        return ResponseEntity.ok().build();
    }

    //get issue
    @GetMapping("/api/getAllIssues")
    public ResponseEntity<Iterable<Issue>> getAllIssues() {
        return ResponseEntity.ok(issueService.getAllIssues());
    }

    //update issue
    @PostMapping("/api/updateIssue")
    public ResponseEntity<Void> updateIssue(@RequestBody Issue issue) {
        issueService.updateIssue(issue);
        return ResponseEntity.ok().build();
    }

}
