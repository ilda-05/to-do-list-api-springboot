package com.ilda.todo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ilda.todo.Entity.Task;

@Repository
public interface TaskRepo extends JpaRepository<Task,Long>{

}
