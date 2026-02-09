package com.ilda.todo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.ilda.todo.Entity.Task;
import com.ilda.todo.Service.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/get-all")
    public List<Task> getMethodName() {
        return taskService.getAllTasks();
    }

    @PostMapping("/add-task")
    public void createTask(@RequestBody Task task) {
        System.out.println(task);
        taskService.createTask(task);
    }
    

}
