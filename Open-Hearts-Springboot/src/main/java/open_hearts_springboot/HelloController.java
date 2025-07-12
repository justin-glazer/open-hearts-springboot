package open_hearts_springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;



@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class HelloController {
	@GetMapping("/hello")
	public ResponseEntity<String> fetchData() {
		return ResponseEntity.ok("Greetings from Spring Boot!");
	}

}