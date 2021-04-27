package Mortgage;


import java.text.NumberFormat;
import java.util.Scanner;

public class Mortgage {
    public static void main(String[] args) {

        final byte MONTHS_IN_YEAR = 12;
        final byte PERCENTAGE = 100;
        float annual = 0;
        int princ = 0;
        byte period = 0;
        Scanner  scanner = new Scanner(System.in);

                    while(true){
                        System.out.print("Principal $1K - $1M: ");
                        princ = scanner.nextInt();
                        if (princ >= 1000 && princ<=1_000_000)
                            break;
                        System.out.println("Enter value 1,000 - 1,000,000");
                    }

                while(true) {
                    System.out.print("Annual interest value: ");
                    annual = scanner.nextFloat();
                    if(annual>0 && annual<=30)
                        break;
                    System.out.println("Enter a value between 0 and 30: ");

                }
                float monthly = ((annual/PERCENTAGE)/MONTHS_IN_YEAR);

                while(true) {
                    System.out.print("Period: ");
                    period = scanner.nextByte();
                    if(period>=1 && period<=30)
                        break;
                    System.out.println("Value between 1-30");
                }
                int numberOfPayments= period*MONTHS_IN_YEAR;

                double result = princ*(monthly*(Math.pow(1 + monthly, numberOfPayments))/(Math.pow(1 + monthly, numberOfPayments)-1));

        System.out.print("Your Mortgage is: " +NumberFormat.getCurrencyInstance().format(result));
    }
}