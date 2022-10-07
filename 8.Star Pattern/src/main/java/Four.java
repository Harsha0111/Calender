public class Four {
    public static void main(String[] args) {
        char a = 'H';
        for (int i = 1; i <= 5; i++) {
            for (int j = 5; j >=i ; --j) {
                System.out.print(a + " ");
            }
            a++;
            System.out.println();
        }

    }
}
