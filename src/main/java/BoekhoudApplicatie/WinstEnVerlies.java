package BoekhoudApplicatie;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class WinstEnVerlies extends FacturenLijst {

    public WinstEnVerlies(ArrayList<Factuur> facturenLijst) {
        super(facturenLijst);
    }
    // Methode uit parent wordt ge-override
    @Override
    public void printOverzicht() {
        int totaleOpbrengst = 0;
        int totaleUitgaven = 0;
        String periode = "";
        for(Factuur s: getFacturenLijst()){
            if(s.isDebet()){
                totaleOpbrengst += s.getFactuurBedrag();
            }
            else if (!s.isDebet()) {
                totaleUitgaven += s.getFactuurBedrag();
            }
            periode = s.getFactuurDatum();
        }
        System.out.println("Periode: " + periode);
        System.out.println(totaleOpbrengst + " euro debet geboekt");
        System.out.println(totaleUitgaven + " euro credit geboekt");
    }
}