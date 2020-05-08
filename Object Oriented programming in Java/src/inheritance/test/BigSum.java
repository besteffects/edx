package inheritance.test;

public class BigSum extends Sum {
    public int doCalc() {
        int x = super.doCalc();
        return x + doAnotherCalc();
    }

    public int doAnotherCalc() {
        return 100;
    }

    public static void main(String[] args) {
        Sum s = new BigSum();
        System.out.println(s.doCalc());
    }
}
