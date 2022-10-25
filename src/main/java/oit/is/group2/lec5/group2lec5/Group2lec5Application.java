package oit.is.group2.lec5.group2lec5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;
import org.springframework.scheduling.annotation.EnableScheduling;

@EnableAsync
@EnableScheduling
@SpringBootApplication
public class Group2lec5Application {

  public static void main(String[] args) {
    SpringApplication.run(Group2lec5Application.class, args);
  }

}
