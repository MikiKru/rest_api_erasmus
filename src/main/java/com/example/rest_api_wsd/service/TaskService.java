package com.example.rest_api_wsd.service;

import com.example.rest_api_wsd.model.Category;
import com.example.rest_api_wsd.model.Task;
import com.example.rest_api_wsd.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Service            // Spring stereotype for app logic implementations
public class TaskService {
    public List<Task> getAllTasks(){
        return TaskRepository.TASKS                                                 // List<Task>
                .stream()                                                           // Stream<Task>
                .sorted(Comparator.comparing(Task::getStopDate).reversed())        // direction DESC
                .collect(Collectors.toList());                                      // List<Task> - stream is closed!
    }
    public List<Task> getTasksByCategory(Category category){
        return TaskRepository.TASKS
                .stream()
                .filter(task -> task.getCategory() == category)
                .sorted(Comparator.comparing(Task::getStopDate).reversed())        // direction DESC
                .collect(Collectors.toList());                                      // List<Task> - stream is closed!
    }
}
