package zadanie18;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n = 0;

        System.out.println("to ile liczb chcialbys wprowadzic?");

        Scanner scanner = new Scanner (System.in);

        String liniaLiczbyN = scanner.nextLine();
        try{
            n = Integer.parseInt(liniaLiczbyN);
            int tabela [] = new int[n];
            System.out.println("to teraz zacznij podawać liczby");
            for (int i = 0; i<= n-1; i++){
                String liniaLiczby = scanner.nextLine();
                try{
                    int liczba = Integer.parseInt(liniaLiczby);
                    tabela [i] = liczba;
                    System.out.println("podales " + (i+1) + " liczbe");

                }catch(NumberFormatException nfe){
                    System.out.println("To nie była liczba oszuście");
                }
            }
            System.out.println(Arrays.toString(tabela));
            int max = tabela[n-1];
            for (int i = 1; i < n; i++){
                if (max <= tabela[i-1]){
                    max = tabela[i-1];
                }
//                System.out.println("to " + i + " przejście przez pętlę 1");
            }
                System.out.println("max value to " + max);
            int min = tabela [n-1];
            for (int i = 1; i < n; i++){
                if (min >= tabela[i-1]){
                    min = tabela[i-1];
                }
//                System.out.println("to " + i + " przejście przez pętlę 2");
            }
                System.out.println("min value to " + min);

            System.out.println("Srednia wartosc min i max to " +( (min + max)/2d));
            //tutaj wprowadz kod wyrzucajacy wyniki z arraya
        } catch(NumberFormatException nfe ){
            System.out.println("To nie była liczba oszuście");
        } catch (NegativeArraySizeException nase){
            System.out.println("Liczba mniejsza od zero!");
        }catch (ArrayIndexOutOfBoundsException aioobe){
        System.out.println("Liczba rowna zero!");}



    }
}
