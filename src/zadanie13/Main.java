package zadanie13;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("podaj liczbę całkowitą");

        String liniaPierwszejLiczby = scanner.nextLine();

        System.out.println("podaj liczbę całkowitą większą od podanej poprzednio");

        String liniaDrugiejLiczby = scanner.nextLine();
        try {
            a = Integer.parseInt(liniaPierwszejLiczby);
            b = Integer.parseInt(liniaDrugiejLiczby);
            if (a > b) {
                System.out.println("druga podana liczba nie jest większa od pierwszej!");
            }else{
                int a2 = a;
                int sum = a;
                while (a < b ){
                    a = a+1;
                    sum = sum + (a);
                }
                System.out.println(sum);
                sum = a2;
                for( a2=a2+1 ; a2<=b ; a2++ ){
                    sum = sum + a2;
                }
                System.out.println("drugie rozwiazanie");
                System.out.println(sum);}
        } catch(NumberFormatException nfe){
            System.out.println("conajmniej jedna z podanych wartości nie jest liczbą!");
        }


    }

}
