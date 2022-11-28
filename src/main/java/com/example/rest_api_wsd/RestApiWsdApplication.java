package com.example.rest_api_wsd;

import com.example.rest_api_wsd.repository.TaskRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2             // enable swagger-ui app
@SpringBootApplication
public class RestApiWsdApplication {
    public static void main(String[] args) {
        SpringApplication.run(RestApiWsdApplication.class, args);
        TaskRepository.TASKS.forEach(System.out::println);
    }

}
