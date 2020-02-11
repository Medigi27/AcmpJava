//Сколькими способами шашка может пройти в дамки?
package Checkers;

public class CheckersRecursion {
    public static void main(String[] args) {
        //fieldSize задает размер поля
        System.out.print(CheckersRecursion(4, 1, 8));

    }
    public static int CheckersRecursion(int x, int y, int fieldSize){

        if(x <= 0 || x > fieldSize){
            return 0;
        }
        if(y == fieldSize){
            System.out.println(x + " " + y);
            return 1;
        }
        return CheckersRecursion((x+1), (y+1), 8) + CheckersRecursion((x-1), (y+1), 8);
    }
}
