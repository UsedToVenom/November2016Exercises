package zadanie5;

public class Main {
    public static void main(String[] args) {

        int waga = 166;
        int wzrost = 166;
        int wiek = 65;
        boolean waga_check = true;
        boolean wzrostCheckHigh = true;
        boolean wzrostCheckLow = true;
        boolean wiekCheckHigh = true;
        boolean wiekCheckLow = true;


        if (waga >= 180){
            System.out.println("osoba za ciezka!");
            waga_check = false;
        }
        if (wzrost <= 150){
            System.out.println("osoba za niska");
            wzrostCheckLow = false;
        }
        if (wiek < 10){
            System.out.println("osoba za mloda");
            wiekCheckLow = false;
        }
        if ( wiek >= 80){
            System.out.println("osoba za stara");
            wiekCheckHigh = false;
        }
        if (wzrost >= 220){
            System.out.println("osoba za wysoka");
            wzrostCheckHigh = false;
        }
        if ( wzrostCheckHigh == true && waga_check == true && wzrostCheckLow == true && wiekCheckHigh == true && wiekCheckLow == true){
            System.out.println("jest zgoda na wejscie");
        }
        else if ( wzrostCheckHigh == false || waga_check == false || wzrostCheckLow == false || wiekCheckHigh == false || wiekCheckLow == false) {
            System.err.println("Brak zgody na wejscie");
        }
          }
}
