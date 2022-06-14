package BoekhoudApplicatie;

public class Belasting {
    private static Belasting instance;

    private Belasting() {}

    public static Belasting getInstance()
    {
        if(instance == null){
            instance = new Belasting();
        }
        return instance;
    }
    public String getBelastingType(){
        return "OmzetBelasting";
    }
}