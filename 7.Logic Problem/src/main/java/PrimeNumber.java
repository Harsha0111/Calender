public class PrimeNumber {
    public static void main(String[] args) {
    int startNum = 1;
    int endNum = 100;

        for (int i = startNum; i <=endNum ; i++) {
            if(checkPrime(i)){
                System.out.println(i);
            }

        }
    }

    private static boolean checkPrime(int num) {
        if(num< 2){
            return false;
        }else {
            int x =num/2;
            for (int i = 2; i < x ; i++) {
                if (num % i == 0){
                    return false;
                }
            }
        }
        return true;
    }
}
