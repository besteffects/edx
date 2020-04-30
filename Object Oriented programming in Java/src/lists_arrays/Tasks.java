package lists_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {


    public static void main(String[] args) {
        /* 1 Assume that a two-dimensional rectangular array of integers called data has been declared with four rows and seven columns.
     Write a for loop to initialize the third row of data to store the numbers 1 through 7.
     */
        initializeTwoDLoop();

        //2
        ArrayList<Integer> mystery3List = new ArrayList<Integer>();
        mystery3List.add(10);
        mystery3List.add(20);
        mystery3List.add(30);
        mystery3List.add(40);
        mystery3(mystery3List);
        mystery3(new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5, 6)));

        /*3  Write a method removeEvenLength that takes an ArrayList of Strings as a parameter and that removes all of the
        strings of even length from the list.
         */
        ArrayList<String> stringList = new ArrayList<String>() {
            {
                add("One");
                add("Two");
                add("Three");
                add("Four");
                add("Five");
                add("1111");
                add("11");
                add("big");
            }
        };
        removeEvenLength(new ArrayList<String>(stringList));
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


    static void mystery3(ArrayList<Integer> list) {
        for (int i = list.size() - 2; i > 0; i--) {
            int a = list.get(i);
            int b = list.get(i + 1);
            list.set(i, a + b);
        }
        System.out.println("Show list: " + list);
    }

    static void removeEvenLength(ArrayList<String> list) {
        for (int i = 0; i < list.size(); i++) {
            if ((list.get(i)).length() % 2 == 0) {
                list.remove(i); //list becomes shorter, so decrease of index variable after removal is required
                i--;
            }
        }
        System.out.println(list);
    }

}
