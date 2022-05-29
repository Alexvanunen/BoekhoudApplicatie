package BoekhoudApplicatie;

import java.util.Date;

public class Factuur {
    private int factuurNummer;
    private String factuurOmschrijving;
    private double factuurBedrag;
    private String factuurDatum;
    private boolean debet;
    private int btwCode;
    private double btwBedrag;
    Administratie administratie;
    private boolean isBetaald;
    private int betalingsTermijn;
    private boolean nieuweKlant;
    private int leeftijdKlant;

    public Factuur(int factuurNummer, String factuurOmschrijving, double factuurBedrag, String factuurDatum, boolean debet, int btwCode, double btwBedrag, Administratie administratie, boolean isBetaald, int betalingsTermijn, boolean nieuweKlant, int leeftijdKlant) {
        this.factuurNummer = factuurNummer;
        this.factuurOmschrijving = factuurOmschrijving;
        this.factuurBedrag = factuurBedrag;
        this.factuurDatum = factuurDatum;
        this.debet = debet;
        this.btwCode = btwCode;
        this.btwBedrag = btwBedrag;
        this.administratie = administratie;
        this.isBetaald = isBetaald;
        this.betalingsTermijn = betalingsTermijn;
        this.nieuweKlant = nieuweKlant;
        this.leeftijdKlant = leeftijdKlant;
    }

    public int getFactuurNummer() {
        return factuurNummer;
    }

    public String getFctuurOmschrijving() {
        return factuurOmschrijving;
    }

    public double getFactuurBedrag() {
        return factuurBedrag;
    }

    public String getFactuurDatum() {
        return factuurDatum;
    }

    public boolean isDebet() {
        return debet;
    }

    public int getBtwCode() {
        return btwCode;
    }

    public double getBtwBedrag() {
        return btwBedrag;
    }

    public boolean getIsBetaald() {
        return isBetaald;
    }

    public int getBetalingsTermijn() {
        return betalingsTermijn;
    }

    public boolean getNieuweKlant() {
        return nieuweKlant;
    }

    public int getLeeftijdKlant() {
        return leeftijdKlant;
    }

    //Methode berekenBtwBedrag
    public double berekenBtwBedrag(double factuurBedrag) {
        if(btwCode == 0){
            btwBedrag = 0;
        }
        if(btwCode == 1){
            btwBedrag = (this.factuurBedrag / 109) * 9;
        }
        if(btwCode == 2){
            btwBedrag = (this.factuurBedrag / 121) * 21;
        }
        return btwBedrag;
    }
    public boolean checkBedragExcl(double factuurBedrag, int btwCode, double btwBedrag, boolean isBetaald){
        if(btwCode == 1 && (((factuurBedrag / 109) * 9 == btwBedrag) && isBetaald)) {
            return true;
        }
        else if(btwCode == 2 && ((factuurBedrag / 121) * 21 == btwBedrag && isBetaald)) {
            return true;
        }
        return false;
    }
    public String checkFactuurBedrag(double factuurBedrag){
        // Factuurbedrag is 0 tot 100 euro (laag)
        if (factuurBedrag == 0 || factuurBedrag > 0 && factuurBedrag < 100){
            return "Factuurbedrag is laag";
        }
        // Factuurbedrag is 100 tot 1000 euro (gemiddeld)
        else if (factuurBedrag >= 100 && factuurBedrag < 1000){
            return "Factuurbedrag is gemiddeld";
        }
        // Factuurbedrag is 1000 euro of groter (hoog)
        return "Factuurbedrag is hoog";
    }
    public String checkBetalingsKorting(double factuurBedrag, int betalingsTermijn, boolean nieuweKlant, int leeftijdKlant){
        //    Factuurbedrag laag = 0 % korting
        //    Factuurbedrag middel = 3% korting
        //    Factuurbedrag hoog = 5% korting
        //    Betalingstermijn true = 5% korting
        //    Nieuwe klant = 4% korting
        //    Klant 65+ = 2% korting
        //    Factuurbedrag laag = 0 % korting
        //    Factuurbedrag middel = 3% korting
        //    Factuurbedrag hoog = 5% korting
        //    Betalingstermijn true = 5% korting
        //    Nieuwe klant = 4% korting
        //    Klant 65+ = 2% korting
        if (factuurBedrag >= 0 && factuurBedrag <= 100 && betalingsTermijn == 14 && nieuweKlant && leeftijdKlant >= 65){
            return "11% betalingskorting";
        }
        if (factuurBedrag >= 0 && factuurBedrag < 100 && betalingsTermijn != 14 && !nieuweKlant && leeftijdKlant < 65){
            return "0% betalingskorting";
        }
        if (factuurBedrag >= 100 && factuurBedrag < 1000 && betalingsTermijn == 14 && !nieuweKlant && leeftijdKlant < 65){
            return "8% betalingskorting";
        }
        if (factuurBedrag >= 100 && factuurBedrag < 1000 && betalingsTermijn != 14 && nieuweKlant && leeftijdKlant >= 65){
            return "9% betalingskorting";
        }
        if (factuurBedrag >= 1000 && betalingsTermijn == 14 && nieuweKlant && leeftijdKlant < 65){
            return "14% betalingskorting";
        }
        if (factuurBedrag >= 1000 && betalingsTermijn != 14 && !nieuweKlant && leeftijdKlant >= 65){
            return "7% betalingskorting";
        }
        return "Geen betalingskorting";
    }
}
