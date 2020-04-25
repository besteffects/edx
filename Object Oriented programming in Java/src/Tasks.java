import java.util.Arrays;

public class Tasks {
    /*
    Assume that a two-dimensional rectangular array of integers called data has been declared with four rows and seven columns.
     Write a for loop to initialize the third row of data to store the numbers 1 through 7.
     */
    public static void main(String[] args) {
        initializeTwoDLoop();
    }


    static void initializeTwoDLoop() {
        int[][] data = new int[4][7];
        int count = 1;
        for (int row = 2; row < 3; row++) {
            for (int col = 0; col < data[row].length; col++) {
                data[row][col] = count;
                count++;
            }
        }
        System.out.println(Arrays.deepToString(data));
    }
}
