package zadanie17;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int liczba = 0;
        System.out.println("cześć! chciałbyś coś zjeść? teraz będą potęgu lupy");

        Scanner scanner = new Scanner (System.in);
while (true){
        System.out.println("Podaj liczbę całkowitą kochasiu!");

        String liniaLiczby = scanner.nextLine();
        try{
            liczba = Integer.parseInt(liniaLiczby);
            if (liczba >=0 ){
                for (int i = 0; i*i<=liczba; i++){
                    System.out.println(i*i);
                }
            }else{
                System.out.println("Miała być liczba większa od zera!");
            }


        }catch(NumberFormatException nfe){
            System.out.println("To nawet nie była liczba!");
        }}
    }
}
