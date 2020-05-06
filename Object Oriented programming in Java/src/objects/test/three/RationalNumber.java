package objects.test.three;

/*
3. The method multiply multiplies the numerator of this RationalNumber by the numerator of r, and the denominator
of this RationalNumber by the denominator of r. Which of the following can be used to replace * missing code * so
that the multiply() method will work as intended?
 */
public class RationalNumber {
    private int num;

    private int den; //den!=0

    public static void main(String[] args) {
        RationalNumber number = new RationalNumber(6, 3);
        number.multiply(number);
        System.out.println(number.num);
        System.out.println(number.den);
    }

    /**
     * Constructs a RationalNumber object.
     *
     * @param n the numerator
     * @param d the denominator
     *          Precondition: d != 0
     */

    public RationalNumber(int n, int d) {
        num = n;
        den = d;
    }

    /**
     * Multiplies this RationalNumber by r.
     *
     * @param r a RationalNumber object
     *          Precondition: this.den() !=0
     */

    public void multiply(RationalNumber r) {
        /*missing code*/
        num = num * r.getNum();
        den = den * r.getDen();

    }

    /**
     * @return the numerator
     */
    public int getNum() {
      //implementation not shown
        return num;
    }

    /**
     * @return the denominator
     */
    public int getDen() {
        //implementation not shown
        return den;
    }
}
