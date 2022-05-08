package Test;

import BoekhoudApplicatie.Administratie;
import BoekhoudApplicatie.Factuur;
import BoekhoudApplicatie.Relatie;

import static org.junit.jupiter.api.Assertions.*;

public class testCheckBedragExcl {
    @org.junit.jupiter.api.Test
    void TestCheckBedragExcl() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        Factuur factuur1 = new Factuur(1, "Auto", 12100.0, "02-04-2022", false, 2, 2100, administratie);
        Factuur factuur2 = new Factuur(2, "Auto2", 10900.0, "02-04-2022", false, 1, 900, administratie);
        Factuur factuur3 = new Factuur(3, "Auto3", 10000.0, "02-04-2022", false, 0, 900, administratie);
        // Actual result
        boolean actualResult1 = factuur1.checkBedragExcl(factuur1.getFactuurBedrag(),factuur1.getBtwCode(),factuur1.getBtwBedrag());
        boolean actualResult2 = factuur2.checkBedragExcl(factuur2.getFactuurBedrag(),factuur2.getBtwCode(),factuur2.getBtwBedrag());
        boolean actualResult3 = factuur3.checkBedragExcl(factuur3.getFactuurBedrag(),factuur3.getBtwCode(),factuur3.getBtwBedrag());
        // actualResult 1 Btw Hoog == True
        assertTrue(actualResult1);
        // actualResult 2 Btw Laag == True
        assertTrue(actualResult2);
        // actualResult 3 Btw Null = False
        assertFalse(actualResult3);
    }
}