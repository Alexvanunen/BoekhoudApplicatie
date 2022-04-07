package BoekhoudApplicatie;

import java.util.ArrayList;

public class Administratie extends Bedrijf{
    ArrayList<Relatie> relatieLijst = new ArrayList<Relatie>();
    ArrayList<Factuur> facturenLijst = new ArrayList<Factuur>();

    public Administratie(String bedrijfsNaam, String kvkNummer, String btwNummer, int bedrijfsNummer) {
        super(bedrijfsNaam, kvkNummer, btwNummer, bedrijfsNummer);
    }

    public ArrayList<Relatie> getRelatieLijst() {
        return relatieLijst;
    }

    public ArrayList<Factuur> getFacturenLijst() {
        return facturenLijst;
    }

    @Override
    public String toString() {
        return "Administratie{" +
                "relatieLijst=" + relatieLijst +
                ", facturenLijst=" + facturenLijst +
                '}';
    }
}
