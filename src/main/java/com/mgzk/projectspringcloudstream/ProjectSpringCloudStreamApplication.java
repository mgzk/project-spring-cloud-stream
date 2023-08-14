package com.mgzk.projectspringcloudstream;

import java.util.function.Function;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ProjectSpringCloudStreamApplication {

  Logger logger = LoggerFactory.getLogger(ProjectSpringCloudStreamApplication.class);

  public static void main(String[] args) {
    SpringApplication.run(ProjectSpringCloudStreamApplication.class, args);
  }

  @Bean
  public Function<String, String> uppercase() {
    return message -> {
      logger.info("Received message: " + message);
      return message.toUpperCase();
    };
  }
}
