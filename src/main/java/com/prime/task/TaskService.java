package com.prime.task;

import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TaskService {

    private final TaskRepository repo;

    // ✅ constructor injection (safe)
    public TaskService(TaskRepository repo) {
        this.repo = repo;
    }

    public Task createTask(Task task) {
        return repo.save(task);
    }

    public List<Task> getTasks() {
        return repo.findAll();
    }

    public void deleteTask(Long id) {
        repo.deleteById(id);
    }
}
