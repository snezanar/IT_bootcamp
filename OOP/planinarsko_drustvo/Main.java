package test;

public class Main {
    public static void main(String[] args) {
//    Primer poziva metode kreiraj:
//    Osoba o1 = new Osoba("Petar","Petrovic",1992,"1234567890123");
//    Planinar p1 = Planinar.kreiraj(o1,"1234567");

        Osoba o1 = new Osoba("Petar", "Petrovic", 1992, "1234567890123");
        Osoba o2 = new Osoba("Mika", "Mikic", 1980, "1234567890124");
        Osoba o3 = new Osoba("Pera", "Peric", 1970, "123456789012");
        Planinar p1 = Planinar.kreiraj(o1, "1234567");
        Planinar p2 = Planinar.kreiraj(o2, "1234568");
        Planinar p3 = Planinar.kreiraj(o3, "123456");

        System.out.println(o1.toString());  //ispravan JMBG osobe 1
        System.out.println(o2.toString());  //ispravan JMBG osobe 2
        System.out.println(o3.toString());  //neispravan JMBG osobe 3
        System.out.println("");
        System.out.println(p1.toString()); // ispravan br dozvole planinara1
        System.out.println(p2.toString()); // ispravan br dozvole planinara2
        System.out.println(p3.toString()); // NEispravan br dozvole i jmbg planinara3
        System.out.println("");

        PlaninarskoDrustvo d1 = new PlaninarskoDrustvo("Pobeda");

        d1.dodajPlaninara(p1);
        d1.dodajPlaninara(p2);
        d1.dodajPlaninara(p3);
        System.out.println(d1.toString()); //[Pobeda]{3}
        System.out.println("");

        System.out.println(o1.getGodRodj()); //Godina rodjenja osobe 1
        System.out.println(p2.getGodRodj());  //Godina rodjenja osobe 2
        System.out.println(p3.getGodRodj());  //Godina rodjenja osobe 3
    }

}
//[Ime Prezime]{GodinaRodjenja}<JMBG> - BrojDozvole
//[NazivDrustva]{BrojPlaninara}