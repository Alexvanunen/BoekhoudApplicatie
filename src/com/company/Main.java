package com.company;
import com.company.BerekenBtw;
import com.company.GrootboekRekeningen;
import com.company.OverzichtGeboekteFacturen;

public class Main {

    public static void main(String[] args) {
        Factuur factuur = new Factuur();
        factuur.factuurVragen();
        FactuurBoeken factuurBoeken = new FactuurBoeken();
        factuurBoeken.factuurBoeken(factuur);
        OverzichtGeboekteFacturen overzichtGeboekteFacturen = new OverzichtGeboekteFacturen();
        System.out.println(overzichtGeboekteFacturen.toString());
    }
}