package com.shihabtest.superspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;
import io.micrometer.core.annotation.Timed;
import org.springframework.web.bind.annotation.GetMapping;

@SpringBootApplication
@RestController
public class Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Application.class, args);
    }

  @Timed(
    value = "welcome_api",
    histogram = true,
    extraTags = {"version", "1.0"}
  )
  @GetMapping("/welcome")
  public String welcomeController() {
    return "Welcome API working......";
  }
}
