package BoekhoudApplicatie;

public class GrootboekRekening {
    private int grootboekRekeningNummer;
    private String grootboekRekeningOmschrijving;

    public GrootboekRekening(int grootboekRekeningNummer, String grootboekRekeningOmschrijving) {
        this.grootboekRekeningNummer = grootboekRekeningNummer;
        this.grootboekRekeningOmschrijving = grootboekRekeningOmschrijving;
    }

    public int getGrootboekRekeningNummer() {
        return grootboekRekeningNummer;
    }

    public String getGrootboekRekeningOmschrijving() {
        return grootboekRekeningOmschrijving;
    }
}
