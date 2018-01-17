<<<<<<< HEAD
package zadanie28;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Buuuduujemy dziwną tabelę + i - \n Podaj liczbe zlotko");

        Scanner listener = new Scanner(System.in);

        String numberLine = listener.nextLine();

        int rows = Integer.parseInt(numberLine);
        int columns = Integer.parseInt(numberLine);

        boolean [][] table  = new boolean [rows] [columns];


        int i,j;

        for (i = 0; i<rows; i++){
            for(j = 0; j< columns; j++) {

                System.out.print(table[i][j] + " ");
            }
            System.out.println( " " );
        }



=======
//package zadanie28;
//
//import java.util.Arrays;
//import java.util.Scanner;
//
//public class Main {
//    public static void main(String[] args) {
//        System.out.println("Buuuduujemy dziwną tabelę + i - \n Podaj liczbe zlotko");
//
//        Scanner listener = new Scanner(System.in);
//
//        String numberLine = listener.nextLine();
//
>>>>>>> d633f84ebee316d1985fd235026ff7261223efe0
//        try {
//            int number = Integer.parseInt(numberLine);
//            System.out.print("  ");
//            if (number <= 9) {
//                for (int i = 1; i <= number; i++) {
//                    System.out.print(" " + i);
//                }
//            }
//            if (number > 9 && number <= 99) {
//                int i = 1;
//                while (i <= number) {
//                    if (i >= 1 && i <= 9) {
//                        System.out.print("  " + i);
//                        i++;
//                    }
//                    if (i >= 10 && i <= 99) {
//                        System.out.print(" " + i);
//                        i++;
//                    }
//                }
//            }
//
//            // całość ifow mozna bylo zapisac jak nize przy pomocy 2 lub 3 cyfrowego zapisu liczb
//
//            System.out.println();
//            int rowNumber;
//            for (rowNumber = 1; rowNumber<= number; rowNumber++ ){
//
//                System.out.printf("%02d", rowNumber); // to tutaj zapisany 2 cyfrowy zapis liczb
//
//                int columnNumber;
//
//                for (columnNumber = 1; columnNumber <= number; columnNumber++) {
//
//                    int dividerCounter = 0;
//
//                    for (int divider = 1; divider>= rowNumber || divider>= columnNumber; divider++){
//
//                        if (columnNumber * rowNumber % divider == 0) {
//                            dividerCounter++;
//                        }
//                    }
//
//                    if (dividerCounter < 2) {
//                        System.out.print(" + ");
//                    } else {
//                        System.out.print(" . ");
//                    }
//                }System.out.println("");
//            }
//        } catch (NumberFormatException nfe) {
//            System.out.println("NOT A NUMBER");
//        }
<<<<<<< HEAD
    }
}


=======
//    }
//}
//
//
>>>>>>> d633f84ebee316d1985fd235026ff7261223efe0
