package BoekhoudApplicatie;


import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2, 1);
        Factuur factuur1 = new Factuur(1, "Auto1", 50, "02-04-2022", false, 0, 0, administratie, false, 14, true, 65, Belasting.getInstance().getBelastingType());
        Factuur factuur2 = new Factuur(2, "Auto2", 100, "02-04-2022", false, 0, 0, administratie, false, 14, true, 65, Belasting.getInstance().getBelastingType());
        ArrayList <Factuur> lijst = new ArrayList<>();
        lijst.add(factuur1);
        lijst.add(factuur2);
        FacturenLijst winstEnVerliesRekening = new WinstEnVerlies(lijst);
        FacturenLijst jaarRekening = new Jaarrekening(lijst);
//        winstEnVerliesRekening.printOverzicht();
        jaarRekening.printOverzicht();
    }
}