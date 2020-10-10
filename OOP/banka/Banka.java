package banka;

import java.util.UUID;

public class Banka {
    private String ime;

    public Banka(String ime) {
        this.ime = ime;
    }


    public Racun otvoriRacun(Osoba o) {
        String brojRacuna = UUID.randomUUID().toString();    //broj racuna je uvek unikatna vrednost!
        Racun r = new Racun(brojRacuna, o);
        o.setRacun(r);
        return r;
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) { // menjanje imena
        this.ime = ime;
    }
}

