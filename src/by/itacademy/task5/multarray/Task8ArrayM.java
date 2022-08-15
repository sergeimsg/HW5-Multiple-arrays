package by.itacademy.task5.multarray;

import java.util.Random;

public class Task8ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int m = 8;
        int[][] array8 = new int[m][n];
        Random rand6 = new Random();
        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                array8[i][j] = rand6.nextInt(10);
                System.out.printf("[%3d]\t", array8[i][j]);
            }
            System.out.println();
        }
        int sum =0;
        for (int i = 0; i < array8.length; i++) {
            for (int j = 0; j < array8[i].length; j++) {
                if (array8[i][j]==7)
                {
                    sum++;
                    System.out.println("array8["+i+"]["+j+"] = "+array8[i][j]+" sum = "+sum);
                }
            }

        }
        System.out.println("sum = " + sum);
    }
}
