package com.library_management.project_library.entity;

import jakarta.persistence.* ;

@Entity
public class Task {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;

    private String title;
    private String description;
    private boolean completed;

    public Task() {} //Constructor
    
    public Task(String title, String description){
        this.title = title;
        this.description=description;
        this.completed = false;
    }

    public Long getId(){return id;}
    public void setId(Long id) {this.id = id;};

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }

    public boolean isCompleted() { return completed; }
    public void setCompleted(boolean completed) { this.completed = completed; }

}
