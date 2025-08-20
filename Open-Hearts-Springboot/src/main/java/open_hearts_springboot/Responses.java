package open_hearts_springboot;

/**
 * Represents a pair of user responses to the profile dialogue.
 * Can be expanded to include more choices or additional functionality in the future.
 */
public class Responses {
    private String response1;
    private String response2;

    public Responses() {
        this.response1 = "";
        this.response2 = "";
    }

    public Responses(String response1, String response2) {
        this.response1 = response1;
        this.response2 = response2;
    }

    public String getResponse1() {
        return response1;
    }

    public String getResponse2() {
        return response2;
    }
}
