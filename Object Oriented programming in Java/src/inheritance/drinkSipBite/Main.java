package inheritance.drinkSipBite;

public class Main {
    public static void main(String[] args) {
        Object var1 = new Bite();
        Gulp var2 = new Gulp();
        Gulp var3 = new Sip();
        Bite var4 = new Drink();
        Object var5 = new Gulp();
       // Gulp var6 = new Drink(); compilation error

    }
}
