package com.company;

import com.company.Factuur;

public class BerekenBtw extends Factuur {
    private int btwCode;
    private double btwBedrag;
    public static Factuur factuur;

    public BerekenBtw(int btwCode, double btwBedrag){
        this.btwCode = btwCode;
        this.btwBedrag = btwBedrag;
    }
    public void setBtwCode(int btwCode){
        this.btwCode = btwCode;
    }
    public int getBtwCode(){
        return btwCode;
    }
    public void setBtwBedrag(double btwBedrag){
        this.btwBedrag = btwBedrag;
    }
    public double getBtwBedrag(){
        return btwBedrag;
    }
    public void berekenBtwBedrag(){
        if (btwCode == 0){
            setBtwBedrag(0.0);
        }
        if (btwCode == 1){
            setBtwBedrag((factuur.getFactuurBedrag() / 100) * 9);
        }
        if (btwCode == 2){
            setBtwBedrag((factuur.getFactuurBedrag() / 100) * 21);
        }
    }
}
