package by.itacademy.task5.multarray;

import java.util.Random;

public class Task4ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array3 = new int[n][n];
        Random rand5 = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                array3[i][j]=rand5.nextInt(100);

                System.out.printf("[%4d]", array3[i][j]);
            }
            System.out.println();

            }
        System.out.println("The first row");

        for (int i = 0; i < array3.length; i+=array3.length-1) {

            for (int j = 0; j < array3[i].length; j++) {

                System.out.printf("[%4d]", array3[i][j]);
            }

            System.out.println();
            System.out.println("The last row");
        }
            for (int element : array3[0] ) {
                System.out.printf("[%3d]", element);}
            System.out.println();
                for (int element1 : array3[array3.length-1] ) {
                    System.out.printf("{%2d}", element1);

                }



        }

    }

