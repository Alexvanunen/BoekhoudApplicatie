package BoekhoudApplicatie;

import java.util.ArrayList;

public class Relatie extends Bedrijf{
    private final int relatieNummer;

    public Relatie(String bedrijfsNaam, String kvkNummer, String btwNummer, int bedrijfsNummer, int relatieNummer) {
        super(bedrijfsNaam, kvkNummer, btwNummer, bedrijfsNummer);
        this.relatieNummer = relatieNummer;
    }
    public int getRelatieNummer() {
        return relatieNummer;
    }
}
