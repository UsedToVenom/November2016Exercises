package zadanie6;

public class Main {
    public static void main(String[] args) {
        int ocenaMatematyka = 3;
        int ocenaChemia = 5;
        int ocenaJPolski = 6;
        int ocenaWos = 1;
        int ocenaInformatyka = 4;

        int sredniaAll = (ocenaChemia + ocenaInformatyka + ocenaJPolski + ocenaMatematyka + ocenaWos)/5;
        int sredniaScisle = (ocenaChemia + ocenaInformatyka + ocenaMatematyka)/3;
        int sredniaHumanistyczne = (ocenaJPolski + ocenaWos)/2;

        System.out.println("srednia ze wszystkiego = " + sredniaAll);
        System.out.println("srednia ze scislych = " + sredniaScisle);
        System.out.println("srednia z humanistycznych = " + sredniaHumanistyczne);

if (ocenaChemia == 1){
    System.out.println("Pala z chemii");
}
if (ocenaInformatyka == 1){
    System.out.println("Pala z informatyki. WSTYD!");
}
if (ocenaJPolski == 1){
    System.out.println("Pala z polskiego");
}
if (ocenaMatematyka == 1){
    System.out.println("Pala z matematyki! WSTYYYYD");
}
if (ocenaWos == 1){
    System.out.println("Pala z WOS'u");
}
if (sredniaAll == 1){
    System.out.println("srednia z wszystkiego NDST!!");
}
if (sredniaHumanistyczne == 1) {
    System.out.println("paly z humanistycznych");
}
if (sredniaScisle == 1){
    System.out.println("paly ze scislych!");
}
        System.out.println(sredniaScisle + " " + sredniaHumanistyczne + " " + sredniaAll);

    }

}
