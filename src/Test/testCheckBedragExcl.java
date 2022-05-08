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
        Factuur factuur1 = new Factuur(1, "Auto", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        Factuur factuur2 = new Factuur(2, "Auto2", 10900.0, "02-04-2022", false, 1, 900, administratie, true);
        Factuur factuur3 = new Factuur(3, "Auto3", 10000.0, "02-04-2022", false, 0, 0, administratie, true);
        // Actual result
        boolean actualResult1 = factuur1.checkBedragExcl(factuur1.getFactuurBedrag(),factuur1.getBtwCode(),factuur1.getBtwBedrag(), factuur1.getIsBetaald());
        boolean actualResult2 = factuur2.checkBedragExcl(factuur2.getFactuurBedrag(),factuur2.getBtwCode(),factuur2.getBtwBedrag(), factuur2.getIsBetaald());
        boolean actualResult3 = factuur3.checkBedragExcl(factuur3.getFactuurBedrag(),factuur3.getBtwCode(),factuur3.getBtwBedrag(), factuur3.getIsBetaald());
        // actualResult 1 Btw Hoog == True
        //assertTrue(actualResult1);
        // actualResult 2 Btw Laag == True
        //assertTrue(actualResult2);
        // actualResult 3 Btw Null = True
        //assertTrue(actualResult3);

        // Testen voor coverage met Btw-percentage Hoog
        Factuur factuur4 = new Factuur(4, "Auto4", 12100.0, "02-04-2022", false, 0, 0, administratie, true);
        Factuur factuur5 = new Factuur(5, "Auto5", 12100.0, "02-04-2022", false, 0, 2100, administratie, false);
        Factuur factuur6 = new Factuur(6, "Auto6", 12100.0, "02-04-2022", false, 2, 0, administratie, false);
        Factuur factuur7 = new Factuur(7, "Auto6", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        boolean actualResult4 = factuur4.checkBedragExcl(factuur4.getFactuurBedrag(),factuur4.getBtwCode(),factuur4.getBtwBedrag(), factuur4.getIsBetaald());
        boolean actualResult5 = factuur5.checkBedragExcl(factuur5.getFactuurBedrag(),factuur5.getBtwCode(),factuur5.getBtwBedrag(), factuur5.getIsBetaald());
        boolean actualResult6 = factuur6.checkBedragExcl(factuur6.getFactuurBedrag(),factuur6.getBtwCode(),factuur6.getBtwBedrag(), factuur6.getIsBetaald());
        boolean actualResult7 = factuur7.checkBedragExcl(factuur7.getFactuurBedrag(),factuur7.getBtwCode(),factuur7.getBtwBedrag(), factuur7.getIsBetaald());

        // Btw Code 0 (Fout) && btw-bedrag (Fout) && Betaald (Goed)
        assertFalse(actualResult4);
        // Btw Code 0 (Fout) && btw-bedrag (Goed) && Betaald (Fout)
        assertFalse(actualResult5);
        // Btw Code 2 (Goed) && btw-bedrag (Fout) && (Fout)
        assertFalse(actualResult6);
        // Btw Code 2 (Goed) && btw-bedrag (Goed) && (Goed)
        assertTrue(actualResult7);
    }
}