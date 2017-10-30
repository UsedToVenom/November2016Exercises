package zadanie16;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Witaj userze, bedziemy pisac hello world az nie podasz liczby <0!");

        int a = 0;
        while (a >=0){
            System.out.println("Podaj liczbe waflu!");

            Scanner scanner = new Scanner (System.in);
            String liniaLiczby = scanner.nextLine();

            try {
                int liczba = Integer.parseInt(liniaLiczby);
                a = liczba;
                if (a >= 0){
                    System.out.println("Hello World");
                }else{
                    System.exit(0);
                }

            } catch (NumberFormatException efn){
                System.out.println("to nie była liczba!");
            }
        }


    }
}
