package by.itacademy.task5.multarray;

import java.util.Random;
import java.util.Scanner;

public class Task10ArrayM {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = 10;
        int k = 5;
        int p = 3;
        int[][] array10 = new int[n][n];
        Random random10 = new Random();
        for (int i = 0; i < array10.length ; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                array10[i][j] = random10.nextInt(100);
                System.out.printf("[%3d]", array10[i][j]);
            }
            System.out.println();

        }
        System.out.print("row k = " + k);
        System.out.println();

            for (int element : array10[k-1]) {
                System.out.print(" - " +element);

            }
        System.out.println();
        System.out.println("Column p = " + p);
       System.out.printf("       ");

        for (int i = 0; i < array10.length; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                if (j!=p-1) {
                    System.out.printf(" ");

                }
                else System.out.printf("[%3d]\n", array10[i][j]);
            }

        }


    }
}
