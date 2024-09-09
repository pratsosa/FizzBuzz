public class Reduce {
    public static void main(String[] args) {
        int numSteps = 0;
        int num = 100;
        while (num != 0){
            if (num % 2 == 0){
                num /= 2;
                numSteps++;
            }
            else {
                num--;
                numSteps++;
            }
        }
        System.out.println(numSteps);
    }
}
