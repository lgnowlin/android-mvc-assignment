package com.ualr.simpletasklist.model;

import java.util.HashMap;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    private String taskDescription;
    private String taskStatus;

    // TODO 02. Define the class constructor and the corresponding getters and setters.
    public Task(String taskDescription, String taskStatus) {
        this.taskDescription = taskDescription;
        this.taskStatus = taskStatus;
    }
    public String getTaskDescription() {
        return taskDescription;
    }
    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }
    public String getTaskStatus() {
        return taskStatus;
    }
    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

}
