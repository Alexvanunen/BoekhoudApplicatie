package BoekhoudApplicatie;

import java.util.ArrayList;

public class WinstEnVerlies extends FacturenLijst {

    public WinstEnVerlies(ArrayList<Factuur> facturenLijst) {
        super(facturenLijst);
    }

    @Override
    public void printOverzicht() {
        for(Factuur s: getFacturenLijst()){
            System.out.println(s.toString());
        }
    }
}