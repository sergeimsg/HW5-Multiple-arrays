package by.itacademy.task5.multarray;

public class Task22ArrayM {
    public static void main(String[] args) {
        int n = 6;
        int[][] array22 = new int[n][n];
        int sum = 0;

        for (int i = 0; i < array22.length; i++) {
            sum = n;
            for (int j = array22[i].length - 1; j >= 0; j--) {

                if ((i + j) <= array22.length - 1) {

                    array22[i][j] = sum;
                    sum--;
                } else {
                    array22[i][j] = 0;
                }
            }
        }

        for (int i = 0; i < array22.length; i++) {
            for (int j = 0; j < array22[i].length; j++) {
                System.out.printf("[%1d]\t\t", array22[i][j]);
            }
            System.out.println();
        }
    }
}
