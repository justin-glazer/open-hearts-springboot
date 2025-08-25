package open_hearts_springboot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    
    private String name, location, career;
    private List<String> hobbies;
    private int profileId, age;
    private boolean scammer;
    Map<String, List<String>> dialogues; // Holds all profile-side dialogues
    List<String> userOptions; // Represents the initial menu options for the user, decides which dialogue branch to take
    String ending; // A paragraph of red flags/green flags to be displayed in the ending screen

    /*
     * Holds a list for every conversation the user can have with this profile
     * Each list contains pairs of user responses to profile dialogue, represented
     * by the Responses class
     */
    List<List<Responses>> userResponses;

    /*
     * Default constructor (should not be used)
     */
    public Profile() {
        this.name = "";
        this.scammer = false;
        this.dialogues = new HashMap<String, List<String>>();
        this.profileId = -1;
        this.age = -1;
        this.hobbies = new ArrayList<>();
        this.location = "";
        this.career = "";
        this.userOptions = new ArrayList<>();
        this.userResponses = new ArrayList<>();
        this.ending = "";
    }

    /*
     * Full constructor (initialized in ProfileService.java)
     */
    public Profile(String name, boolean scammer, Map<String, List<String>> dialogues, List<String> userOptions, String ending, List<List<Responses>> userResponses, int profileId, int age, List<String> hobbies, String location, String career) {
        this.name = name;
        this.scammer = scammer;
        this.dialogues = dialogues;
        this.profileId = profileId;
        this.age = age;
        this.hobbies = hobbies;
        this.location = location;
        this.career = career;
        this.userOptions = userOptions;
        this.userResponses = userResponses;
        this.ending = ending;
    }

    public String getName() {
        return this.name;
    }

    public boolean isScammer() {
        return this.scammer;
    }

    public Map<String, List<String>> getDialogues() {
        return this.dialogues;
    }

    public List<String> getOption(String optionKey) {
        return this.dialogues.get(optionKey);
    }

    public void isScammer(boolean scammer) {
        this.scammer = scammer;
    }

    public int getProfileId() {
        return this.profileId;
    }

    public int getAge() {
        return this.age;
    }

    public String getCareer() {
        return this.career;
    }

    public String getLocation() {
        return this.location;
    }

    public List<String> getHobbies() {
        return this.hobbies;
    }

    public List<String> getUserOptions() {
        return this.userOptions;
    }

    public List<List<Responses>> getUserResponses() {
        return this.userResponses;
    }

    public String getEnding() {
        return this.ending;
    }
}

