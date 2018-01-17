package zadanie23;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        while (true) {
            System.out.println("podaj liczbę, ja pokażę Ci jej dzielniki!");

            int count = 0;

            Scanner nasluchiwacz = new Scanner(System.in);

            String liniaLiczby = nasluchiwacz.nextLine();


            try {
                int liczba = Integer.parseInt(liniaLiczby);
                for (int i = 1; i <= liczba; i++) {
                    if (liczba % i == 0) {
                        count++;
                        System.out.println(i + " jest dzielnikiem " + liczba);
                    }}
                if (liczba == 1 || count == 2){
                    System.out.println(liczba + " jest liczba pierwsza!"); }

            } catch (NumberFormatException nfe) {
                System.out.println("to nie jest liczba!");
            }
        }
    }
}