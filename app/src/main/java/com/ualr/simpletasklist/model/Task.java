package com.ualr.simpletasklist.model;

public class Task {

    // TODO 01. Define two attributes for the Task class: one to store the task description and a second one that
    //  indicates whether the task is done or not
    private String statusOfTask;
    private boolean doneOrNot;

    // TODO 02. Define the class constructor and the corresponding getters and setters.
    public Task(String statusOfTask, boolean doneOrNot) {
        this.statusOfTask = statusOfTask;
        this.doneOrNot = doneOrNot;
    }
    public String getStatusOfTask() {
        return statusOfTask;
    }
    public void setStatusOfTask(String statusOfTask) {
        this.statusOfTask = statusOfTask;
    }
    public boolean isDoneOrNot() {
        return doneOrNot;
    }
    public void setDoneOrNot(boolean doneOrNot) {
        this.doneOrNot = doneOrNot;
    }
}
