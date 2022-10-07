public class SumPair {
    public static void main(String[] args) {
        int k = 15;
        int[] arr = {-5, 1, 40, 20, 6, 8, 7};
         boolean isPresent = match(k ,arr);
        System.out.println(isPresent);
    }
    static boolean match(int k ,int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (i != j){
                    if (k == arr[i] + arr[j]){
                        return true;
                    }
                }

            }
        }
        return false;
    }
}
