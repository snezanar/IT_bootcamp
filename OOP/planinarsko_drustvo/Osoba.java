package test;

public class Osoba {
    //    Osoba poseduje Ime, Prezime, godinu rodjenja i JMBG. Ime, prezime, godina rodjenja i JMBG se zadaju prilikom kreiranja. Ime
//    i prezime mogu da se dohvate i naknadno postave. Godina rodjenja i JMBG mogu samo da se dohvate. Izvrsiti proveru
//    ispravnosti JMBG-a, to jest JMBG mora da ima tacno 13 karaktera. Ukoliko JMBG format nije ispravan za JMBG staviti
//"0000000000000".
//    Osobu je moguce ispisati u sledecem obliku:
//            [Ime Prezime]{GodinaRodjenja}<JMBG>
    private String ime;
    private String prezime;
    private int godRodj;
    private String JMBG;

    public Osoba(String ime, String prezime, int godRodj, String JMBG) {
        this.ime = ime;
        this.prezime = prezime;
        this.godRodj = godRodj;
        if (JMBG.length() != 13) {
            this.JMBG = "0000000000000";
        } else {
            this.JMBG = JMBG;
        }
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getGodRodj() {
        return godRodj;
    }

    public String getJMBG() {
        return JMBG;
    }

    @Override
    public String toString() {   //[Ime Prezime]{GodinaRodjenja}<JMBG>

        return "[" + getIme() + " " + getPrezime() + "]{" + getGodRodj() + "}<" + getJMBG() + ">";
    }

}
