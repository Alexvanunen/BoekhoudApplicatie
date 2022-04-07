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

    public Factuur(int factuurNummer, String factuurOmschrijving, double factuurBedrag, String factuurDatum, boolean debet, int btwCode, double btwBedrag, Administratie administratie) {
        this.factuurNummer = factuurNummer;
        this.factuurOmschrijving = factuurOmschrijving;
        this.factuurBedrag = factuurBedrag;
        this.factuurDatum = factuurDatum;
        this.debet = debet;
        this.btwCode = btwCode;
        this.btwBedrag = btwBedrag;
        this.administratie = administratie;
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

    @Override
    public String toString() {
        return "Factuur{" +
                "factuurNummer=" + factuurNummer +
                ", factuurOmschrijving='" + factuurOmschrijving + '\'' +
                ", factuurBedrag=" + factuurBedrag +
                ", factuurDatum='" + factuurDatum + '\'' +
                ", debet=" + debet +
                ", btwCode=" + btwCode +
                ", btwBedrag=" + btwBedrag +
                ", administratie=" + administratie +
                '}';
    }
}
