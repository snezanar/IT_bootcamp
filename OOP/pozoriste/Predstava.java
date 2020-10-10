package pozoriste;

import java.util.ArrayList;

//Predstava je opisana nazivom, pozoristem u kojem se izvodi i sadrzi zaposlene koji ucestvuju u realizaciji predstave.
//Zaposleni za realizaciju predstave mogu da se dodaju i izbace. Moze da se dohvati broj zaposlenih na predstavi.
public class Predstava extends Pozoriste {
    private String nazivPred;
    private Pozoriste pozoriste;
    private ArrayList<Zaposleni> listaZap = new ArrayList<>();

    public Predstava(String naziv, String nazivPred) { //
        super(naziv);
        this.nazivPred = nazivPred;
    }


    public void dodajZaposlenog(Zaposleni z) { //mogu da se dodaju i izbace.
        listaZap.add(z);
    }

    public void izbaciZaposlenog(Zaposleni z) {
        listaZap.remove(z);
    }

    public Zaposleni getBrZaposlenih(int i) {       //dohvati broj zaposlenih
        return listaZap.get(i);
    }

    public void ispisZaposlenih() {

        for (int i = 0; i < listaZap.size(); i++) {
            System.out.println(listaZap.get(i));
        }

    }

//    public String toString() {
//        int empNumb = 0;
//        StringBuilder sb = new StringBuilder();
//        sb.append(nazivPred).append(", ").append(pozoriste.getNaziv()).append(". ").append("\n");
//        for (int i = 0; i < listaZap.size(); i++) {
//            sb.append(listaZap.get(i).getIme());
//            empNumb++;
//            if (i != (listaZap.size() - 1))   sb.append("\n");
//
//        }
//        if (empNumb == 0) {
//            sb.append("Nema zaposlenih na ovoj predstavi!");
//        }
//        return sb.toString();
//    }


    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(nazivPred).append(",").append(getNaziv());//naziv predstave , naziv pozorista

        return sb.toString();
    }

}