package zadanie26;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("zamieniamy liczbę na binaary zioom!");

        int tabela [] = new int [32];

        Scanner nasluchiwacz = new Scanner (System.in);

        String liniaLiczby = nasluchiwacz.nextLine();

        try{
            int liczba = Integer.parseInt(liniaLiczby);

            for (int i = 31; i>=0; i-- ){
                if (liczba % 2 == 0){
                    tabela [i] = 0;
                    liczba = liczba/2;
                }else{
                    tabela [i] = 1;
                    liczba = (liczba - 1)/2;
                }
            }
        } catch(NumberFormatException nfe){
            System.out.println("TO NIE LICZBA WAFLU");
        }
        System.out.println(Arrays.toString(tabela));
        for (int i = 0; i <= tabela.length-1; i++){
            System.out.print( tabela[i] + " ");
        }
    }

}
