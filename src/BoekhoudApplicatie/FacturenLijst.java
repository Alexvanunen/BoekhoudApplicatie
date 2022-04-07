package BoekhoudApplicatie;

import java.util.ArrayList;
import java.util.Date;

public class FacturenLijst {
    private ArrayList<Factuur> facturenLijst = new ArrayList<Factuur>();
    private Date periode;

    public FacturenLijst(ArrayList<Factuur> facturenLijst, Date periode) {
        this.facturenLijst = facturenLijst;
        this.periode = periode;
    }

    public ArrayList<Factuur> getFacturenLijst() {
        return facturenLijst;
    }

    public Date getPeriode() {
        return periode;
    }

    public void setPeriode(Date periode) {
        this.periode = periode;
    }
}
