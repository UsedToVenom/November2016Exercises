package zadanie12;

import java.util.Scanner;

public class MainVariant {public static void main(String[] args) {

    int liczba = 0;

    Scanner scanner = new Scanner(System.in);

    System.out.println("podaj liczbę całkowitą > 0");

    String liniaLiczby = scanner.nextLine();

    try {
        liczba = Integer.parseInt(liniaLiczby);
    } catch (NumberFormatException nfe) {
        System.out.println("To nie liczba!");
    }
if (liczba % 2 == 1){
    for (int i = liczba; i >= 1; i = i - 1) {
         System.out.println(i);
        }
    }
    else {
    liczba = liczba -1;
    for (int i = liczba; i >= 1; i = i - 1) {
        System.out.println(i);
    }

}
    System.out.println( );
    // pętla która wypisuje liczby parzyste (rozpoczyna sie od 0 i indeksuje do wartosci wpisanej liczby)
    for (int i = 0; i <= liczba; i=i+1){
        if (i % 2 == 0){
            System.out.println(i);
        }
    }if (liczba < 0){
        System.out.println("niegrzeczny! Podałeś liczbę < 0");
    }
}
}
