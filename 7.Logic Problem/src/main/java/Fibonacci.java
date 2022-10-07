public class Fibonacci {
    public static void main(String[] args) {
        int n =10, firstNum = 0, secondNum = 1;
        System.out.println("Fibonacci Series " + n +"num:");

        for (int i = 0; i < n; i++) {
            System.out.print(firstNum + ",");

            int nextTerm = firstNum+secondNum;
            firstNum = secondNum;
            secondNum = nextTerm;

        }
    }
}
