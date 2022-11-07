package com.example.rest_api_wsd.model;

import lombok.*;

import java.time.LocalDateTime;

@Data                       // generate code for get/set/toString/equals
@NoArgsConstructor
public class Task {
    private static int globalId;        // is connected with the class but not with the object
    private int taskId;
    private String title;
    private LocalDateTime startDate;
    private LocalDateTime stopDate;
    private Category category;

    public Task(String title, LocalDateTime stopDate, Category category) {
        this.taskId = ++globalId;       // first increments and next assigns to variable
        this.title = title;
        this.stopDate = stopDate;
        this.category = category;
        this.startDate = LocalDateTime.now();
    }
}
