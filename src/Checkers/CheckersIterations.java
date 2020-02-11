package Checkers;

public class CheckersIterations {
    public static int count = 0;
    public static void main(String[] args) {
        int[][] array = new int[8][8];//игровое поле
        array[3][7] = 1; //начальная позиция шашки

        for(int j = 8; j > 1; j--){
            for(int i = 0; i < 8; i++){
                array[i+1][j+1] += array[i][j];
                array[i-1][j+1] += array[i][j];
            }
        }
        count = array[0][0]+array[2][0]+array[4][0]+array[6][0];
        System.out.print(count);


    }
}