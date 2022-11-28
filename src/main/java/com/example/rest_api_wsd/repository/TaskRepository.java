package com.example.rest_api_wsd.repository;

import com.example.rest_api_wsd.model.Category;
import com.example.rest_api_wsd.model.Task;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public interface TaskRepository {
    List<Task> TASKS = new ArrayList<>(
            Arrays.asList(
                    new Task("Learning Java", LocalDateTime.of(2022,12,1,10,0), Category.NEW),
                    new Task("Learning Python", LocalDateTime.of(2022,11,10,10,0), Category.IN_PROGRESS),
                    new Task("Learning PHP", LocalDateTime.of(2021,11,10,10,0), Category.IN_PROGRESS),
                    new Task("Clean coding", LocalDateTime.of(2022,11,2,10,0), Category.DONE)
            )
    );
}
