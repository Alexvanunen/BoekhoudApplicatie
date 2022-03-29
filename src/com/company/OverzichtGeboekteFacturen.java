package com.company;

import java.util.ArrayList;

public class OverzichtGeboekteFacturen {
    ArrayList<Factuur> uitprintenFacturenLijst = FactuurBoeken.getFacturenLijst();
    @Override
    public String toString() {
        return "uitprintenFacturenLijst=" + uitprintenFacturenLijst +
                '}';
    }
}