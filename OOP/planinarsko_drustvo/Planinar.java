package test;

public class Planinar extends Osoba {
//    Planinar je osoba koja poseduje broj planinarske dozvole, broj planinarske dozvole mora da ima tacno 7 karaktera. Broj
//    planinarske dozvole se postavlja prilikom kreiranja i moze se samo dohvatiti. Ukoliko se stavi nedozvoljena vrednost, postaviti
//    broj planinarske dozvole na "0000000".
//    Klasa Planinar poseduje staticku metodu kreiraj(Osoba o, String brojDozvole) koja prima kao argument objekat tipa Osoba
//    a vraca objekat tipa Planinar. Metoda kreiraj za poslatu osobu kreira planinara i vraca objekat, to jest uzima informacije iz
//    objekta tipa Osoba i kreira objekat tipa Planinar. (Prisetiti se sa predavanja klase Banka i otvaranja racuna);
//    Primer poziva metode kreiraj:
//    Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
//    Planinar p1 = Planinar.kreiraj(o1,"1234567");
//    Planinar moze da se ispise u sledecem obliku:
//            [Ime Prezime]{GodinaRodjenja}<JMBG> - BrojDozvole

    private String brojDozvole;

    public Planinar(String ime, String prezime, int godRodj, String JMBG, String brojDozvole) {
        super(ime, prezime, godRodj, JMBG);
        if (brojDozvole.length() != 7) {
            this.brojDozvole = "0000000";
        } else {
            this.brojDozvole = brojDozvole;
        }
    }

    public static Planinar kreiraj(Osoba o, String brojDozvole) { //metodu kreiraj(Osoba o, String brojDozvole)
        Planinar p = new Planinar(o.getIme(), o.getPrezime(), o.getGodRodj(), o.getJMBG(), brojDozvole);
        return p;
    }

    public String getBrojDozvole() {
        return brojDozvole;
    }

    @Override
    public String toString() { // [Ime Prezime]{GodinaRodjenja}<JMBG> - BrojDozvole
        return  super.toString() + " - " + getBrojDozvole(); //this.brDozvole
    }
}
