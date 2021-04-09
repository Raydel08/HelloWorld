package com.example.demo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DojoController {
   
	
	@RequestMapping("/{wordInput}")
	
	public String showlocation(@PathVariable("wordInput") String wordInput ) {
		System.out.println(wordInput);
		if(wordInput.equals("dojo")){
			return "The dojo is awesome!'";
		}
		else if (wordInput.equals("burbank-dojo")) {
			return "Burbank Dojo is located in Southern California";
		}
		else if (wordInput.equals("san-jose")) {
			return "SJ dojo is the headquarters";
		}
		else {
			return "Sorry what you are looking for can not be found";
		}
		
	}
}