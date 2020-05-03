package objects.test.fourFive;

public class Dog {
    private int age;
    private String name;

    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public Dog(String name) {
        this.age = 0;
        this.name = name;
    }

    public static void main(String[] args) {
        //Dog dog1= new Dog("Max",8); error
        Dog dog2 = new Dog(15, "Toby");
        Dog dog3 = new Dog("Gus");
    }
}
