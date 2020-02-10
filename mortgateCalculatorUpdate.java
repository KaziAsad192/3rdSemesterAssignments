package calculator;

import java.text.NumberFormat;
import java.util.Scanner;

public class mortgateCalculatorUpdate {
    public static void main(String[] args){
        final byte Months_in_Year =12 ;
        final byte percent =100;
        int principle = 0;
        float monthlyInterest = 0;
        int  numberOfPayments = 0 ;

        Scanner scanner = new Scanner(System.in);

        while (true){
            System.out.println("Principle ($1k-$1M):");
            principle = scanner.nextInt();
            if (principle>=1000 && principle<=1_000_000)
                break;
            System.out.println("Please Enter a number in between 1000 to 1000000");
        }
        while (true){
            System.out.println("Enter Annual Interest: ");
            System.out.print("Enter the interest Rate: ");
            float annualInterest = scanner.nextFloat();
            if (annualInterest>=1 && annualInterest>=30) {
                monthlyInterest = annualInterest/percent/Months_in_Year;
                break;
            }
            System.out.println("Please Enter a number in between 1 to 30");
        }

        while (true){
            System.out.println("Years(1-30) : ");
            byte years = scanner.nextByte();
            if (years>=1 && years>=30) {
                numberOfPayments = years * Months_in_Year ;
                break;
            }
            System.out.println("Please Enter a number in between 0 to 30");
        }
        double Mortgage = principle * ((monthlyInterest *Math.pow(1+monthlyInterest ,numberOfPayments))/(Math.pow(1+monthlyInterest , numberOfPayments)-1));

        String newMortgage = NumberFormat.getCurrencyInstance().format(Mortgage);
        System.out.println("The Mortgage:" + newMortgage);

    }
}
