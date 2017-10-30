package zadanie4;

public class Main {
    public static void main(String[] args) {


        boolean jest_cieplo = false;
        boolean wieje_wiatr = false;
        boolean swieci_slonce = false;

        boolean ubieram_sie_cieplo;
        boolean biore_parasol;
        boolean ubieram_kurtke;

        if (jest_cieplo == false || wieje_wiatr == false){
            ubieram_sie_cieplo = true;
            System.out.println("ubieram sie cieplo = " + ubieram_sie_cieplo);
        }

        if (swieci_slonce == false && wieje_wiatr == false){
            biore_parasol = true;
            System.out.println("biore parasol = " + biore_parasol);
        }
        if (wieje_wiatr == true && swieci_slonce == false && jest_cieplo == false){
            ubieram_kurtke = true;
            System.out.println("ubieram kurtke = " + ubieram_kurtke);
        }

    }

}