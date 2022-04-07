package BoekhoudApplicatie;

public class Main {

    public static void main(String[] args) {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        Factuur factuur = new Factuur(1, "Auto", 12100, "7-4-2022", false, 2, 2100, administratie);
        System.out.println(factuur.berekenBtwBedrag(factuur.getFactuurBedrag()));
        System.out.println(factuur.toString());
    }
}