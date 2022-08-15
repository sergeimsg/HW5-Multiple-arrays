package by.itacademy.task5.multarray;

import java.util.Random;

public class Task32ArrayM {
    public static void main(String[] args) {
        int n = 5;
        int[][] array32 = new int[n][n];
        Random random32 = new Random();
        int max = 0;
        int out = 0;
        System.out.println("Random array");

        for (int i = 0; i < array32.length; i++) {

            for (int j = 0; j < array32[i].length; j++) {

                array32[i][j] = random32.nextInt(100);

                if (array32[i][j] % 3 == 0) {
                    array32[i][j] = -array32[i][j];
                }
                System.out.printf("[%2d]\t", array32[i][j]);
            }
            System.out.println();
        }

        for (int i = 0; i < array32.length; i++) {

            for (int j = 1; j < array32[i].length; j++) {

                out = array32[i][j];

                int k = j;
                //System.out.println("array32[i][" + k + "]" + array32[i][k] + " out" + out + " array32[i][k - 1] " + array32[i][k - 1]);
                while (k > 0 && array32[i][k - 1] >= out) {
                    array32[i][k] = array32[i][k - 1];
                  //  System.out.println("-- array32[ " + i + " ][ " + k + "] " + array32[i][k]);
                    k--;
                }
                array32[i][k] = out;
               // System.out.println("array32[ " + i + " ][ " + k + "] " + array32[i][k]);

            }
        }
        System.out.println("Sorted array by rows from min to max");

        for (int i = 0; i < array32.length; i++) {
            for (int j = 0; j < array32[i].length; j++) {

                System.out.printf("[%2d]\t", array32[i][j]);
            }
            System.out.println();
        }

        System.out.println("Sorted array by rows from max to min");
        for (int i = 0; i < array32.length; i++) {
            for (int j = array32[i].length-1; j >=0 ; j--) {

                System.out.printf("[%2d]\t", array32[i][j]);
            }
            System.out.println();
        }

    }
}
