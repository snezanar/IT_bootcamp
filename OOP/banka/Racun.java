package banka;

import java.util.ArrayList;

public class Racun {
    private String brojRacuna;
    private int stanje;
    private Osoba osoba;


    public Racun(String brojRacuna, Osoba osoba) {

        this.brojRacuna = brojRacuna;
        this.osoba = osoba; // not null provera
    }


    public boolean dodajNovac(int vrednost) {
        if (vrednost > 0) {
            this.stanje += vrednost;
            return true;
        } else {
            return false; // opciona poruka
        }
    }

    public boolean oduzmiNovac(int vrednost) {

        if (vrednost > 0 && this.stanje >= vrednost) { //  OR this.stanje-vrednost>=0
            this.stanje -= vrednost;
            return true;      //podizemo novac i vracamo true
        } else {
            return false;      // opciona poruka
        }
    }

    public String getBrojRacuna() {
        return brojRacuna;
    }

    public int getStanje() {
        return stanje;
    }

    public Osoba getO() {
        return osoba;
    }

    public void setO(Osoba osoba) {
        this.osoba = osoba;
    }
}


