package inheritance.test;

public class Dog extends Pet {
    private String b;
    public Dog (String color, int weight, String breed){
        super(color, weight);
        b = breed;
    }
}
