import java.util.ArrayList;

public class Subset {
    public static void main(String[] args) {
        int[] array = {3, 5, 7, 12, 10, 9, 0, 2};

        int[] validSubSet = {1, 3, 5, 9};
        int[] invalidSubSet = {6, 3, 8};

        boolean isValid = isValidSubSet(array, validSubSet);
        System.out.println(isValid);
    }

    private static boolean isValidSubSet(int[] array, int[] subSet) {
        ArrayList<Integer> validSubSet = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < subSet.length; j++) {
                if (array[i] == subSet[j]) {
                    validSubSet.add(subSet[j]);
                    break;
                }
            }

        }
        return validSubSet.size() == subSet.length;
    }
}


