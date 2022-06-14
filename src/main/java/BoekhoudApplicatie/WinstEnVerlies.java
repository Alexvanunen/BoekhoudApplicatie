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
        int totaleWinst = 0;
        int totaleVerlies = 0;
        String periode = "";
        for(Factuur s: getFacturenLijst()){
            if(s.isDebet()){
                totaleWinst += s.getFactuurBedrag();
            }
            else if (!s.isDebet()) {
                totaleVerlies += s.getFactuurBedrag();
            }
            periode = s.getFactuurDatum();
        }
        System.out.println("Periode: " + periode);
        System.out.println(totaleWinst + " euro debet geboekt");
        System.out.println(totaleVerlies + " euro credit geboekt");
    }
}