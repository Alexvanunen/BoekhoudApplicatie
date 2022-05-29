package Test;

import BoekhoudApplicatie.Administratie;
import BoekhoudApplicatie.Factuur;
import BoekhoudApplicatie.Relatie;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class testBetalingsKorting {
    @org.junit.jupiter.api.Test
    void testBetalingsKorting() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        // 1 1 1 1
        Factuur factuur1 = new Factuur(1, "Auto1", 50, "02-04-2022", false, 0, 0, administratie, false, 14, true, 65, "OmzetBelasting");
        // 1 0 0 0
        Factuur factuur2 = new Factuur(2, "Auto2", 50, "02-04-2022", false, 0, 0, administratie, true, 30, false, 30, "OmzetBelasting");
        // 1 1 0 0
        Factuur factuur3 = new Factuur(3, "Auto3", 500, "02-04-2022", false, 0, 0, administratie, false, 14, false, 30, "OmzetBelasting");
        // 1 0 1 1
        Factuur factuur4 = new Factuur(4, "Auto4", 500, "02-04-2022", false, 0, 0, administratie, true, 30, true, 65, "OmzetBelasting");
        // 1 1 1 0
        Factuur factuur5 = new Factuur(5, "Auto5", 1200, "02-04-2022", false, 0, 0, administratie, false, 14, true, 30, "OmzetBelasting");
        // 1 0 0 1
        Factuur factuur6 = new Factuur(6, "Auto6", 1200, "02-04-2022", false, 0, 0, administratie, true, 30, false, 65, "OmzetBelasting");
        String expectedResult1 = "11% betalingskorting";
        String actualResult1 = factuur1.checkBetalingsKorting(factuur1.getFactuurBedrag(), factuur1.getBetalingsTermijn(), factuur1.getNieuweKlant(), factuur1.getLeeftijdKlant());
        String expectedResult2 = "0% betalingskorting";
        String actualResult2 = factuur2.checkBetalingsKorting(factuur2.getFactuurBedrag(), factuur2.getBetalingsTermijn(), factuur2.getNieuweKlant(), factuur2.getLeeftijdKlant());
        String expectedResult3 = "8% betalingskorting";
        String actualResult3 = factuur3.checkBetalingsKorting(factuur3.getFactuurBedrag(), factuur3.getBetalingsTermijn(), factuur3.getNieuweKlant(), factuur3.getLeeftijdKlant());
        String expectedResult4 = "9% betalingskorting";
        String actualResult4 = factuur4.checkBetalingsKorting(factuur4.getFactuurBedrag(), factuur4.getBetalingsTermijn(), factuur4.getNieuweKlant(), factuur4.getLeeftijdKlant());
        String expectedResult5 = "14% betalingskorting";
        String actualResult5 = factuur5.checkBetalingsKorting(factuur5.getFactuurBedrag(), factuur5.getBetalingsTermijn(), factuur5.getNieuweKlant(), factuur5.getLeeftijdKlant());
        String expectedResult6 = "7% betalingskorting";
        String actualResult6 = factuur6.checkBetalingsKorting(factuur6.getFactuurBedrag(), factuur6.getBetalingsTermijn(), factuur6.getNieuweKlant(), factuur6.getLeeftijdKlant());
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
        assertEquals(expectedResult3, actualResult3);
        assertEquals(expectedResult4, actualResult4);
        assertEquals(expectedResult5, actualResult5);
        assertEquals(expectedResult6, actualResult6);
    }
}
