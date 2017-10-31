package zadanie25;

import java.util.Random;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int tabela [] = new int[20];
        Random generator = new Random();

        for (int tableElementCounter = 0; tableElementCounter < 20; tableElementCounter++ ){

            int wartosc = generator.nextInt(10) + 1;

            tabela [tableElementCounter] = wartosc;
        }
        System.out.println(Arrays.toString(tabela));
        for (int i = 1; i <= 10; i++){
            int licznik = 0;
            for (int j = 0; j <=tabela.length -1; j++){
                if (tabela[j] == i){
                    licznik++;
                }}
                System.out.println( i + " wystepuje " + licznik + " razy");
            }
        }
    }

