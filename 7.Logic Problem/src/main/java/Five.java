import java.util.Arrays;

public class Five {
    public static void main(String[] args) {
        number();
    }

    static int number() {
        int[] number = {2, 4, 6, 56, 89, 76, 11, 23};


        int check = 40;

        int i = 0;
        do {
            if (number[i] > check) {
                System.out.println(number[i]);
            }
            i++;
        } while (i < number.length);
        return 2;

    }
}
