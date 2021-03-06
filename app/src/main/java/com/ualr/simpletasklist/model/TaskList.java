package com.ualr.simpletasklist.model;

import android.widget.TextView;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class TaskList {

    // TODO 03. Define TaskList's attributes. The class will have just one attribute to store all
    //  the tasks created by the user.
    private HashMap<Integer, Task> tasks = new HashMap<Integer, Task>();

    // TIP. We need a data structure able to dynamically grow and shrink. That's why we'll use a HashMap.
    // where keys will be integer values and the mapped values will be a task object

    // TODO 04. Define the class constructor and the corresponding getters and setters.
    public TaskList() {
        this.tasks = new HashMap<>();
    }
    public HashMap<Integer, Task> getTasks() {
        return tasks;
    }
    public void setTasks(HashMap<Integer, Task> tasks) {
        this.tasks = tasks;
    }

    // TODO 06.03. Define a new method called "add" that, given a task description, will create a
    //  new task and add it to the task list.
    public void add(Integer taskId, String taskDescription, Boolean taskStatus){
        tasks.put(taskId, new Task(taskDescription,taskStatus));
    }
    // TODO 06.04. Define a new "toString" method that provides a formatted string with all the tasks in the task list.
    // Format: 1 line per task. Each line should start with the id number of the task, then a dash, and the task description right after that.
    // If the task is marked as done, "Done" should be included at the end of the line

    public String toString(){
        Iterator<Map.Entry<Integer, Task>> it = tasks.entrySet().iterator();
        String output = "";
        for (HashMap.Entry<Integer,Task> entry : tasks.entrySet()){
            if(entry.getValue().isDoneOrNot() == false)
            output = output.concat("\n" + entry.getKey() + "-" + ((Task)entry.getValue()).getTaskDescription());
            else if (entry.getValue().isDoneOrNot() == true)
                output = output.concat("\n" + entry.getKey() + "-" + ((Task)entry.getValue()).getTaskDescription() + " Done");
        }
        return output;
    }

    // TODO 07.03. Define a new method called "delete" that, given a task id, will delete the
    //  corresponding task from the task list.
    public void delete(Integer taskId){
        tasks.remove(taskId);
    }
    // TODO 08.03. Define a new method called "markDone" that, given a task id, will mark the
    //  corresponding task as done.
    public void markDone(Integer taskId){
        Boolean doneOrNot = true;
        tasks.get(taskId).setDoneOrNot(doneOrNot);
    }
}
