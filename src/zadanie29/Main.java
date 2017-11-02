package zadanie29;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("podaj stringa, a ja zobacze ile razy jego ostatni znak sie powtarza!");

        Scanner listener = new Scanner(System.in);

        String lineExpression = listener.nextLine();

        int length = lineExpression.length();

        String last = String.valueOf(lineExpression.charAt(length-1));

        int count = 0;

        for (int i = 0; i<=length-1; i++){

            if(last.equals(String.valueOf(lineExpression.charAt(i)))){
                count++;
            }
        }
        System.out.println(count);
    }
}
