package BoekhoudApplicatie;


public class Main {

    public static void main(String[] args) {
//        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
//        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
//        Factuur factuur = new Factuur(1, "Auto", 12100, "02-04-2022", false, 2, 2100, administratie);
//        System.out.println(factuur.berekenBtwBedrag(factuur.getFactuurBedrag()));
//        System.out.println(factuur.toString());
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        Factuur factuur1 = new Factuur(1, "Auto", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        Factuur factuur2 = new Factuur(2, "Auto2", 10900.0, "02-04-2022", false, 1, 900, administratie, true);
        Factuur factuur3 = new Factuur(3, "Auto3", 10000.0, "02-04-2022", false, 1, 900, administratie, true);
        //factuur1.checkBedragExcl(factuur1.getFactuurBedrag(),factuur1.getBtwCode(), factuur1.getBtwBedrag());
        System.out.println(factuur1.checkBedragExcl(factuur1.getFactuurBedrag(),factuur1.getBtwCode(), factuur1.getBtwBedrag(), factuur1.getIsBetaald()));
        System.out.println(factuur2.checkBedragExcl(factuur2.getFactuurBedrag(),factuur2.getBtwCode(), factuur2.getBtwBedrag(), factuur1.getIsBetaald()));
        System.out.println(factuur3.checkBedragExcl(factuur3.getFactuurBedrag(),factuur3.getBtwCode(), factuur3.getBtwBedrag(), factuur1.getIsBetaald()));
    }
}