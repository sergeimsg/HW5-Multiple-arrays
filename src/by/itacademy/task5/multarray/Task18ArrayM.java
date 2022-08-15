package by.itacademy.task5.multarray;

public class Task18ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array18 = new int[n][n];

        for (int i = 0; i < array18.length; i++) {
            for (int j = array18[i].length - 1; j >= 0; j--) {
                if (i > array18.length - j - 1 && j != 0 && i != 0 && (i + j + 1) > array18.length) {
                    array18[i][j] = 0;

                } else {
                    array18[i][j] = i + 1;
                }
            }
        }


        {

        }

        for (int i = 0; i < array18.length; i++) {
            for (int j = 0; j < array18[i].length; j++) {
                System.out.printf("[%1d]\t", array18[i][j]);
            }
            System.out.println();
        }
    }
}
