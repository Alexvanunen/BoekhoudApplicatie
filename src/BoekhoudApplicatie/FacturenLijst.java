package BoekhoudApplicatie;

import java.util.ArrayList;

public abstract class FacturenLijst {
    private ArrayList<Factuur> facturenLijst = new ArrayList<>();

    public FacturenLijst(ArrayList<Factuur> facturenLijst) {
        this.facturenLijst = facturenLijst;
    }

    public ArrayList<Factuur> getFacturenLijst() {
        return facturenLijst;
    }

    public void Overzicht() {
        printOverzicht();
    }

    public abstract void printOverzicht();
}