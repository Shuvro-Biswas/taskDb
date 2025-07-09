package com.library_management.project_library.service;

import com.library_management.project_library.entity.Task;
import com.library_management.project_library.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    @Autowired
    private TaskRepository taskRepository;

    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    public Task getTaskById(Long id) {
        return taskRepository.findById(id).orElse(null);
    }

    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }

    public void deleteTask(Long id) {
        taskRepository.deleteById(id);
    }

    public void markAsCompleted(Long id) {
        Task task = getTaskById(id);
        if (task != null) {
            task.setCompleted(true);
            taskRepository.save(task);
        }
    }
}



