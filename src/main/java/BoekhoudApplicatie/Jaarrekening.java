package BoekhoudApplicatie;

import java.util.ArrayList;

public class Jaarrekening extends FacturenLijst {

    public Jaarrekening(ArrayList<Factuur> facturenLijst) {
        super(facturenLijst);
    }
    // Methode uit parent wordt ge-override
    @Override
    public void printOverzicht() {
        ArrayList<Factuur> x = new ArrayList<Factuur>();
        x.addAll(getFacturenLijst());
        String beginDatum = "";
        String eindDatum = "";
        System.out.println(x.get(0));
    }
}