package lists_arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class Assessment {


    public static void main(String[] args) {
        // 1)  2d array
        twoDimensions(new int[][]{{44, 45, 16, 50},
                {16, 12, 66, 9},
                {52, 83, 3, 37},
                {56, 61, 69, 61}});
        // 2)
        int[][] arr = {{0, 1, 2}, {3, 4, 5}, {6, 7, 8}};
        twoDimensions1(arr);
        System.out.println();
        printArray();
        //5
        int[] nums = {5, 3, 6, 8, 11, 2};
        change(nums);
        //7
        TwoDArrayCreate();
        //8
        int[] values = {1, 4, -7, -3};
        multiply(values, 2);
        //9
        print2Darray();
        //10 printArrayList
        printArrayList();

    }

    ;

    static void twoDimensions(int[][] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = 0; j < numbers[i].length - 1; j++) {
                if (numbers[i][j] < numbers[i][j + 1]) {
                    numbers[i][j] = numbers[i][j] + numbers[i + 1][j];
                    numbers[i + 1][j] = numbers[i + 1][j] / 2;
                }
            }
        }
        System.out.println(Arrays.deepToString(numbers));
    }

    static void twoDimensions1(int[][] arr) {
        System.out.println("Second task:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] % 2 == 0) {
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }

    static void printArray() {
        System.out.println("Third task: ");
        int[] anArray = new int[4];
        anArray[0] = 4;
        anArray[1] = 6;
        anArray[2] = 7;
        anArray[3] = 3;
        for (int j = 0; j < anArray.length; j++) {
            System.out.print(anArray[j] + " ");
        }
    }

    static void change(int[] arr) {
        int k = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (k < arr[i]) {
                arr[0] = arr[i];
                arr[i] = k;
                k = arr[0];
            }
        }
        System.out.println("Fifth task: ");
        System.out.print(Arrays.toString(arr));
    }

    static void TwoDArrayCreate() {
        System.out.println("Task 7");
        String[][] set = {{"Hello", "world!"}, {"world", "Hello "}, {"Hello", "!", "Hello"}};
        String hello1 = set[0][1] + set[1][0];
        String hello2 = set[1][1] + set[0][1];
        String hello3 = set[1][1] + set[1][0] + set[2][1];
        System.out.println(hello1 + " Second: " + hello2 + " Third: " + hello3);
    }

    static void multiply(int[] values, int amount) {
        System.out.println("Task 8");
        for (int i = 0; i < values.length; i++) {
            values[i] = values[i] + amount;
            // 1, 4, -7, -3; 2
            // 3,
        }
        for (int value : values) {
            System.out.print(" " + value);
        }
        // System.out.println(Arrays.toString(values));
    }

    static int[][] twoDArray = new int[3][3];

    static void print2Darray() {
        System.out.println();
        System.out.println("Task 9: ");
        int count = 0;
        //Reverse fill 2D array
        for (int row = twoDArray.length - 1; row >= 0; row--) {
            for (int col = twoDArray[row].length - 1; col >= 0; col--) {
                twoDArray[row][col] = count;
                count++;
            }
        }
        for (int j = 0; j < twoDArray.length; j++) {
            for (int i = 0; i < twoDArray[1].length; i++) {
                System.out.print(twoDArray[j][i] + " ");
            }
        }
    }

    static void printArrayList() {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        System.out.println();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3); //1,2,3
        numbers.remove(2); //1,2
        numbers.set(1, 0); //1,0
        numbers.add(5); //1,0,5
        numbers.remove(0);//0,5
        System.out.println("Task 10: " + numbers);
    }
}

