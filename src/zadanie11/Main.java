package zadanie11;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double pierwszaLiczba = 0;
        double drugaLiczba = 0;

        Scanner scanner = new Scanner (System.in);

        System.out.println("Jestem kalkulatorem! wciskaj guziki leszczu");
        System.out.println("Podaj pierwszą liczbę");

        String liniaPierwszejLiczby = scanner.nextLine();
        try {
            pierwszaLiczba = Double.parseDouble(liniaPierwszejLiczby);
        } catch ( NumberFormatException exc) {
            System.out.println("To nie jest liczba! Podstawiam Zero");
        }
        System.out.println("Podaj drugą liczbę");

        String liniaDrugiejLiczby = scanner.nextLine();
        try {
            drugaLiczba = Double.parseDouble(liniaDrugiejLiczby);
            if (drugaLiczba == 0){
                System.out.println("nie moża dzielić przez zero! Nie będziemy współpracować");
                System.exit(0);
            }
        } catch ( NumberFormatException exc) {
            System.out.println("To nie jest liczba! Podstawiam Zero");
        }

        System.out.println("Podaj znak operacji [ + , - , * , / ]");
        String liniaZnakuOperacji = scanner.nextLine();
        switch (liniaZnakuOperacji){
            case "+":
                System.out.println(pierwszaLiczba + drugaLiczba);
                break;
            case "-":
                System.out.println(pierwszaLiczba - drugaLiczba);
                break;
            case "*":
                System.out.println(pierwszaLiczba * drugaLiczba);
                break;
            case "/":
                if (drugaLiczba == 0){
                    System.out.println("nie moża dzielić przez zero! Nie będziemy współpracować");
                    System.exit(0);}
                else {
                    System.out.println(pierwszaLiczba / drugaLiczba);}
                break;
            default:
                System.out.println("nie rozpoznałem znaku działania!");
        }
    }
}
