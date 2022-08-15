package by.itacademy.task5.multarray;

public class Task12ArrayM {
    public static void main(String[] args) {
        int n = 100;
        int[][] array12 = new int[n][n];
        for (int i = 0; i < array12.length; i++) {
            array12[i][i]=i;

        }
        for (int i = 0; i < array12.length; i++) {
            for (int j = 0; j < array12[i].length; j++) {
                System.out.printf("[%1d]\t", array12[i][j]);
            }
            System.out.println();
        }
    }
}
