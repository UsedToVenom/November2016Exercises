package zadanie10;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj dochod");
        String liniaDochod = scanner.nextLine();

        int dochod = Integer.parseInt(liniaDochod);
        double tax = 0;
        if(dochod <= 85528){
            tax = 0.18*dochod - 556.02;
        } else if (dochod > 85528){
            tax = 14839.02 + 0.32 * (dochod - 85528);
        }
        System.out.println("nalezny podatek to " + tax);
    }
}