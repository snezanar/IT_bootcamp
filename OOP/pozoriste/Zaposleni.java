package pozoriste;

//Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
//Svi podaci mogu da se dohvate.
//Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
public class Zaposleni extends Pozoriste{
    private String ime;
    private Pozoriste pozoriste;


    public Zaposleni(String naziv, String ime) {
        super(naziv);
        this.ime = ime;
       // this.pozoriste = pozoriste;
    }

    public Pozoriste getPozoriste() {
        return pozoriste;
    }

    public String getIme() {
        return ime;
    }

    public String toString() { //ime[naziv_pozorista].
        StringBuilder sb = new StringBuilder();
        sb.append(ime).append("[").append(getNaziv()).append("]");
        return sb.toString();
    }
}
