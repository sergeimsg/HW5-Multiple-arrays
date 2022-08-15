package by.itacademy.task5.multarray;

import java.util.Random;

public class Task5ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array5 = new int[n][n];
        Random rand5 = new Random();
        for (int i = 0; i < array5.length; i++) {
            for (int j = 0; j < array5[i].length; j++) {
                array5[i][j] = rand5.nextInt(100);
                System.out.printf("[%3d]\t", array5[i][j]);
            }
            System.out.println();
        }
        for (int i = 0; i < array5.length; i+=2) {
            for (int j = 0; j < array5[i].length; j++) {
                System.out.printf("%3d\t",array5[i][j]);
            }
            System.out.println();
        }
        System.out.println("-------------------------");
        for (int i = 0; i < array5.length; i++) {
            if (i%2==0)
                for (int element : array5[i]) {
                    System.out.printf("%3d", element);
                }
            System.out.println();
        }

        }

}
