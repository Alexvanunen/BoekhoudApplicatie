package Test;

import BoekhoudApplicatie.Administratie;
import BoekhoudApplicatie.Factuur;
import BoekhoudApplicatie.Relatie;

import static org.junit.jupiter.api.Assertions.*;

public class testCheckBedragExcl {
    @org.junit.jupiter.api.Test
    // Condition Coverage Test
    void ConditionCoverageTestCheckBedragExcl() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        // 0 0 0
        Factuur factuur1 = new Factuur(1, "Auto1", 12100.0, "02-04-2022", false, 0, 0, administratie, false);
        // 1 1 1
        Factuur factuur2 = new Factuur(2, "Auto2", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        boolean actualResult1 = factuur1.checkBedragExcl(factuur1.getFactuurBedrag(),factuur1.getBtwCode(),factuur1.getBtwBedrag(), factuur1.getIsBetaald());
        boolean actualResult2 = factuur2.checkBedragExcl(factuur2.getFactuurBedrag(),factuur2.getBtwCode(),factuur2.getBtwBedrag(), factuur2.getIsBetaald());
        assertFalse(actualResult1);
        assertTrue(actualResult2);
    }
    @org.junit.jupiter.api.Test
    // Decision Coverage Test
    void DecisionCoverageTestCheckBedragExcl() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        // 0 0 0
        Factuur factuur3 = new Factuur(3, "Auto3", 12100.0, "02-04-2022", false, 0, 0, administratie, false);
        // 1 1 1
        Factuur factuur4 = new Factuur(4, "Auto4", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        boolean actualResult3 = factuur3.checkBedragExcl(factuur3.getFactuurBedrag(), factuur3.getBtwCode(), factuur3.getBtwBedrag(), factuur3.getIsBetaald());
        boolean actualResult4 = factuur4.checkBedragExcl(factuur4.getFactuurBedrag(), factuur4.getBtwCode(), factuur4.getBtwBedrag(), factuur4.getIsBetaald());
        assertFalse(actualResult3);
        assertTrue(actualResult4);
    }
    @org.junit.jupiter.api.Test
    // Condition/Decision Coverage Test
    void CDCoverageTestCheckBedragExcl() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        // 0 0 0
        Factuur factuur5 = new Factuur(5, "Auto5", 12100.0, "02-04-2022", false, 0, 0, administratie, false);
        // 1 1 1
        Factuur factuur6 = new Factuur(6, "Auto6", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        boolean actualResult5 = factuur5.checkBedragExcl(factuur5.getFactuurBedrag(), factuur5.getBtwCode(), factuur5.getBtwBedrag(), factuur5.getIsBetaald());
        boolean actualResult6 = factuur6.checkBedragExcl(factuur6.getFactuurBedrag(), factuur6.getBtwCode(), factuur6.getBtwBedrag(), factuur6.getIsBetaald());
        assertFalse(actualResult5);
        assertTrue(actualResult6);
    }

