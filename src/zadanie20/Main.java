package zadanie20;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("gramy w za dużo za mało kochasiu. Ja wylosuję ci liczbę 0-100, potem zobacyzmy w ile strzałow uda ci sie ja trafic!");

        int randomNumber = (int) (Math.random() * (100 - 0) + 0);

        Scanner scanner = new Scanner(System.in);
        while (true) {
            String commandLine = scanner.nextLine();

            if (commandLine.equals("hack")) {
                System.out.println(randomNumber);
            }
            try {
                int proba = Integer.parseInt(commandLine);
                if (proba == randomNumber) {
                    System.out.println("gratulacje! wygrałeś! Popełniam harakiri" + "\nProgram się zabił");
                    System.exit(0);
                } else if (proba < randomNumber) {
                    System.out.println("za malo!");
                } else if (proba > randomNumber) {
                    System.out.println("za duzo!");
                } else {
                    System.out.println("ERROR");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("To nie byla liczba!");
            }

        }
    }
}