package zadanie8;

import java.util.Arrays;

public class MainVar1 {
    public static void main(String[] args) {
        int a = 17;
        int b = 957;
        int c = 33;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println("max int value to " + largest);
        System.out.println("min int value to " + smallest);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);

        int [] zbior = {a, b, c};
        System.out.println("\nzbior = " + Arrays.toString(zbior));

        for (int i = 0; i <= zbior.length-1; i++){
            String largestName;
            if (zbior[i] >= largest){
                largest = zbior[i];
            }
        }
        System.out.println("\nnajwieksza jest wartosc" + largest);



        for (int i = 0; i <= zbior.length-1; i++){
            if(zbior[i]<=smallest){
                smallest = zbior[i];
            }
        }
        System.out.println("\nnajmniejsza jest wartosc " + smallest);

        String ś = "ś";
        System.out.println( "\n" + ś.toUpperCase() + "roda");
        }
}
