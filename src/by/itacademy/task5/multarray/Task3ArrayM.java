package by.itacademy.task5.multarray;

import java.util.Random;

public class Task3ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array33 = new int[n][n];
        Random rand3 = new Random();
        for (int i = 0; i < array33.length; i++) {
            for (int j = 0; j < array33[i].length; j++) {
                array33[i][j] = rand3.nextInt(100);
                System.out.printf("[%3d]\t",array33[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array33.length; i++) {
            System.out.printf("%3d\n", array33[i][0]);

        }
        for (int i = 0; i < array33.length; i++) {

            System.out.printf("\n\t%2d", array33[i][array33[i].length-1]);
        }

    }
}
