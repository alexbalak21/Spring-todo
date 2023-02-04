package com.alex.Springtodo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


@SpringBootApplication
public class SpringTodoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringTodoApplication.class, args);
	}
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer(){
			public void addCorsMapping(CorsRegistry registry){
				registry.addMapping("/**").allowedOrigins("/**");
			}
		};
	}



}
