package bank;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Bank bank = new Bank();
        bank.createTestAccount();

        System.out.println("Welcome to Harsha Bank!!!");
        System.out.println("1. Open Account");
        System.out.println("2. Close Account");
        System.out.println("3. WithDraw");
        System.out.println("4. Deposit");
        System.out.println("5. Exit");
        System.out.print("Enter your choice: ");

        int choice = scanner.nextInt();

        while (choice != 5) {
            switch (choice) {
                case 1:
//                    bank.openAccount();
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Enter your account number");
                    int accNum = scanner.nextInt();
                    Account account = null;
                    ArrayList<Account> accounts = bank.getAccounts();
                    for (int i = 0; i < accounts.size(); i++) {
                        Account acc = accounts.get(i);
                        if (acc.getAccNo() == accNum) {
                            account = acc;
                        }
                    }
                    if (account == null) {
                        System.out.println("Invalid account number: ");
                    } else {
                        System.out.println("Enter the amount to withdraw: ");
                        double withDraw = scanner.nextDouble();
                        if (account.getAmount()> withDraw){
                            System.out.println("Amount withdraw");
                            double balance = account.getAmount() - withDraw;
                            account.setAmount(balance);
                        }
                    }
                    break;
                case 4:

                    break;

                default:
                    break;
            }
        }


    }
}
