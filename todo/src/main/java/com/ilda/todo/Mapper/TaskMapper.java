package com.ilda.todo.Mapper;

import org.springframework.stereotype.Component;

import com.ilda.todo.Dto.TaskDto;
import com.ilda.todo.Entity.Task;

@Component
public class TaskMapper {

    public TaskDto toDto(Task task){

        TaskDto taskDto = new TaskDto();

        taskDto.setName(task.getName());
        taskDto.setDescription(task.getDescription());
        taskDto.setChecked(task.isChecked());

        return taskDto;

    }

    public Task toEntity(TaskDto taskDto){

        Task task = new Task();

        task.setName(taskDto.getName());
        task.setDescription(taskDto.getDescription());
        task.setChecked(taskDto.isChecked());

        return task;

    }

}
