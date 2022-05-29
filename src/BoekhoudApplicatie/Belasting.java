package BoekhoudApplicatie;

public class Belasting {
    private static Belasting obj;

    private Belasting() {}

    public static Belasting getInstance()
    {
        if(obj == null){
            obj = new Belasting();
        }
        return obj;
    }
    public String getBelastingType(){
        return "OmzetBelasting";
    }
}