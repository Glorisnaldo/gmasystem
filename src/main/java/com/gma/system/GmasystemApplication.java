package com.gma.system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class GmasystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(GmasystemApplication.class, args);
	}
		@GetMapping("/")
		public String index() {
			
			return "Conexão feita com sucesso";
		
		
}
}