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
    // Template Method roept printOverzicht() aan.
    public void Overzicht() {
        printOverzicht();
    }
    // Methode printOverzicht() wordt gedeclareerd en wordt override in de subclasses.
    public void printOverzicht() {}
}