package by.itacademy.task5.multarray;

import java.util.Random;

public class Task28ArrayM {
    public static void main(String[] args) {
        int n = 5;         // matrix size
        int[][] array28 = new int[n][n];
        int[] sum = new int[n]; // columns quantity
        Random random28 = new Random();

        for (int i = 0; i < array28.length; i++) {
            for (int j = 0; j < array28[i].length; j++) {
                array28[i][j] = random28.nextInt(100);
                System.out.printf("[%2d]",array28[i][j]);
            }
            System.out.println();
        }
        for (int j = 0; j < n; j++) {
            int sum1 = 0;
            for (int i = 0; i < array28.length; i++) {
                sum1 = sum1 + array28[i][j];
                if (i == array28.length - 1) {
                    sum[j] = sum1;

                }
            }
        }
        System.out.println("Columns sum:");
        for (int i = 0; i < array28.length; i++) {
            System.out.printf("[%4d]", sum[i]);
        }
        System.out.println();
        int maxC=sum[0];
        int iMax=0;
        for (int i = 0; i < array28.length; i++) {
            if (sum[i]>maxC) {
                maxC=sum[i];
                iMax=i+1;
            }
            if (i== array28.length-1)
            {
                System.out.println("Colums "+ iMax+" has maximum total = " +maxC);
            }
        }


        }

}