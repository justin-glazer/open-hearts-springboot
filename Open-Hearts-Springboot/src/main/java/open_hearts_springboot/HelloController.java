package open_hearts_springboot;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;






@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class HelloController {
	Profile testProfile = new Profile("Test", true, "This is a test: testing ... 1 2 3");

	@GetMapping("/hello")
	public ResponseEntity<String> fetchData() {
		return ResponseEntity.ok("Greetings from Spring Boot!");
	}

	@PostMapping("/testOne")
	public ResponseEntity<String> testPerson1(@RequestBody String data) {
		return ResponseEntity.ok(data);
	}
	

	@PostMapping("/testTwo")
	public ResponseEntity<String> testPerson2(@RequestBody String data1, String data2) {
		int x = (int) (Math.random()*2);
		if (x == 1){
			return ResponseEntity.ok(data1);
		} else{
			return ResponseEntity.ok(data2);
		}
	}
	

}