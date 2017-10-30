package zadanie15;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int liczba = 0;
        System.out.println("Podaj liczbę większą od zera!");

        Scanner scanner = new Scanner (System.in);

        String liniaLiczby = scanner.nextLine();

        try{
            liczba = Integer.parseInt(liniaLiczby);
            if ( liczba < 0 ){
                System.out.println("Podales liczbe mniejsza od zera!!");
            } else {
                for (int i = 1; i <= liczba; i++){
                    System.out.println("hello world!");
                }
            }
        }catch(NumberFormatException nfe){

            System.out.println("To nie była liczba szuście!");
        }
    }
}

