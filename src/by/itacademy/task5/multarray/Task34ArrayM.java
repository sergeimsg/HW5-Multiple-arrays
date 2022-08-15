package by.itacademy.task5.multarray;

public class Task34ArrayM {
    public static void main(String[] args) {
        int m = 10;
        int n = 8;
        int[][] array36 = new int[m][n];

        for (int j = 0; j < n; j++) {

            int i = 0;

            while (j != i && j < m) {

                array36[i][j] = 1;
                i++;
            }
            if (i == j) {
                array36[i][j] = 1;
            }
        }


        for (int i = 0; i < array36.length; i++) {
            for (int j = 0; j < array36[i].length; j++) {
                System.out.printf("[%2d]", array36[i][j]);
            }
            System.out.println();
        }

    }
}