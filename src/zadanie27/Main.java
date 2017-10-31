package zadanie27;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("hej hej, welcome to school dirtbag! teraz tabliczka mnozeeenia!");
        Scanner nasluchiwacz = new Scanner(System.in);
        String liniaLiczby = nasluchiwacz.nextLine();
        try{
            int liczba = Integer.parseInt(liniaLiczby);
            if(liczba >0){
            for (int i = 1; i<=liczba; i++) {
                System.out.println("wynikiem mnozenia " + i + " przez " + liczba + " rowna sie " + i * liczba);
            }}
            if(liczba < 0){
                for (int i = -1; i >= liczba; i-- ){
                    System.out.println("wynikiem mnozenia " + i + " przez " + liczba + " rowna sie " + i * liczba);
                }
            }
            if (liczba == 0){
                System.out.println("zero razy zero = zero");
            }
        }catch(NumberFormatException nfe){
            System.out.println("TO NIE BYLA LICZBA");
        }
    }
}
