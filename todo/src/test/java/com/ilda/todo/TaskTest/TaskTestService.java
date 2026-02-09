package com.ilda.todo.TaskTest;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.ilda.todo.Entity.Task;
import com.ilda.todo.Repo.TaskRepo;
import com.ilda.todo.Service.TaskService;

@ExtendWith(MockitoExtension.class)
public class TaskTestService {

    @Mock
    private TaskRepo taskRepo;

    @InjectMocks
    private TaskService taskService;

    @Test
    public void getAllTasksOneTask(){

        Task task = new Task();

        task.setId(1l);
        task.setName("Prova");
        task.setDescription("Prova Descrizione");
        task.setChecked(false);


        when(this.taskRepo.findAll())
                .thenReturn(List.of(task));

        List<Task> result = taskService.getAllTasks();

            
        assertEquals(1,result.size());
        


    }

}
