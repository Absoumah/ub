package com.ubforge.ubforge.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int task_id;
    private String task_title;
    private String task_description;
    private String task_status;
    //private Issue issue;
    //private User task_autor;

    
    // public Issue getIssue() {
    //     return issue;
    // }

    // public void setIssue(Issue issue) {
    //     this.issue = issue;
    // }

    // public User getTask_autor() {
    //     return task_autor;
    // }

    // public void setTask_autor(User task_autor) {
    //     this.task_autor = task_autor;
    // }

    public int getTask_id() {
        return task_id;
    }

    public void setTask_id(int task_id) {
        this.task_id = task_id;
    }

    public String getTask_title() {
        return task_title;
    }

    public void setTask_title(String task_title) {
        this.task_title = task_title;
    }

    public String getTask_description() {
        return task_description;
    }

    public void setTask_description(String task_description) {
        this.task_description = task_description;
    }

    public String getTask_status() {
        return task_status;
    }

    public void setTask_status(String task_status) {
        this.task_status = task_status;
    }
}
