package BoekhoudApplicatie;

import java.util.ArrayList;

public class Jaarrekening extends FacturenLijst {

    public Jaarrekening(ArrayList<Factuur> facturenLijst) {
        super(facturenLijst);
    }
    @Override
    public void printOverzicht() {
        for (Factuur s : getFacturenLijst()) {
            System.out.println(s.toString());
        }
    }
}