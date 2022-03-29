package com.company;
import com.company.BerekenBtw;
import com.company.GrootboekRekeningen;
import java.util.Scanner;

public class Factuur extends GrootboekRekeningen{
    private int factuurNummer;
    private String factuurOmschrijving;
    private double factuurBedrag;
    private String factuurDatum;
    private String debetCredit;
    public Factuur(){
        super();
    }
    public void setFactuurNummer(int factuurNummer){
        this.factuurNummer = factuurNummer;
    }
    public int getFactuurNummer(){
        return factuurNummer;
    }
    public void setFactuurOmschrijving(String factuurOmschrijving){
        this.factuurOmschrijving = factuurOmschrijving;
    }
    public String getFactuurOmschrijving() {
        return factuurOmschrijving;
    }
    public void setFactuurBedrag(double factuurBedrag){
        this.factuurBedrag = factuurBedrag;
    }
    public double getFactuurBedrag(){
        return factuurBedrag;
    }
    public void setFactuurDatum(String factuurDatum){
        this.factuurDatum = factuurDatum;
    }
    public String getFactuurDatum(){
        return factuurDatum;
    }
    public void setDebetCredit(String debetCredit){
        this.debetCredit = debetCredit;
    }
    public String getDebetCredit(){
        return debetCredit;
    }

    public void factuurVragen(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Vul het factuurnummer in: ");
        int fn = scanner.nextInt();
        scanner.nextLine();
        setFactuurNummer(fn);
        System.out.println("Vul de factuuromschrijving in: ");
        String fo = scanner.nextLine();
        setFactuurOmschrijving(fo);
        System.out.println("Vul het factuurbedrag in: ");
        int fb = scanner.nextInt();
        scanner.nextLine();
        setFactuurBedrag(fb);
        System.out.println("Vul de factuurdatum in: ");
        String fd = scanner.nextLine();
        setFactuurDatum(fd);
        System.out.println("Voer het grootboekrekeningnummer in: ");
        int gbrn = scanner.nextInt();
        scanner.nextLine();
        setGrootboekRekeningNummer(gbrn);
        System.out.println("Wil je het bedrag aan de debet of creditkant plaatsen?");
        String dk = scanner.nextLine();
        setDebetCredit(dk);
    }
    @Override
    public String toString() {
        return "factuurNummer=" + factuurNummer +
                ", factuurOmschrijving='" + factuurOmschrijving + '\'' +
                ", factuurBedrag=" + factuurBedrag +
                ", factuurDatum='" + factuurDatum + '\'' +
                ", grootboekRekeningNummer='" + getGrootboekRekeningNummer()+ '\'' +
                ", debetCredit='" + debetCredit + '\'' +
                '}';
    }



}