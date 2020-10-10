package banka;

public class Osoba {
    private  String ime;
    private String prezime;
    private int godRodjenja;
    private Racun racun;

    public Osoba(String ime, String prezime,int godRodjenja){
        this.ime=ime;
        this.prezime=prezime;
        this.godRodjenja=godRodjenja;
    }

    public String getIme() {
        return ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public Racun getRacun() {
        return racun;
    }

    public int getGodRodjenja() {
        return godRodjenja;
    }
    //metoda vraca:true-racun uspesno postavljen ; false ako nije usp postavljen
    public boolean setRacun(Racun racun){ // info da li je racun postavljen uspesno
        if(this.racun!=null){
            System.out.println("za osobu "+this.ime+ " je vec registrovan racun.");
            return false;
        }
        this.racun=racun;  //this->return
        return true;
    }

}

