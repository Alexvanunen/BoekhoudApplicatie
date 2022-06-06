package BoekhoudApplicatie;

public class Bedrijf {
    private String bedrijfsNaam;
    private String kvkNummer;
    private String btwNummer;
    private int bedrijfsNummer;

    public Bedrijf(String bedrijfsNaam, String kvkNummer, String btwNummer, int bedrijfsNummer) {
        this.bedrijfsNaam = bedrijfsNaam;
        this.kvkNummer = kvkNummer;
        this.btwNummer = btwNummer;
        this.bedrijfsNummer = bedrijfsNummer;
    }

    public String getBedrijfsNaam() {
        return bedrijfsNaam;
    }

    public String getKvkNummer() {
        return kvkNummer;
    }

    public String getBtwNummer() {
        return btwNummer;
    }

    public int getBedrijfsNummer() {
        return bedrijfsNummer;
    }
}
