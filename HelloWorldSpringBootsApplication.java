package sabareesh.Hello.world.spring.boots;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration

public class HelloWorldSpringBootsApplication {
	@RequestMapping("/")
	String home() {
		return "<h1>Hello World By Spring Boot</h1>";
	}
	@RequestMapping("/new")
	String newform() {
		return "<h2>Thi is a new form</h2>";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloWorldSpringBootsApplication.class, args);
	}

}
