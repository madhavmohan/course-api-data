package io.madhav;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;

import io.madhav.topic.TopicRepository;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class })
public class CourseApiDataApplication {

	public static void main(String[] args) {
	SpringApplication.run(CourseApiDataApplication.class, args);
		
		
	}

}
