package by.itacademy.task5.multarray;

import java.util.Random;

public class Task24ArrayM {
    public static void main(String[] args) {
        int n = 6;                            // matrix size
        Random random24 = new Random();
        int[][] array24 = new int[n][n];
        for (int i = 0; i < 1; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                array24[i][j]= random24.nextInt(10);
                System.out.print("  array24["+i+"]["+j+"] = " + array24[i][j]);  // first row with any figures
            }
            System.out.println();
        }
        System.out.println("*******************************************************");

        for (int i = 1; i < array24.length; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                array24[i][j] = (int) Math.pow((array24[0][j]),i+1);

                }
            }

        for (int i = 0; i < array24.length; i++) {
            for (int j = 0; j < array24[i].length; j++) {
                System.out.printf("[%2d]\t", array24[i][j]);
            }
            System.out.println();
        }

    }

}
