package zadanie19;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ok okchasiu, zacznij podawac liczby. konczymy gdy podasz 0");
        int n=1;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        while ( n !=0){
        Scanner scanner = new Scanner (System.in);
        String liniaCyfry = scanner.nextLine();
        try{
            n = Integer.parseInt(liniaCyfry);
            if (n > max){
            max = n;
                System.out.println("Ustawilem nowa wartosc max " + max);
            }
            if (n < min){
            min = n;
                System.out.println("Ustawilem nowa wartosc min " + min);
            }
            if (n == 0) {
                System.out.println("OK, konczymy");
            }
            if (n < max && n > min)
            {
                System.out.println("brak zmian do wartosci max i min, zostaja " + max + " oraz " + min);
            }

        }catch(NumberFormatException nfe){
            System.out.println("to nie byla liczba");
        }}
        System.out.println("srednia wartosc podanych liczb to " + (max + min) / 2d);
    }
}
