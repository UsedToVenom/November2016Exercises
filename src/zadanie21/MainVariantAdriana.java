package zadanie21;
import java.util.Scanner;

public class MainVariantAdriana {
    public static void main(String[] args) {
        System.out.println("Wpisz wysokosc choinki ");
        Scanner konsola = new Scanner(System.in);
        int n = konsola.nextInt();

        int x = n;
        int y = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < y; k++) {
                System.out.print("x");
            }
            x--;
            y += 2;
            System.out.println();
        }
    }
}

