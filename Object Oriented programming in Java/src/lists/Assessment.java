package lists;

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
}
