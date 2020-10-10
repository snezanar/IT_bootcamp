package Planinar;
//Planinar ima ime, prezime i jedinstveni celobrojni identifikacioni broj. Planinar moze da se penje
//po zadatoj planini. Penjanje moze biti uspesno ili neuspesno. Moze da se sastavi tekstualni
//opis planinara u obliku ime-ident.
public class Planinar{
    private  String ime;
    private  static  int ID_GLOBAL=0;
    private int id = ID_GLOBAL++;

    public Planinar(String ime) {
        this.ime = ime;
        id= ID_GLOBAL;
        ID_GLOBAL += 3;
    }
    public String getIme() {
        return ime;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public String toString(){ //opis planinara u obliku ime-ident.
        StringBuilder sb=new StringBuilder();
        sb.append(ime).append("-").append(id);
        return sb.toString();
    }
}
