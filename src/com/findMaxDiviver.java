public class Jail {
    public static void main(String[] args) {
        System.out.println(findDivider(20,100));
    }
    static int findMaxDivider(int firstNumber, int SecondNumber){

        int lowerNumber = firstNumber <= SecondNumber ? firstNumber : SecondNumber;
        int largerNumber = firstNumber >= SecondNumber ? firstNumber : SecondNumber;
        int maxDivider = 0;

        for(int i = lowerNumber; i > 0; i--){
            if(lowerNumber %i == 0){
                if(largerNumber %i == 0){
                    maxDivider = i;
                    break;
                }
            }
        }

        return maxDivider;

    }
}
