package Test;

import com.company.Factuur;

import static org.junit.jupiter.api.Assertions.*;

class FactuurTest {

    @org.junit.jupiter.api.Test
    void factuurVragen() {
        Factuur factuur = new Factuur();
        int er1 = 1;
        String er2 = "Auto";
        double er3 = 10000;
        String er4 = "29-03-2022";
        int er5 = 7002;
        String er6 = "Credit";

        factuur.setFactuurNummer(1);
        int AR1 = factuur.getFactuurNummer();
        factuur.setFactuurOmschrijving("Auto");
        String AR2 = factuur.getFactuurOmschrijving();
        factuur.setFactuurBedrag(10000);
        double AR3 = factuur.getFactuurBedrag();
        factuur.setFactuurDatum("29-03-2022");
        String AR4 = factuur.getFactuurDatum();
        factuur.setGrootboekRekeningNummer(7002);
        int AR5 = factuur.getGrootboekRekeningNummer();
        factuur.setDebetCredit("Credit");
        String AR6 = factuur.getDebetCredit();
        assertEquals(er1, AR1);
        assertEquals(er2, AR2);
        assertEquals(er3, AR3);
        assertEquals(er4, AR4);
        assertEquals(er5, AR5);
        assertEquals(er6, AR6);
    }
}