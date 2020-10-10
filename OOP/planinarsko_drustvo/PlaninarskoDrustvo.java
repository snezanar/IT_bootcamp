package test;


import java.util.ArrayList;

public class PlaninarskoDrustvo {
//    PlaninarskoDrustvo
//    Planinarsko drustvo poseduje naziv, i spisak planinara. Spisak planinara je inicijalno prazan i planinar moze da se doda ili
//    ukloni sa spiska. Ove akcije ralizovati kao 2 zasebne metode(dodaj, ukloni). Naziv se zadaje prilikom kreiranja i moguce ga i
//    dohvatiti i postaviti. Moze da se dohvati broj planinara registrovanih u drustvu. Planinarsko drustvo je zaduzeno za kreiranje
//    planinara, to jest, poseduje metodu registruj(Osoba o, String brojDozvole), koja osobu o registruje kao planinara u svom
//    drustvu, sa brojemDozvole brojDozvole. Novoregistrovanog planinara dodaje u spisak planinara i vraca referncu na tog
//    planinara. Primer poziva metode registruj:
//    Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
//    Planinar p1=drustvo1.registruj(o1,"1234567");
//    Planinarsko drustvo moze se ispisati na sledeci nacin:

//            [NazivDrustva]{BrojPlaninara}
//    Planinar1
//    Planinar2
//...
//    Gde su planinar1, planinar2 itd, planinari registrovani u planinarskom drustvu.

    private String naziv;
    private ArrayList<Planinar> planinari = new ArrayList<Planinar>();


    public PlaninarskoDrustvo(String naziv) {
        this.naziv = naziv;

    }

    public Planinar dohvatiPlaninara(int i) { //Moze da se dohvati broj planinara registrovanih u drustvu.
        return planinari.get(i);
    }

    public void dodajPlaninara(Planinar p) { //2 zasebne metode(dodaj, ukloni)
        planinari.add(p);
    }

    public void ukloniPlaninara(Planinar p) {
        planinari.remove(p);
    }

    public int brPlaninara() {
        return planinari.size();  //this.planinari?
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public Planinar registruj(Osoba o, String brojDozvole) {
        Planinar p = Planinar.kreiraj(o, brojDozvole);
        dodajPlaninara(p);
        return p;
    }


//    @Override
//    public String toString() { //[NazivDrustva]{BrojPlaninara}
//        StringBuilder sb = new StringBuilder();
//        sb.append("[").append(this.naziv).append("[{").append(brPlaninara());
//        sb.append('\n');
//        for (int i = 0; i < planinari.size(); i++) {
//            sb.append(planinari);
//        }
//        return sb.toString();

        @Override
        public String toString() { //[NazivDrustva]{BrojPlaninara}
            return "[" + getNaziv() + "]{" + brPlaninara() + "}" + "\n" + ispisPlaninara();
        }

    public String ispisPlaninara() {
        String s = "";
        for (int i = 0; i < planinari.size(); i++) {
            s += planinari.get(i).getIme() + "\n";
            // System.out.println(planinari.get(i).getIme());
        }
        return s;
    }
    }

