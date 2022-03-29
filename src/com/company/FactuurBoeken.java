package com.company;

import java.util.Scanner;
import java.util.ArrayList;
import com.company.BerekenBtw;
import com.company.GrootboekRekeningen;

public class FactuurBoeken {
    private static ArrayList<Factuur> facturenLijst = new ArrayList<>();
    public void factuurBoeken(Factuur factuur){
        facturenLijst.add(factuur);
    }
    public static ArrayList<Factuur> getFacturenLijst() {
        return facturenLijst;
    }
}