package objects;

public class Name {
    private String firstName;
    private String lastName;
    private char middleInitial;

    public Name(String first, char middle, String last) {
        firstName = first;
        middleInitial = middle;
        lastName = last;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public char getMiddleInitial() {
        return middleInitial;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setMiddleInitial(char middleInitial) {
        this.middleInitial = middleInitial;
    }
}
