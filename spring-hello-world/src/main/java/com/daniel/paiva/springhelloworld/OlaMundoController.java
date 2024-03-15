package com.daniel.paiva.springhelloworld;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OlaMundoController {
	
	@RequestMapping("/hello-world")
	public String olaMundo() {
		return "Ola Mundo!";
	}
}
