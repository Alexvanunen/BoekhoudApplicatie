package com.company;

public class GrootboekRekeningen{
    private int rubriekNummer;
    private int grootboekRekeningNummer;

    public GrootboekRekeningen(int rubriekNummer, int grootboekRekeningNummer){
        this.rubriekNummer = rubriekNummer;
        this.grootboekRekeningNummer = grootboekRekeningNummer;
    }

    public GrootboekRekeningen() {

    }

    public void setRubriekNummer(int rubriekNummer){
        this.rubriekNummer = rubriekNummer;
    }
    public int getRubriekNummer(){
        return rubriekNummer;
    }
    public void setGrootboekRekeningNummer(int grootboekRekeningNummer){
        this.grootboekRekeningNummer = grootboekRekeningNummer;
    }
    public int getGrootboekRekeningNummer(){
        return grootboekRekeningNummer;
    }
}
