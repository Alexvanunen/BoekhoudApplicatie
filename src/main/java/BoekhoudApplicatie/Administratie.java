package BoekhoudApplicatie;

import java.util.ArrayList;

public class Administratie extends Bedrijf{
    private final int administratieNummer;

    public Administratie(String bedrijfsNaam, String kvkNummer, String btwNummer, int bedrijfsNummer, int administratieNummer) {
        super(bedrijfsNaam, kvkNummer, btwNummer, bedrijfsNummer);
        this.administratieNummer = administratieNummer;
    }

    public int getAdministratieNummer() {
        return administratieNummer;
    }
}
