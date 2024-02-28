package com.example.workflow;

import java.util.HashMap;
import java.util.Map;
import org.camunda.bpm.engine.ProcessEngines;
import org.camunda.bpm.engine.RuntimeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

  public static void main(String... args) {
    SpringApplication.run(Application.class, args);
  }

  @Override
  public void run(String... args) throws Exception {
   RuntimeService rs = ProcessEngines.getDefaultProcessEngine().getRuntimeService();

      Map<String, Object> variables = new HashMap<String, Object>();
      variables.put("inputArray", new Integer[]{5, 23, 42});
    rs.startProcessInstanceByKey("my-script-task-process", variables);

  }
}