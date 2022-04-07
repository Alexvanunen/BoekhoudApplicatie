package BoekhoudApplicatie;

import java.util.ArrayList;
import java.util.Date;

public class WinstEnVerlies extends FacturenLijst{
    private Date kwartaal;

    public WinstEnVerlies(ArrayList<Factuur> facturenLijst, Date periode, Date kwartaal) {
        super(facturenLijst, periode);
        this.kwartaal = kwartaal;
    }
}
