package open_hearts_springboot;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")

public class ProfileController {
	private final ProfileService profileService;

    public ProfileController(ProfileService profileService) {
        this.profileService = profileService;
    }

	@GetMapping("/profile")
    public ResponseEntity<Profile> getRandomProfile() {
        Profile profile = profileService.getRandomProfile();
        return ResponseEntity.ok(profile);
    }

	/*
	 * Retrieves a dialogue branch for a specific profile based on the option key
	 * (which is decided by the dialogue initially chosen by the user)
	 */
	@GetMapping("/dialogue")
    public ResponseEntity<List<String>> getDialogue(
		@RequestParam int profileId,
		@RequestParam String option
    ) {
        List<String> dialogue = profileService.getDialogueBranch(profileId, option);
        return ResponseEntity.ok(dialogue);
    }
}