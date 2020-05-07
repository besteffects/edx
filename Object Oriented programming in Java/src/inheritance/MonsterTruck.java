package inheritance;

public class MonsterTruck extends Truck {
    public void m1() {
        System.out.println("monster 1");
    }

    public void m2() {
        super.m1();
        super.m2();

    }

    public String toString() {
        return "monster " + super.toString();
    }

    public static void main(String[] args) {
        Car car = new Car();
        MonsterTruck ms = new MonsterTruck();
//        Truck track = new Truck();
        ms.m1();
        ms.m2();

    }
}
