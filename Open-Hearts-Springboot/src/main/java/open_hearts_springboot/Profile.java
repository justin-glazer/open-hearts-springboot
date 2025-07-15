package open_hearts_springboot;

public class Profile {
    
    private String name; //Name
    private boolean scammer; //bool for if they are a scammer or not
    private String messageOne; //holds first message (test)

    public Profile() {
        this.name = "";
        this.scammer = false;
        this.messageOne = "";
    }

    public Profile(String name, boolean scammer) {
        this.name = name;
        this.scammer = scammer;
        this.messageOne = "";
    }

    //TEMPORARY TEST CONSTRUCTOR 
    public Profile(String name, boolean scammer, String message) {
        this.name = name;
        this.scammer = scammer;
        this.messageOne = message;
    }

    public String getName() {
        return this.name;
    }

    public boolean isScammer() {
        return this.scammer;
    }

    public String getMessageOne() {
        return this.messageOne;
    }
}
