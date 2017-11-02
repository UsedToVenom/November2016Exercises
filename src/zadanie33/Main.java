package zadanie33;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("liczymy otwarte/domkniete nawiasy!");

        Scanner listener = new Scanner(System.in);

        int numberOfOpenBrackets = 0;

        String inputLine = listener.nextLine();

        for(int positionIndex=0; positionIndex <= inputLine.length()-1; positionIndex++ ){
            if (numberOfOpenBrackets<0){
                System.out.println("ZLE DOMKNIETE NAWIASY");
                System.exit(0);
            }
            if (inputLine.charAt(positionIndex) == 40){
                numberOfOpenBrackets++;
            }
            if(inputLine.charAt(positionIndex) == 41){
                numberOfOpenBrackets--;
            }
        }
        if (numberOfOpenBrackets!=0){
            System.out.println("ZLE DOMKNIETE NAWIASY");
        }else{
            System.out.println("dobrze domkniete nawiasy. well done");
        }
    }
}
