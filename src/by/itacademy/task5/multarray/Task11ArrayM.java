package by.itacademy.task5.multarray;

import java.util.Random;

public class Task11ArrayM {
    public static void main(String[] args) {

        int n = 10;
        int m = 8;
        int[][] array11 = new int[n][m];
        Random rand11 = new Random();

        for (int i = 0; i < array11.length; i++) {
            for (int j = 0; j < array11[i].length; j++) {
                array11[i][j] = rand11.nextInt(100);
                if (rand11.nextInt() % 3 == 0) {
                    array11[i][j] = -array11[i][j];

                }
                System.out.printf("[%2d]", array11[i][j]);
            }
            System.out.println();
        }
        System.out.println("-----------------------------------");
        for (int i = 0; i < array11.length; i++) {
            for (int j = array11[i].length-1; j >=0 ; j--) {
                System.out.printf("[%2d]", array11[i][j]);
            }
            System.out.println();
                i++;
                if (i > array11.length)             // work without it
                {break;}
                for (int j = 0; j < array11[i].length; j++) {
                    System.out.printf("[%2d]\t", array11[i][j]);
                }
            System.out.println();

            }
        }
    }

