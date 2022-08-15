package by.itacademy.task5.multarray;

public class Task14ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array14 = new int[n][n];

        for (int i = 0; i < array14.length; i++) {
            for (int j = array14[i].length-1; j >=0; j--) {
                if (i == array14.length - j-1) {
                    array14[i][j] = i+1;
                } else {
                    array14[i][j] = 0;
                }
            }

        }
        for (int i = 0; i < array14.length; i++) {
            for (int j = 0; j < array14[i].length; j++) {
                System.out.printf("[%3d]", array14[i][j]);
            }
            System.out.println();
        }
    }
}
