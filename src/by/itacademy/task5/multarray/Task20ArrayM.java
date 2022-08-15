package by.itacademy.task5.multarray;

public class Task20ArrayM {
    public static void main(String[] args) {
        int n = 20;
        int[][] array20 = new int[n][n];
        for (int i = 0; i < array20.length; i++) {
            for (int j = 0; j < array20[i].length; j++) {
                if (i>=j && (i+j)< array20.length)
                {array20[i][j]=1;}

                else {array20[i][j]=0;}
            }
        }
        for (int i = 0; i < array20.length; i++) {
            for (int j = array20[i].length-1; j >=0 ; j--) {
                if ((j+i)>= (array20.length-1) && j>=i)
                {
                    array20[i][j]=1;
                }

            }
        }

        for (int i = 0; i < array20.length; i++) {
            for (int j = 0; j < array20[i].length; j++) {
                System.out.printf("[%1d]\t", array20[i][j]);
            }
            System.out.println();
        }
    }
}
