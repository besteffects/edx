package objects.test.fourFive;

public class Robot {
    private boolean fuelEmpty;
    private int roboID;
    private String greetings;
    private String securityProtocol;

    //Which of the following constructors creates an object that may immediately use all its methods without error?
    //Insert Robot constructor here
    public Robot(boolean full, int id, String greet, String proto) {
        fuelEmpty = full;
        roboID = id;
        greetings = greet;
        securityProtocol = proto;
    }

    public void destroyAllHumans() {
        while (fuelEmpty == false) {
            //robot begins to destroy
        }
    }

    public int getRoboID() {
        return roboID;
    }

    public void greet() {
        System.out.println(greetings);
    }

    public void setSecurityProtocol(String proto) {
        securityProtocol = proto;
    }

    public static void main(String[] args) {

    }
}
