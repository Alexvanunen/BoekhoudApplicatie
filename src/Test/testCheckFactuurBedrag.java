package Test;
import BoekhoudApplicatie.Administratie;
import BoekhoudApplicatie.Factuur;
import BoekhoudApplicatie.Relatie;

import static org.junit.jupiter.api.Assertions.*;

public class testCheckFactuurBedrag {
    @org.junit.jupiter.api.Test
    void testCheckFactuurBedragLaag() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        Factuur factuur1 = new Factuur(1, "Auto", 0, "02-04-2022", false, 0, 0, administratie, true);
        Factuur factuur2 = new Factuur(2, "Auto", 99, "02-04-2022", false, 0, 0, administratie, true);
        String expectedResult1 = "Factuurbedrag is laag";
        String actualResult1 = factuur1.checkFactuurBedrag(factuur1.getFactuurBedrag());
        String expectedResult2 = "Factuurbedrag is laag";
        String actualResult2 = factuur2.checkFactuurBedrag(factuur2.getFactuurBedrag());
        assertEquals(expectedResult1, actualResult1);
        assertEquals(expectedResult2, actualResult2);
    }
    @org.junit.jupiter.api.Test
    void testCheckFactuurBedragGemiddeld() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        Factuur factuur3 = new Factuur(3, "Auto", 100, "02-04-2022", false, 0, 0, administratie, true);
        Factuur factuur4 = new Factuur(4, "Auto", 101, "02-04-2022", false, 0, 0, administratie, true);
        Factuur factuur6 = new Factuur(5, "Auto", 999, "02-04-2022", false, 0, 0, administratie, true);
        String expectedResult3 = "Factuurbedrag is gemiddeld";
        String actualResult3 = factuur3.checkFactuurBedrag(factuur3.getFactuurBedrag());
        String expectedResult4 = "Factuurbedrag is gemiddeld";
        String actualResult4 = factuur4.checkFactuurBedrag(factuur4.getFactuurBedrag());
        String expectedResult5 = "Factuurbedrag is gemiddeld";
        String actualResult5 = factuur4.checkFactuurBedrag(factuur4.getFactuurBedrag());
        assertEquals(expectedResult3, actualResult3);
        assertEquals(expectedResult4, actualResult4);
        assertEquals(expectedResult5, actualResult5);
    }
    @org.junit.jupiter.api.Test
    void testCheckFactuurBedragHoog() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        Factuur factuur6 = new Factuur(6, "Auto", 1000, "02-04-2022", false, 0, 0, administratie, true);
        Factuur factuur7 = new Factuur(7, "Auto", 1001, "02-04-2022", false, 0, 0, administratie, true);
        String expectedResult6 = "Factuurbedrag is hoog";
        String actualResult6 = factuur6.checkFactuurBedrag(factuur6.getFactuurBedrag());
        String expectedResult7 = "Factuurbedrag is hoog";
        String actualResult7 = factuur7.checkFactuurBedrag(factuur7.getFactuurBedrag());
        assertEquals(expectedResult6, actualResult6);
        assertEquals(expectedResult7, actualResult7);
    }

}
