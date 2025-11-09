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

    /*
     * Retrieves a random profile from the database
     */
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

    /*
	 * Retrieves full list of profile-specific user options for the initial menu
	 */
	@GetMapping("/userOptions")
    public ResponseEntity<List<String>> getUserOptions(
		@RequestParam int profileId
    ) {
        List<String> userOptions = profileService.getUserOptions(profileId);
        return ResponseEntity.ok(userOptions);
    }

    /*
	 * Retrieves a list of lists, with each list containing pairs of user responses to 
     * profile dialogue
	 */
	@GetMapping("/userResponses")
    public ResponseEntity<List<List<Responses>>> getUserResponses(
		@RequestParam int profileId
    ) {
        List<List<Responses>> userResponses = profileService.getUserResponses(profileId);
        return ResponseEntity.ok(userResponses);
    }

    /*
	 * Retrieves a list of possible endings for the profile; success or failure
	 */
	@GetMapping("/ending")
    public ResponseEntity<String> getEnding(
		@RequestParam int profileId
    ) {
        String ending = profileService.getEnding(profileId);
        return ResponseEntity.ok(ending);
    }
}