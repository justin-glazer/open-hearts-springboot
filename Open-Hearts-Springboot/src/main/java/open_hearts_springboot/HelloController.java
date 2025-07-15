package open_hearts_springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestParam;




@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class HelloController {
	Profile testProfile = new Profile("Test", true, "This is a test: testing ... 1 2 3");

	@GetMapping("/hello")
	public ResponseEntity<String> fetchData() {
		return ResponseEntity.ok("Greetings from Spring Boot!");
	}

	// @GetMapping("/test")
	// public ResponseEntity<String> testPerson() {
	// 	return ResponseEntity.ok();
	// }
	

}