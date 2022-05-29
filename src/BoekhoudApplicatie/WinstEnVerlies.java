package BoekhoudApplicatie;

import java.util.ArrayList;
import java.util.Date;

public class WinstEnVerlies extends FacturenLijst {

    public WinstEnVerlies(ArrayList<Factuur> facturenLijst, Date periode) {
        super(facturenLijst, periode);
    }

    @Override
    public void printOverzicht() {
        System.out.println("Hoi");
    }
}