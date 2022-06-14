package BoekhoudApplicatie;

public class Btw {
    private int btwCode;
    private double btwBedrag;

    public Btw(int btwCode, double btwBedrag) {
        this.btwCode = btwCode;
        this.btwBedrag = btwBedrag;
    }

    public int getBtwCode() {
        return btwCode;
    }

    public double getBtwBedrag() {
        return btwBedrag;
    }

    public void setBtwCode(int btwCode) {
        this.btwCode = btwCode;
    }

    public void setBtwBedrag(double btwBedrag) {
        this.btwBedrag = btwBedrag;
    }

    //Methode berekenBtwBedrag
    public double berekenBtwBedrag(double factuurBedrag) {
        if(btwCode == 0){
            btwBedrag = 0;
        }
        if(btwCode == 1){
            btwBedrag = (factuurBedrag / 109) * 9;
        }
        if(btwCode == 2){
            btwBedrag = (factuurBedrag / 121) * 21;
        }
        return btwBedrag;
    }
    public boolean checkBedragExcl(double factuurBedrag, int btwCode, double btwBedrag, boolean isBetaald){
        if(btwCode == 1 && (((factuurBedrag / 109) * 9 == btwBedrag) && isBetaald)) {
            return true;
        }
        else if(btwCode == 2 && ((factuurBedrag / 121) * 21 == btwBedrag && isBetaald)) {
            return true;
        }
        return false;
    }
}
