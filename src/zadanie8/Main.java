package zadanie8;

import java.lang.reflect.Array;

public class Main {
    public static void main(String[] args) {

        int a = 17;
        int b = 33;
        int c = 33;
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;

        System.out.println(largest);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        if( a>= b && a >= c){
            System.out.println("najwieksza jest a");
            largest = a;
        }
        if ( b >= a && b >= c){
            System.out.println("najwieksza jest b");
            largest = b;
        }
        if (c >= a && c >= b){
            System.out.println("najwieksza jest c");
            largest = c;
        }
        if( a<= b && a <= c){
            System.out.println("najmniejsza jest a");
            smallest = a;
        }
        if ( b <= a && b <= c){
            System.out.println("najmniejsza jest b");
            smallest = b;
        }
        if (c <= a && c <= b){
            System.out.println("najmniejsza jest c");
            smallest = c;
        }

        System.out.println("Najwieksza jest wartosc = " + largest);
        System.out.println("Najmniejsza jest wartosc = " + smallest);


    }
}
