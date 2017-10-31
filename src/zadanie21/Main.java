package zadanie21;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("okay kochasiu, budujemy choineczkę bo spooky scarry skeletons juz sie konczy, czas na swieta");

        Scanner nasluchiwacz = new Scanner (System.in);
        System.out.println("podaj wysokosc choinki");

        String liniaWysokosci = nasluchiwacz.nextLine();
        try{
            int wysokosc = Integer.parseInt(liniaWysokosci);
            for (int wiersz = 1; wiersz <= wysokosc; wiersz++){
                for (int kolumna = 1 ; kolumna <= (2*wysokosc) - 1; kolumna++){
                    if (wiersz < wysokosc && kolumna <= wysokosc - wiersz){
                        System.out.print(" ");
                    }
                    if (wiersz <= wysokosc && kolumna>= wysokosc - wiersz && kolumna < wiersz + kolumna && kolumna < wysokosc + wiersz-1){
                        System.out.print("*");
                    }
                    if (wiersz == wysokosc && kolumna == (2*wysokosc) - 1){
                        System.out.print("*");
                    }
                    if (kolumna == (2*wysokosc) - 1){
                        System.out.print("\n");
                    }
                }
            }
        }catch(NumberFormatException nfe){
            System.out.println("To nie byla liczba oszuscie!");
        }
    }
}
