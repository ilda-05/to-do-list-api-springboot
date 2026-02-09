package com.ilda.todo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilda.todo.Entity.Task;
import com.ilda.todo.Repo.TaskRepo;

@Service
public class TaskService {

    @Autowired
    TaskRepo taskRepository;

    public List<Task> getAllTasks(){

        return taskRepository.findAll();

    }

    public void createTask(Task task){

        taskRepository.save(task);
        System.out.println(task);

    }

}
