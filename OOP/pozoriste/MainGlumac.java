package pozoriste;

public class MainGlumac {
    public static void main(String[] args) {
        Pozoriste p = new Pozoriste("JDP");
        Predstava predstava1 = new Predstava("JDP", "Otelo");
        Predstava predstava2 = new Predstava("JDP", "Gospodjica");
        Zaposleni z1 = new Zaposleni("Jdp", "bora");
        Zaposleni z2 = new Zaposleni("JDP", "Mirjana K.");
        Zaposleni z3 = new Reditelj("JDP", "Predrag M.","pedja");

        System.out.println(p.getNaziv());
        System.out.println(p.getId());
        System.out.println(p);
        System.out.println("");

        // System.out.println(z1);
        // System.out.println(z2);
        predstava1.dodajZaposlenog(z1);
        predstava1.dodajZaposlenog(z2);
        predstava1.dodajZaposlenog(z3);
        ((Reditelj) z3).setNadimak("Pedja"); //!!!

        System.out.println("ispis zaposlenih za predstavu 1 : ");
        predstava1.ispisZaposlenih();
        System.out.println("");

        System.out.println("novi ispis zaposlenih za predtsavu 1: ");
        predstava1.izbaciZaposlenog(z2);
        predstava1.ispisZaposlenih();
        System.out.println("");

        System.out.println("ispis zaposlenih za predstavu 2 : ");
        predstava2.dodajZaposlenog(z2);
        predstava2.ispisZaposlenih();
        System.out.println();

        System.out.println("Print predtsave: ");
        System.out.println(predstava1);
        System.out.println(predstava2);
        System.out.println("");

        System.out.println("Print reditelj: ");
        System.out.println(z3);    //nadimak_ime[naziv_pozorista]
        System.out.println("");

        System.out.println("Print glumac: ");
        System.out.println(z2);    //uloga_ime[naziv_pozorista]
        System.out.println("");

        System.out.println("Print zaposlenih: ");
        System.out.println(z1);
        System.out.println(z2);
        System.out.println(z3);
    }
}

