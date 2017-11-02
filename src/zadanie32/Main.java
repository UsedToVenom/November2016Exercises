package zadanie32;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("dodajemy cyferki w wyrazeniu");

        Scanner listener = new Scanner(System.in);

        String lineExpression = listener.nextLine();

        int length = lineExpression.length();

        int sumOfDigits = 0;

//        String tabela [] = new String [length];
//        for (int i = 0; i<=length - 1; i++){
//            tabela[i] = String.valueOf(lineExpression.charAt(i));
//        }
//        for (int i = 0; i<=length-1; i++){
//            try{
//                int liczba = Integer.valueOf(tabela[i]);
//                sumOfDigits = sumOfDigits + liczba;
//            }catch(NumberFormatException nfe){}
//        }
//        System.out.println("suma cyfr to " + sumOfDigits);

        for (int i = 0; i<=length-1; i++){
                if(Character.isDigit(lineExpression.charAt(i))) {
                    sumOfDigits = sumOfDigits + Character.getNumericValue(lineExpression.charAt(i));//tabela[i] - '0'
                                                                                        // tabela[i] - 48
                }
        }
        System.out.println("suma cyfr to " + sumOfDigits);
    }

}
