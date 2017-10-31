package zadanie22;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("podaj liczbę, ja pokażę Ci jej dzielniki!");

            Scanner nasluchiwacz = new Scanner(System.in);

            String liniaLiczby = nasluchiwacz.nextLine();
            try {
                int liczba = Integer.parseInt(liniaLiczby);
                for (int i = 1; i <= liczba; i++) {
                    if (liczba % i == 0) {
                        System.out.println(i + " jest dzielnikiem " + liczba);
                    }
                }
            } catch (NumberFormatException nfe) {
                System.out.println("to nie jest liczba!");
            }


        }
    }
}
