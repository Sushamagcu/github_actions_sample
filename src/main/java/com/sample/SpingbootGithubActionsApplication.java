package com.sample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpingbootGithubActionsApplication {
//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
	@GetMapping("/welcome")
	public String welcome() {
		return "Hello welcome to Spring boot application";
	}
	public static void main(String[] args) {
		SpringApplication.run(SpingbootGithubActionsApplication.class, args);
	}

}
