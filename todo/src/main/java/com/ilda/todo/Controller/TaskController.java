package com.ilda.todo.Controller;

import org.springframework.web.bind.annotation.RestController;

import com.ilda.todo.Dto.TaskDto;
import com.ilda.todo.Entity.Task;
import com.ilda.todo.Service.TaskService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;


@CrossOrigin(origins = "*")
@RestController
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping("/get-all")
    public List<Task> getAllTaks() {
        return taskService.getAllTasks();
    }

    @GetMapping("/get-by-id/{id}")
    public Task getTaskById(@PathVariable Long id) {
        return taskService.getTaskById(id).orElseThrow();
    }


    @PostMapping("/add-task")
    public void createTask(@RequestBody Task task) {
        taskService.createTask(task);
    }

    @PutMapping("update-task-name/{id}")
    public void putMethodName(@PathVariable Long id, @RequestBody TaskDto taskDto) {
        
        taskService.updateTask(id,taskDto);
        
    }

    @PutMapping("checked")
    public void checkTask(@RequestBody Long id) {
        
        taskService.checkTask(id);
        
    }
    

}
