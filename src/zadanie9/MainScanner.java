package zadanie9;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {


        boolean waga_check = true;
        boolean wzrostCheckHigh = true;
        boolean wzrostCheckLow = true;
        boolean wiekCheckHigh = true;
        boolean wiekCheckLow = true;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj Wiek");
        String liniaWiek = scanner.nextLine();
        System.out.println("Podaj Wzrost");
        String liniaWzrost = scanner.nextLine();
        System.out.println("Podaj Wage");
        String liniaWaga = scanner.nextLine();

        int wiek = Integer.parseInt(liniaWiek);
        int waga = Integer.parseInt(liniaWaga);
        int wzrost = Integer.parseInt(liniaWzrost);

try {
    if (waga >= 180) {
        System.out.println("osoba za ciezka!");
        waga_check = false;
    }
    if (wzrost <= 150) {
        System.out.println("osoba za niska");
        wzrostCheckLow = false;
    }
    if (wiek < 10) {
        System.out.println("osoba za mloda");
        wiekCheckLow = false;
    }
    if (wiek >= 80) {
        System.out.println("osoba za stara");
        wiekCheckHigh = false;
    }
    if (wzrost >= 220) {
        System.out.println("osoba za wysoka");
        wzrostCheckHigh = false;
    }
    if (wzrostCheckHigh == true && waga_check == true && wzrostCheckLow == true && wiekCheckHigh == true && wiekCheckLow == true) {
        System.out.println("jest zgoda na wejscie");
    } else if (wzrostCheckHigh == false || waga_check == false || wzrostCheckLow == false || wiekCheckHigh == false || wiekCheckLow == false) {
        System.out.println("Brak zgody na wejscie");
    }
} catch (NumberFormatException nfe) {
    System.out.println("zly format jednej ze zmiennych");
        }
    }

}
