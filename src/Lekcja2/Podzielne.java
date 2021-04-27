package Lekcja2;

import java.util.Scanner;

public class Podzielne  {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 3 == 0)
            System.out.println("Podzielna przez 3 i 5");
        else if (number % 3 == 0)
            System.out.println("Podzielna przez 3");
        else if (number % 5 == 0)
            System.out.println("Podzielna przez 5");
        else
            System.out.println(number);

    }

}

