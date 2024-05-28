package com.example.springboot.k8s;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootK8sExampleUsingYamlConfigurationApplication {

	@GetMapping("/sample")
	public String example(){
		return "Deploying spring boot application by dockerzing and using kubernetes!!";
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringbootK8sExampleUsingYamlConfigurationApplication.class, args);
	}

}
