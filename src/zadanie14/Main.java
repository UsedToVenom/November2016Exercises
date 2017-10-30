package zadanie14;

public class Main {
    public static void main(String[] args) {
        System.out.println("straight copy1");
        for (int i = 65; i <= 90; i++) {
            System.out.println((char)i);
        }
        System.out.println("\nStraight copy2");
        for (char alphabet = 'Z'; alphabet >= 'A'; alphabet--) {
            System.out.println(alphabet);
        }
    }
}
