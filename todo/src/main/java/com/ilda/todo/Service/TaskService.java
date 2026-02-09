package com.ilda.todo.Service;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ilda.todo.Dto.TaskDto;
import com.ilda.todo.Entity.Task;
import com.ilda.todo.Mapper.TaskMapper;
import com.ilda.todo.Repo.TaskRepo;

@Service
public class TaskService {

    @Autowired
    TaskRepo taskRepository;

    @Autowired
    TaskMapper taskMapper;

    // Returns all the tasks

    public List<Task> getAllTasks(){

        return taskRepository.findAll();

    }

    // Returns the task by id

    public Optional<Task> getTaskById(Long id){

        return taskRepository.findById(id);

    }

    // Create a task

    public void createTask(Task task){

        taskRepository.save(task);

    }

    // Update a task by id

    public void updateTask(Long id, TaskDto taskDto){

        Task task = new Task();

        task = taskMapper.toEntity(taskDto);
        task.setId(id);

        taskRepository.save(task);

    }
    
    // Delete Task by id

    public void deleteTask(Long id){
       
        taskRepository.deleteById(id);

    }

    

}
