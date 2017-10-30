//package zadanie18;
//
//import java.lang.reflect.Array;
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//
//        int n = 0;
//
//        System.out.println("to ile liczb chcialbys wprowadzic?");
//
//        Scanner scanner = new Scanner (System.in);
//
//        String liniaLiczbyN = scanner.nextLine();
//        try{
//            n = Integer.parseInt(liniaLiczbyN);
//            int tabela [] = new int[n];
//            System.out.println("to teraz zacznij podawać liczby");
//            for (int i = 0; i<= n-1; i++){
//                String liniaLiczby = scanner.nextLine();
//                try{
//                    int liczba = Integer.parseInt(liniaLiczby);
//                    tabela [i] = liczba;
//
//                }catch(NumberFormatException nfe){
//                    System.out.println("To nie była liczba oszuście");
//                }
//            }
//            System.out.println(Arrays.toString(tabela));
//            int max = tabela[0];
//            for (int i = 0; i == n-1; i++){
//                if (tabela[i] >= tabela[i-1]){
//                    max = tabela[i];
//                }
//                System.out.println("max value to " + max);}
//            int min = tabela [0];
//            for (int i = 0; i == n-1; i++){
//                if (tabela[i] <= tabela[i-1]){
//                    min = tabela[i];
//                }
//                System.out.println("min value to " + min);
//            }
//            System.out.println("Srednia wartosc min i max to " +( (min + max)/2));
//            //tutaj wprowadz kod wyrzucajacy wyniki z arraya
//        } catch(NumberFormatException nfe){
//            System.out.println("To nie była liczba oszuście");
//        }
//
//    }
//}
