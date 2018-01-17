package zadanie28;

import java.util.Scanner;

public class MainThursday {

    public static void main(String[] args) {
        System.out.println("Buuuduujemy dziwną tabelę + i - \n Podaj liczbe zlotko");

        Scanner listener = new Scanner(System.in);

        String numberLine = listener.nextLine();

        try{
            int number = Integer.parseInt(numberLine);

            boolean tableOfTables [][] = new boolean [number + 1] [number + 1];

            int commonDivider;

            int rowNumber = 1;

            int columnNumber = 1;


            for ( rowNumber = 1; rowNumber <= number; rowNumber++) {

                for (columnNumber = 1; columnNumber <= number; columnNumber++){

                    for(commonDivider = 2; commonDivider < number; commonDivider++){

                        if (rowNumber % commonDivider == 0 && columnNumber % commonDivider == 0) {

                            tableOfTables[rowNumber][columnNumber] = true;
                            break;
                        }
                    }
                }
            }
            for (columnNumber = 0; columnNumber <= number; columnNumber++){
                System.out.printf("%02d", columnNumber);
                System.out.print(" ");;}
            System.out.println("");
            for (rowNumber = 1; rowNumber <= number; rowNumber++){
                for (columnNumber = 0; columnNumber <= number; columnNumber++){
                    if(columnNumber == 0){
                        System.out.printf("%02d", rowNumber);}
                    else {
                        if (tableOfTables[columnNumber][rowNumber] == true){
                            System.out.print(" . ");
                        }else{
                            System.out.print(" + ");
                        }}

                }
                System.out.println(" ");
            }


        }catch(NumberFormatException nfe){

            System.out.println("Not a Number!");
        }



    }
}

