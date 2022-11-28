package com.example.rest_api_wsd.controller;

import com.example.rest_api_wsd.model.Category;
import com.example.rest_api_wsd.model.Task;
import com.example.rest_api_wsd.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController         // Spring stereotype for http requests mapping
public class TaskController {
    TaskService taskService;
    @Autowired
    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }
    @GetMapping("/tasks")
    public List<Task> getAllTasks(){
        return taskService.getAllTasks();
    }
    @GetMapping("/tasks/category")
    public List<Task> getAllTasksByCategory(@RequestParam("category") Category category){
        return taskService.getTasksByCategory(category);
    }
}
