package pozoriste;
//Pozoriste ima jedinstveni celobrojni identifikacioni broj i naziv koji mogu da se dohvate.
//Moze da se sastavi tekstualni opis u obliku naziv[id].
//Zaposleni u pozoristu je opisan imenom (i prezimenom, jedno polje) i pozoristem u kojem je zaposlen.
//Svi podaci mogu da se dohvate.
//Moze da se sastavi tekstualni opis u obliku ime[naziv_pozorista].
//Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
//
//Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
//
//Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
//Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
//Sastavlja se tekstualni opis predstave navodeci naziv predstave i naziv pozorista odvojene zarezom,
//a potom zaposlene koji ucestvuju u realizaciji predstave (svakog zaposlenog u zasebnom redu).
public class Pozoriste {
    private String naziv;
    private static int ID_GLOBAL = 0;
    private int id = ID_GLOBAL++;

    public Pozoriste(String naziv) {
        this.naziv = naziv;
        id= ID_GLOBAL;
        ID_GLOBAL += 1;
    }

    public String getNaziv() {
        return naziv;
    }

    public int getId() {
        return id;
    }
@Override
    public String toString() { //naziv[id].
        StringBuilder sb = new StringBuilder();
        sb.append(naziv).append("[").append(id).append("]");
        return sb.toString();
    }
}
