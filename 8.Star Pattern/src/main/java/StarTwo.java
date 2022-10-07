public class StarTwo {
    public static void main(String[] args) {
        char rows = 'A';

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(rows + " ");
            }
            rows++;

            System.out.println();

        }

    }
}


