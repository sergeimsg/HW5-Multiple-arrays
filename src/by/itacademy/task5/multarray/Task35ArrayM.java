package by.itacademy.task5.multarray;

import java.util.Random;

public class Task35ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int m = 10;
        Random random35 = new Random();
        int[][] array35 = new int[n][m];
        for (int i = 0; i < array35.length; i++) {
            for (int j = 0; j < array35[i].length; j++) {
                array35[i][j] = random35.nextInt(100);
                System.out.printf("[%3d]", array35[i][j]);
            }
            System.out.println();
        }
        int max = array35[0][0];
        for (int i = 0; i < array35.length; i++) {
            for (int j = 0; j < array35[i].length; j++) {
                if (array35[i][j] > max) {
                    max = array35[i][j];
                }
            }
        }

        System.out.println("max = "+max);

            for (int i = 0; i < array35.length; i++) {
                for (int j = 0; j < array35[i].length; j++) {
                    if (array35[i][j] % 2 == 0 && array35[i][j] != max) {
                        array35[i][j] = max;
                    }
                }

               }

        for (int i = 0; i < array35.length; i++) {
            for (int j = 0; j < array35[i].length; j++) {

                System.out.printf("[%3d]", array35[i][j]);
            }
            System.out.println();
        }
        }
    }
