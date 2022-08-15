package by.itacademy.task5.multarray;

import java.util.Random;
import java.util.Scanner;

public class Task26ArrayM {
    public static void main(String[] args) {
        int n;
        int m;
        Scanner sc = new Scanner(System.in);
        System.out.println("Put the size of the matrix n - rows and m - columns");
        System.out.println("n");
        n = sc.nextInt();
        System.out.println("m");
        m = sc.nextInt();
        Random random26 = new Random();
        int[][] array26 = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                array26[i][j] = random26.nextInt(100);
                if (array26[i][j] % 3 == 0) {
                    array26[i][j] = -array26[i][j];
                }
            }
        }
        int sum = 0;
        int max = 0;
        int maxArray = array26[0][0];
        int minArray = array26[0][0];
        int iMax = 0;
        int jMax = 0;
        int iMin = 0;
        int jMin = 0;
        for (int i = 0; i < n; i++) {
            sum = 0;
            int x = 0;
            max = array26[0][x];
            x++;
            for (int j = 0; j < m; j++) {
                System.out.printf("[%3d]", array26[i][j]);
                if (Math.abs(array26[i][j]) > max) {
                    max = Math.abs(array26[i][j]);
                }
                if (array26[i][j] < 0) {
                    sum = sum + Math.abs(array26[i][j]);
                }

            }
            int negSum = -1 * sum;
            System.out.println("  negative figures sum -  " + negSum + "  ABSmax = " + max);
        }



        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

                if (array26[i][j] > maxArray) {
                    maxArray = array26[i][j];
                    iMax=i;
                    jMax=j;
                }
                if (array26[i][j] < minArray) {
                    minArray = array26[i][j];
                    iMin=i;
                    jMin=j;
                }

                if (i == array26.length - 1 && j == array26[i].length - 1) {
                    System.out.println(" minArray  " + minArray +"; iMin = "+iMin+"; jMin = "+jMin+
                            ";   maxArray = " + maxArray+";  iMax = "+iMax+"; jMax = "+jMax);
                    int temp = 525;
                    temp= array26[iMin][jMin];
                    array26[iMin][jMin]=array26[iMax][jMax];
                    array26[iMax][jMax] = temp;
                }
            }
        }
        System.out.println("After replacement max and min in matrix:");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("[%2d]", array26[i][j]);
            }
            System.out.println();
        }


    }
}

