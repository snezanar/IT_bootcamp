package Planinar;

import java.util.ArrayList;

//Planina ima ime i visinu (u metrima) koji mogu da se dohvate. Moze da se sastavi tekstualni
//opis planine u obliku ime(visina). Takodje planina sadrizi listu planinara. Moze da se dohvati
//planinar na nekoj odredjenoj poziciji u listi, moguce je da se doda/ukloni planinar. Takodje
//moguce je ispisati sve planinare na planini u obliku [ime-ident,ime-ident,ime-ident...]
public class Planina {
    private String imePlanine;
    private double visina;
    private ArrayList<Planinar> listaPlaninara = new ArrayList<>();

    public Planina(String imePlanine, int visina) {
        this.imePlanine = imePlanine;
        this.visina = visina;
    }

    public String getImePlanine() {
        return imePlanine;
    }

    public double getVisina() {
        return visina;
    }

    public Planinar getPlaninarAt(int i)  {       //!!!
        return listaPlaninara.get(i);
    }

    public void dodajPlaninara(Planinar p) {
        listaPlaninara.add(p);
    }

    public void ukloniPlaninara(Planinar p) {
        listaPlaninara.remove(p);
    }

    public void ispisPlaninara() {
        System.out.print("[");
        for (int i = 0; i < listaPlaninara.size(); i++) {
            System.out.println(listaPlaninara.get(i));
        }
        System.out.println("]");
    }


    public String toString() {  //ime(visina)
        return imePlanine + "(" + visina + ")";
    }
}
