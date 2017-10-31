package zadanie24;

import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        int tableElementCounter;
        int tabela [] = new int [10];
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        int sumTabelValues = 0;
        int licznikWiekszychOdSredniej = 0;
        int licznikMniejszychOdSredniej = 0;

        Random generator = new Random();

        System.out.println("Dlugie zadanko z tablica randomowych elementow? let's go!");

        for (tableElementCounter = 0; tableElementCounter < 10; tableElementCounter++ ){

            int wartosc = generator.nextInt(21) - 10;

            tabela [tableElementCounter] = wartosc;
                    }
        System.out.println(Arrays.toString(tabela));

        for (int i = 0; i <= tabela.length-1; i++){
            if (tabela[i] > max){
                max = tabela [i];
            }
            if (tabela[i] < min){
                min = tabela[i];
            }
            sumTabelValues = sumTabelValues + tabela[i];
        }
        double sredniaTabeli =  (double)sumTabelValues / (double)tabela.length;
        System.out.println("min value = " + min + "\nmax value = " + max);
        System.out.println("średnia wszystkich elementow to = " + sredniaTabeli);

        for (int i = 0 ; i <= tabela.length-1; i++){

                    if (tabela[i] > sredniaTabeli){
                        licznikWiekszychOdSredniej++;
                    }
                    if (tabela[i] < sredniaTabeli){
                        licznikMniejszychOdSredniej++;
                    }
        }
        System.out.println("jest "+ licznikWiekszychOdSredniej + " liczb wiekszych od sredniej w tabeli, \n oraz " + licznikMniejszychOdSredniej +
                " liczb mniejszych od sredniej w tabeli");
for (int i = tabela.length -1; i>=0; i--){
    System.out.print("[" + tabela[i] + "], ");
}
    }

}
