package by.itacademy.task5.multarray;

public class Task1ArrayM {
    public static void main(String[] args) {

        int[][] arr = new int[3][4];
        for (int i = 0; i < 3; i+=2) {
            for (int j = 0; j < 4; j ++) {
                arr[i][j] = 1;
            }
        }
            for (int i = 1; i < 2; i++) {
                for (int j = 0; j < 4; j++) {
                    arr[i][j] = 0;
                }
            }
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 4; j++) {
                        System.out.printf("[%4d]",arr[i][j]);
                    }
                    System.out.println();
                }
            }


        }


