package by.itacademy.task5.multarray;

import java.util.Random;

public class Task2ArrayM {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] arr2= new int[2][3];
        for (int i = 0; i < arr2.length; i++) {
            for (int j = 0; j < arr2[i].length; j++) {
                arr2[i][j] = random.nextInt(10);
                System.out.printf("[%4d]",arr2[i][j]);
            }
            System.out.println();

        }
    }
}

