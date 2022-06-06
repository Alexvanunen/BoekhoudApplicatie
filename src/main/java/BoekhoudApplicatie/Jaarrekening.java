package BoekhoudApplicatie;

import java.util.ArrayList;

public class Jaarrekening extends FacturenLijst {

    public Jaarrekening(ArrayList<Factuur> facturenLijst) {
        super(facturenLijst);
    }
    // Methode uit parent wordt ge-override
    @Override
    public void printOverzicht() {
        for (Factuur s : getFacturenLijst()) {
            System.out.println(s.toString());
        }
    }
}