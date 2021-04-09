package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication


@RestController
public class StringApplication {

	public static void main(String[] args) {
		SpringApplication.run(StringApplication.class, args);
	}
	
	 @RequestMapping("/")
     public String hello() { 
		 return "Hello Coding Dojo Peeps!";
	 }
	 
	 @RequestMapping("/random")
     public String random() { 
		 return "Did you know Java is Ray's least favorite language thus far? But after Spring, he may start to like it.";
	 }

}
