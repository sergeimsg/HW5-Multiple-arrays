package by.itacademy.task5.multarray;

public class Task16ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array16 = new int[n][n];


        for (n = 0; n < array16.length; n++) {

            array16[n][n]=(n+1)*(n+2);
        }
        for (int i = 0; i < array16.length; i++) {
            for (int j = 0; j < n; j++) {
                if (i==j) {
                    System.out.printf("[%1d]", array16[i][j]);
                }

                else {
                    System.out.print("[0]\t");
                }


            }
            System.out.println();
        }
    }
}
