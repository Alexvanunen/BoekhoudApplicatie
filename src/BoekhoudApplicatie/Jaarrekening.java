package BoekhoudApplicatie;

import java.util.ArrayList;
import java.util.Date;

public class Jaarrekening extends FacturenLijst {

    private Jaarrekening(ArrayList<Factuur> facturenLijst, Date periode) {
        super(facturenLijst, periode);
    }
    @Override
    public void printOverzicht() {
        System.out.println("Hallo");
    }
}
