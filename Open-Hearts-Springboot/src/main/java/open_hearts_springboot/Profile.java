package open_hearts_springboot;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Profile {
    
    private String name; //Name
    private boolean scammer; //bool for if they are a scammer or not
    Map<String, List<String>> dialogues; // Holds all dialogues for this profile

    public Profile() {
        this.name = "";
        this.scammer = false;
        this.dialogues = new HashMap<String, List<String>>();
    }

    public Profile(String name, boolean scammer, Map<String, List<String>> dialogues) {
        this.name = name;
        this.scammer = scammer;
        this.dialogues = dialogues;
    }

    //TEMPORARY TEST CONSTRUCTOR 
    public Profile(String name, boolean scammer, String message) {
        this.name = name;
        this.scammer = scammer;
        //this.messageOne = message;
    }

    public String getName() {
        return this.name;
    }

    public boolean isScammer() {
        return this.scammer;
    }

    /*
    public String getMessageOne() {
        return this.messageOne;
    }
    */

    public Map<String, List<String>> getDialogues() {
        return this.dialogues;
    }

    public List<String> getOption(int option) {
        return this.dialogues.get("option" + option);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void isScammer(boolean scammer) {
        this.scammer = scammer;
    }

    /*
    public String getMessageOne() {
        return this.messageOne;
    }
    */

    public void setDialogues(Map<String, List<String>> dialogues) {
        this.dialogues = dialogues;
    }
}

