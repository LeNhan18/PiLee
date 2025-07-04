package com.nhanle.pilee_backend.Model;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
public class Task {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;
    private String description;
    private LocalDateTime dueDate;
    private String priority; // LOW, MEDIUM, HIGH
    private String status;   // TODO, IN_PROGRESS, DONE, OVERDUE

    @ManyToOne
    @JoinColumn(name = "creator_id")
    private User creator;

    // Getter, Setter
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }
    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }
    public String getDescription() { return description; }
    public void setDescription(String description) { this.description = description; }
    public LocalDateTime getDueDate() { return dueDate; }
    public void setDueDate(LocalDateTime dueDate) { this.dueDate = dueDate; }
    public String getPriority() { return priority; }
    public void setPriority(String priority) { this.priority = priority; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public User getCreator() { return creator; }
    public void setCreator(User creator) { this.creator = creator; }
} 