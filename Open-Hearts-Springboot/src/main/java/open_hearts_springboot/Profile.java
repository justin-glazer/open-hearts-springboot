package open_hearts_springboot;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    
    private String name, location, career;
    private List<String> hobbies;
    private int profileId, age;
    private boolean scammer; //bool for if they are a scammer or not
    Map<String, List<String>> dialogues; // Holds all dialogues for this profile

    public Profile() {
        this.name = "";
        this.scammer = false;
        this.dialogues = new HashMap<String, List<String>>();
        this.profileId = -1;
        this.age = -1;
        this.hobbies = new ArrayList<>();
        this.location = "";
        this.career = "";
    }

    public Profile(String name, boolean scammer, Map<String, List<String>> dialogues, int profileId, int age, List<String> hobbies, String location, String career) {
        this.name = name;
        this.scammer = scammer;
        this.dialogues = dialogues;
        this.profileId = profileId;
        this.age = age;
        this.hobbies = hobbies;
        this.location = location;
        this.career = career;
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
}

