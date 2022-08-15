package by.itacademy.task5.multarray;

import java.util.Random;
import java.util.Scanner;

public class Task39ArrayM {
    public static void main(String[] args) {

        /*
        It works only for rectangular arrays
         */
        int l;

        int m;

        int n;

        int p;
        Scanner sc = new Scanner(System.in);
        System.out.println("Columns in A array");

        l = sc.nextInt();
        System.out.println("Rows in A array");
        m = sc.nextInt();
        System.out.println("Columns in B array");
        n = sc.nextInt();
        System.out.println("Rows in B array");
        p = sc.nextInt();
        int[][] arrayA = new int[l][m];
        int[][] arrayB = new int[n][p];
        int[][] arrayC = new int[l][p];
        Random random39 = new Random();
        if (l != n && p != m) {
            sc.nextLine();
            System.out.println("Columns and rows in A array should be equal to columns and rows n in B array");
        } else {
            System.out.println("Array A");

            for (int i = 0; i < arrayA.length; i++) {
                for (int j = 0; j < arrayA[i].length; j++) {
                    arrayA[i][j] = random39.nextInt(10);
                    System.out.printf("[%2d]", arrayA[i][j]);
                }
                System.out.println();
            }
            System.out.println("Array B");

            for (int i = 0; i < arrayB.length; i++) {
                for (int j = 0; j < arrayB[i].length; j++) {

                    arrayB[i][j] = random39.nextInt(10);
                    System.out.printf("[%2d]", arrayB[i][j]);
                }
                System.out.println();
            }

            for (int i = 0; i < l; i++) {

                for (int j = 0; j < p; j++) {
                    arrayC[i][j] = 0;
                    int r = 0;
                    while (r < p) {
                        arrayC[i][j] += arrayA[i][r] * arrayB[r][j];
                        r++;
                    }
                    //  System.out.printf("[%2d]", arrayC[i][j]);
                }
                // System.out.println();
            }
            System.out.println("arrayA*arrab=arayC");
            for (int i = 0; i < arrayC.length; i++) {
                for (int j = 0; j < arrayC[i].length; j++) {
                    System.out.printf("[%2d]", arrayC[i][j]);
                }
                System.out.println();
            }

        }
    }
}
