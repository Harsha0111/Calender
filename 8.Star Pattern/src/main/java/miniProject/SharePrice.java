package miniProject;

import java.text.DecimalFormat;
import java.util.Scanner;

public class SharePrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your bought share price: ");
        double boughtPrice = sc.nextDouble();

        int day = 1;
        DecimalFormat df = new DecimalFormat("0.00");
        while (true) {
            System.out.print("Enter the closing price at the end of day " + day + ":");
            double closingPrice = sc.nextDouble();

            if (closingPrice < 0) {
                break;
            }
            double profit = closingPrice - boughtPrice;
            if (profit == 0) {

                System.out.println("The share you bought is having no profit:");

            } else if (profit < 0) {
                System.out.println("The share you bought is having loss with = " +df.format(-profit) );

            } else {
                System.out.println("The share you bought is having profit = " +df.format(profit));

            }
            day += 1;
        }
    }
}
