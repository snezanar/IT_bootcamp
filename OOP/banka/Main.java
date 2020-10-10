package banka;
//           # Osoba
//  Osoba ima Ime, Prezime i godinu rodjenja koji se zadaju prilikom kreiranja klase. Ovi podaci mogu samo da se dohvate.
//  Takodje osoba poseduje Racun koji je povezan sa njom, koji se naknadno dodaje.
//          # Racun
//  Racun poseduje broj racuna i stanje na racunu. Stanje moze da se uveca za odredjenu sumu, ili umanji za odredjenu sumu.
//  Povratan vrednost ovih metoda je informacija da li je novac uspesno dodat/oduzet(boolean).
//  Broj racuna je tekstualnoh tipa, postavlja se prilikom kreiranja racuna i ne moze se promeniti, vec samo
//  dohvatiti
//  Dopuniti klasu Racun tako da moze da joj se postavi i dohvati osoba.
//  Osoba mora da se postavi prilikom kreiranja racuna a moze se naknadno promeniti.
//            # Banka
//  Banka poseduje ime i moze da kreira racun za odredjenu osobu

//  Dopuniti main tako da dodaje novac na racun zatim ispisuje stanje tog racuna, zatim oduzima novac sa racuna pa ispisuje stanje

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Banka b = new Banka("Intesa");
        Osoba o1 = new Osoba("pera ", "detlc", 1997);
        Osoba o2 = new Osoba("mika ", "mikic", 2000);
        Racun r1 = b.otvoriRacun(o1);
        Racun r2 = b.otvoriRacun(o2);
        System.out.println(o1.getRacun().getBrojRacuna());

        r1.dodajNovac(1000);
        System.out.println(r1.getStanje());//1000
        r1.oduzmiNovac(500);
        System.out.println(r1.getStanje());//500
        System.out.println("");
        System.out.println(o1.getRacun().getStanje());//500
        //System.out.println(r1.getO().getIme());



    }
}