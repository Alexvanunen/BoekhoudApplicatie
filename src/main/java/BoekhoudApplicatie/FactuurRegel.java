package BoekhoudApplicatie;

import java.util.Date;

public class FactuurRegel {
    private Date datum;
    private String omschrijving;
    private double prijs;
    Factuur factuur;

    public FactuurRegel(Date datum, String omschrijving, double prijs, Factuur factuur) {
        this.datum = datum;
        this.omschrijving = omschrijving;
        this.prijs = prijs;
        this.factuur = factuur;
    }

    public Date getDatum() {
        return datum;
    }

    public String getOmschrijving() {
        return omschrijving;
    }

    public double getPrijs() {
        return prijs;
    }
}