    @org.junit.jupiter.api.Test
    // Modified Condition Coverage Test
    void ModifiedConditionTestCheckBedragExcl() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        // 0 1 1
        Factuur factuur7 = new Factuur(7, "Auto7", 12100.0, "02-04-2022", false, 0, 2100, administratie, true);
        // 1 0 1
        Factuur factuur8 = new Factuur(8, "Auto8", 12100.0, "02-04-2022", false, 2, 0, administratie, true);
        // 1 1 0
        Factuur factuur9 = new Factuur(9, "Auto9", 12100.0, "02-04-2022", false, 2, 2100, administratie, false);
        // 1 1 1
        Factuur factuur10 = new Factuur(10, "Auto10", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        boolean actualResult7 = factuur7.checkBedragExcl(factuur7.getFactuurBedrag(),factuur7.getBtwCode(),factuur7.getBtwBedrag(), factuur7.getIsBetaald());
        boolean actualResult8 = factuur8.checkBedragExcl(factuur8.getFactuurBedrag(),factuur8.getBtwCode(),factuur8.getBtwBedrag(), factuur8.getIsBetaald());
        boolean actualResult9 = factuur9.checkBedragExcl(factuur9.getFactuurBedrag(),factuur9.getBtwCode(),factuur9.getBtwBedrag(), factuur9.getIsBetaald());
        boolean actualResult10 = factuur10.checkBedragExcl(factuur10.getFactuurBedrag(),factuur10.getBtwCode(),factuur10.getBtwBedrag(), factuur10.getIsBetaald());
        assertFalse(actualResult7);
        assertFalse(actualResult8);
        assertFalse(actualResult9);
        assertTrue(actualResult10);
    }
    @org.junit.jupiter.api.Test
    // Multiple Condition Coverage
    void MultipleConditionTestCheckBedragExcl() {
        Relatie relatie = new Relatie("AH", "11", "22", 1, 1);
        Administratie administratie = new Administratie("Miniwars", "111", "222", 2);
        // 0 0 0
        Factuur factuur11 = new Factuur(11, "Auto11", 12100.0, "02-04-2022", false, 0, 0, administratie, false);
        // 0 0 1
        Factuur factuur12 = new Factuur(12, "Auto12", 12100.0, "02-04-2022", false, 0, 0, administratie, true);
        // 0 1 0
        Factuur factuur13 = new Factuur(13, "Auto13", 12100.0, "02-04-2022", false, 0, 2100, administratie, false);
        // 0 1 1
        Factuur factuur14 = new Factuur(14, "Auto14", 12100.0, "02-04-2022", false, 0, 2100, administratie, true);
        // 1 0 0
        Factuur factuur15 = new Factuur(15, "Auto15", 12100.0, "02-04-2022", false, 2, 0, administratie, false);
        // 1 0 1
        Factuur factuur16 = new Factuur(16, "Auto16", 12100.0, "02-04-2022", false, 2, 0, administratie, true);
        // 1 1 0
        Factuur factuur17 = new Factuur(17, "Auto17", 12100.0, "02-04-2022", false, 2, 2100, administratie, false);
        // 1 1 1
        Factuur factuur18 = new Factuur(18, "Auto18", 12100.0, "02-04-2022", false, 2, 2100, administratie, true);
        boolean actualResult11 = factuur11.checkBedragExcl(factuur11.getFactuurBedrag(),factuur11.getBtwCode(),factuur11.getBtwBedrag(), factuur11.getIsBetaald());
        boolean actualResult12 = factuur12.checkBedragExcl(factuur12.getFactuurBedrag(),factuur12.getBtwCode(),factuur12.getBtwBedrag(), factuur12.getIsBetaald());
        boolean actualResult13 = factuur13.checkBedragExcl(factuur13.getFactuurBedrag(),factuur13.getBtwCode(),factuur13.getBtwBedrag(), factuur13.getIsBetaald());
        boolean actualResult14 = factuur14.checkBedragExcl(factuur14.getFactuurBedrag(),factuur14.getBtwCode(),factuur14.getBtwBedrag(), factuur14.getIsBetaald());
        boolean actualResult15 = factuur15.checkBedragExcl(factuur15.getFactuurBedrag(),factuur15.getBtwCode(),factuur15.getBtwBedrag(), factuur15.getIsBetaald());
        boolean actualResult16 = factuur16.checkBedragExcl(factuur16.getFactuurBedrag(),factuur16.getBtwCode(),factuur16.getBtwBedrag(), factuur16.getIsBetaald());
        boolean actualResult17 = factuur17.checkBedragExcl(factuur17.getFactuurBedrag(),factuur17.getBtwCode(),factuur17.getBtwBedrag(), factuur17.getIsBetaald());
        boolean actualResult18 = factuur18.checkBedragExcl(factuur18.getFactuurBedrag(),factuur18.getBtwCode(),factuur18.getBtwBedrag(), factuur18.getIsBetaald());
        assertFalse(actualResult11);
        assertFalse(actualResult12);
        assertFalse(actualResult13);
        assertFalse(actualResult14);
        assertFalse(actualResult15);
        assertFalse(actualResult16);
        assertFalse(actualResult17);
        assertTrue(actualResult18);
    }
}