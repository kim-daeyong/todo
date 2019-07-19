package com.project.todolist.service;


import com.project.todolist.domain.Task;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;


public interface TaskService {

    List<Task> getTasks();

    List<Task> getTasksByFindate();

    List<Task> getTasksByStatus();

    void addTask(Task task);

    void updateTaskStatus(Date todayDate);

    void delTask(long id);

    void updateTask(long id);
}
