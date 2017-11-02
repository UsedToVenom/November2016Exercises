package zadanie31;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("sprawdzanie palindromow");

        Scanner listener = new Scanner(System.in);

        String lineExpression = listener.nextLine();

        int length = lineExpression.length();

        int palindromChecker = 0;

        String tabela [] = new String [length];
        for (int i = 0; i<=length - 1; i++){
            tabela[i] = String.valueOf(lineExpression.charAt(i));
        }
        for(int i = 0; i<=(length/2)-1; i++){
            if (!tabela[i].equals(tabela[length-i-1]) && i != length-i-1){
                palindromChecker++;
            }
        }
        if(palindromChecker == 0){
            System.out.println("wyrazenie jest palindromem");
        }else{
            System.out.println("wyrazenie nie jest palindromem");
        }
    }
}
