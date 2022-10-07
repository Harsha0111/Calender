package atmNew;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int bal = 1_000;

        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("Welcome To Atm: ");
            System.out.println("1.Deposit ");
            System.out.println("2.WithDraw");
            System.out.println("3.View balance");
            System.out.println("4.Exit ");

            System.out.print("Enter your choice : ");
            int input = scanner.nextInt();
            switch (input) {
                case 1:
                    System.out.print("Enter the amount to deposit : ");
                    int depAmt = scanner.nextInt();
                    bal = depAmt + bal;
                    break;
                case 2:
                    System.out.print("Enter the amount to withdraw : ");
                    int withdrawAmt = scanner.nextInt();
                    if(bal> withdrawAmt){
                        bal = bal - withdrawAmt;
                        System.out.println("Your balance "+bal);
                    }else {
                        System.out.println("Insufficient balance: ");
                    }
                    break;
                case 3:
                    System.out.println("Your balance " + bal);

                    break;
                case 4:
                    System.exit(1);
                    break;
                default:
                    break;
            }
        }
    }
}
