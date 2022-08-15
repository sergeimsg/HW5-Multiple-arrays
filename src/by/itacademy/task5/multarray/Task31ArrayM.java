package by.itacademy.task5.multarray;

import java.util.Random;

public class Task31ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int m = 20;
        Random random31 = new Random();
        int[][] array31 = new int[n][m];
        for (int i = 0; i < array31.length; i++) {
            for (int j = 0; j < array31[i].length; j++) {
                array31[i][j] = random31.nextInt(1000);
                System.out.printf("[%3d]", array31[i][j]);
            }
            System.out.println();
        }
        int sum=0;
        for (int i = 0; i < array31.length; i++) {
            for (int j = 0; j < array31[i].length; j++) {
                if (array31[i][j]>=10 && array31[i][j]<100) {
                    sum++;
                }
            }
        }
        System.out.println("Two digits figures in matrix "+sum);
    }
}
