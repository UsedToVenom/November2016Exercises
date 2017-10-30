package zadanie3;

public class Main {
    public static void main(String[] args) {
        String a = "siedemnascie";
        String b = "dwadziescia dwa";
        String c = "trzysta trzy";
        a = b;
        b = c;
        c = a;
        System.out.println("wartosc a = " + a + "\n wartosc b = " + b + "\n wartosc c = "+ c);

    }
}
