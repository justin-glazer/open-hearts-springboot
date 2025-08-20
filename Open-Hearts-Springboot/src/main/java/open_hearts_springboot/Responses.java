package open_hearts_springboot;

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
