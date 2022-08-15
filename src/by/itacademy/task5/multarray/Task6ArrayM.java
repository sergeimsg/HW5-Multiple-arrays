package by.itacademy.task5.multarray;

import java.util.Random;

public class Task6ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array6 = new int[n][n];
        Random rand6 = new Random();
        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                array6[i][j] = rand6.nextInt(100);
                System.out.printf("[%3d]\t", array6[i][j]);
            }
            System.out.println();
        }
        for (int j = 0; j < array6[0].length; j++) {
            if (j % 2 == 1 && array6[0][j] > array6[array6.length - 1][j]) {
                for (int ii = 0; ii < array6.length; ii++) {
                    System.out.printf("{%3d}\n", array6[ii][j]);

                }
                System.out.println("//////////");
            }
        }

        for (int i = 0; i < array6.length; i++) {
            for (int j = 0; j < array6[i].length; j++) {
                if (j % 2 == 1 && array6[0][j] > array6[array6.length - 1][j]) {
                    System.out.printf("%3d", array6[i][j]);
                } else {
                    System.out.printf("   ");
                }
            }
            System.out.println();
        }
    }
}