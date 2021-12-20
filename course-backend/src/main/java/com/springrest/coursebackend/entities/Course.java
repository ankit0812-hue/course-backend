package com.springrest.coursebackend.entities;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    private String title;
    private String description;
    @Id
    private long courseId;
    private double cost;

    public Course(String title, String description, long courseId, double cost) {
        super();
        this.title = title;
        this.description = description;
        this.courseId = courseId;
        this.cost = cost;
    }

    public Course() {
        super();
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setId(long courseId) {
        this.courseId = courseId;
    }

    public long getId() {
        return courseId;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return cost;
    }

    @Override
    public String toString() {
        return "Course [courseId=" + courseId + ", cost=" + cost + ", title=" + title + ", description=" + description
                + "]";
    }
}
