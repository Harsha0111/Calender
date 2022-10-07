import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
//            throws IOException {
//        BufferedReader reader = new BufferedReader(
//                new InputStreamReader(System.in));
//        System.out.println("Enter something");
//        String name = reader.readLine();
//        System.out.println(name);
//    }

        // method 2
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter something");

        String name = sc.next();

        System.out.println("Enter num");

        int a = sc.nextInt();

        System.out.println("Enter ");
        float b = sc.nextFloat();

        // console-- password reading
//        String nameOne = System.console().readLine();
//        System.out.println("Enter " + nameOne);
    }
}
