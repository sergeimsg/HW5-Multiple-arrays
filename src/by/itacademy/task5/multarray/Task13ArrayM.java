package by.itacademy.task5.multarray;

public class Task13ArrayM {
    public static void main(String[] args) {
        int n = 10;
        int[][] array13 = new int[n][n];


        for (int i = 0; i < array13.length; i++) {
            for (int j = 0; j < array13[i].length; j++) {
                array13[i][j] = j + 1;
                System.out.printf("[%2d]\t", array13[i][j]);
            }


            System.out.println();
            i++;
            if (i > array13.length)             // work without it
            {
                break;
            }
            for (int j = array13[i].length-1; j >= 0; j--) {
                array13[i][j]= j+1;
                //System.out.println("????????");
                System.out.printf("[%2d]\t", array13[i][j]);
            }
            System.out.println();


        }
    }
}
