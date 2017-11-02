package zadanie30A;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj stringa, a ja zobacze ile razy jego ostatni znak sie powtarza!");

        Scanner listener = new Scanner(System.in);

        String lineExpression = listener.nextLine();

        int length = lineExpression.length();

        for (int i = length-1; i>=0; i--){
            System.out.print(String.valueOf(lineExpression.charAt(i)));
        }
    }

}
