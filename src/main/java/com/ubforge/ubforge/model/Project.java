package com.ubforge.ubforge.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long project_id;
    private String project__title;
    private String project_description;

    public String getDescription() {
        return project_description;
    }

    public void setDescription(String description) {
        this.project__title = description;
    }

    public Long getId() {
        return project_id;
    }

    public String getTitle() {
        return project__title;
    }

    public void setTitle(String title) {
        this.project__title = title;
    }



}
