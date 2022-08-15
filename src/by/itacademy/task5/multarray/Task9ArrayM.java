package by.itacademy.task5.multarray;

import java.util.Random;

public class Task9ArrayM {
    public static void main(String[] args) {
        int n = 20;
        int[][] array10 = new int[n][n];

        for (int i = 0; i < array10.length; i++) {

            array10[i][i] = i;

        }

        for (int i = 0; i < array10.length; i++) {
            for (int j = array10[i].length - 1; j >= 0; j--) {
                if (i == array10.length - j-1) {
                    array10[i][j] = i;
                    //System.out.printf("%3d", array10[i][j]);
                }

            }
            //System.out.println();
        }

        for (int i = 0; i < array10.length; i++) {
            for (int j = 0; j < array10[i].length; j++) {
                if (i == j || (i==array10[i].length-j-1)) {
                    System.out.printf("[%1d]\t", array10[i][j]);
                } else {
                    System.out.printf("\t");
                }
            }
            System.out.println();
        }



       }
}

