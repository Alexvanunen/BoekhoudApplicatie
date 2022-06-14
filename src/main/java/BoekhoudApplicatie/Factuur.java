package BoekhoudApplicatie;

import java.util.Date;

public class Factuur {
    private int factuurNummer;
    private String factuurOmschrijving;
    private double factuurBedrag;
    private String factuurDatum;
    private boolean debet;
    Administratie administratie;
    private boolean isBetaald;
    private int betalingsTermijn;
    private boolean nieuweKlant;
    private int leeftijdKlant;
    private String belastingType;

    public Factuur(int factuurNummer, String factuurOmschrijving, double factuurBedrag, String factuurDatum, boolean debet, Administratie administratie, boolean isBetaald, int betalingsTermijn, boolean nieuweKlant, int leeftijdKlant, String belastingType) {
        this.factuurNummer = factuurNummer;
        this.factuurOmschrijving = factuurOmschrijving;
        this.factuurBedrag = factuurBedrag;
        this.factuurDatum = factuurDatum;
        this.debet = debet;
        this.administratie = administratie;
        this.isBetaald = isBetaald;
        this.betalingsTermijn = betalingsTermijn;
        this.nieuweKlant = nieuweKlant;
        this.leeftijdKlant = leeftijdKlant;
        this.belastingType = Belasting.getInstance().getBelastingType();
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

    public String getBelastingType() {
        return belastingType;
    }

    public void setFactuurNummer(int factuurNummer) {
        this.factuurNummer = factuurNummer;
    }

    public void setFactuurOmschrijving(String factuurOmschrijving) {
        this.factuurOmschrijving = factuurOmschrijving;
    }

    public void setFactuurBedrag(double factuurBedrag) {
        this.factuurBedrag = factuurBedrag;
    }

    public void setFactuurDatum(String factuurDatum) {
        this.factuurDatum = factuurDatum;
    }

    public void setDebet(boolean debet) {
        this.debet = debet;
    }

    public void setAdministratie(Administratie administratie) {
        this.administratie = administratie;
    }

    public void setBetaald(boolean betaald) {
        isBetaald = betaald;
    }

    public void setBetalingsTermijn(int betalingsTermijn) {
        this.betalingsTermijn = betalingsTermijn;
    }

    public void setNieuweKlant(boolean nieuweKlant) {
        this.nieuweKlant = nieuweKlant;
    }

    public void setLeeftijdKlant(int leeftijdKlant) {
        this.leeftijdKlant = leeftijdKlant;
    }

    public void setBelastingType(String belastingType) {
        this.belastingType = belastingType;
    }

    public String checkFactuurBedrag(){
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
    public String toString() {
        return  '{' + "\n" +
                "factuurNummer = " + factuurNummer + "\n" +
                "factuurOmschrijving = " + factuurOmschrijving + "\n" +
                "factuurBedrag = " + factuurBedrag + "\n" +
                "factuurDatum = " + factuurDatum + "\n" +
                "debet = " + debet + "\n" +
                "isBetaald = " + isBetaald + "\n" +
                "betalingsTermijn = " + betalingsTermijn + "\n" +
                "nieuweKlant = " + nieuweKlant + "\n" +
                "leeftijdKlant = " + leeftijdKlant + "\n" +
                "belastingType = " + belastingType + "\n" +
                '}';
    }
}