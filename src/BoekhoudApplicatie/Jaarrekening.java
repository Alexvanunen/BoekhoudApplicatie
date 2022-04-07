package BoekhoudApplicatie;

import java.util.ArrayList;
import java.util.Date;

public class Jaarrekening extends FacturenLijst {
    private Date jaar;

    public Jaarrekening(ArrayList<Factuur> facturenLijst, Date periode, Date jaar) {
        super(facturenLijst, periode);
        this.jaar = jaar;
    }
}
