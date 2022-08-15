package by.itacademy.task5.multarray;

import java.util.Random;

public class Task30ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        int[][] array30 = new int[n][m];

        Random random30 = new Random();
        for (int i = 0; i < array30.length; i++) {
            int sum5 = 0;
            for (int j = 0; j < array30[i].length; j++) {
                array30[i][j] = random30.nextInt(16);

                if (array30[i][j] == 5) {
                    sum5++;
                    // System.out.println("sum5=" + sum5 + " i =" + i);
                }
                if (sum5 >= 3 && (j == (array30[i].length - 1))) {
                    int row = i + 1;
                    System.out.println("Figure 5 appears " + sum5 + "  times in row = " + row);
                    //System.out.println();
                }
            }
        }
        System.out.println();
        for (int i = 0; i < array30.length; i++) {
            int sum5 = 0;
            for (int j = 0; j < array30[i].length; j++) {

                System.out.printf("[%3d]", array30[i][j]);

            }
            System.out.println();
        }
    }
}
