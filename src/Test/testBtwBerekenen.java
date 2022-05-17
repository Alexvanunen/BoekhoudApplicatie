package Test;
import BoekhoudApplicatie.Factuur;
import BoekhoudApplicatie.Administratie;
import BoekhoudApplicatie.Relatie;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class testBtwBerekenen {

    @org.junit.jupiter.api.Test
    void TestBtwBerekenen() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        Factuur factuur1 = new Factuur(1, "Auto", 12100.0, "02-04-2022", false, 2, 2100, administratie, true, 14, true, 30);
        Factuur factuur2 = new Factuur(2, "Auto2", 10900.0, "02-04-2022", false, 1, 900, administratie, true, 14, true, 30);
        // Expected
        double expectedResult1 = 2100.0;
        double expectedResult2 = 900.0;
        // Actual
        double actualResult1 = factuur1.berekenBtwBedrag(factuur1.getFactuurBedrag());
        double actualResult2 = factuur2.berekenBtwBedrag(factuur2.getFactuurBedrag());

        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }
}