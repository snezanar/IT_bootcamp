package pozoriste;

import pozoriste.Zaposleni;

//Glumac je zaposleni koji ima i naziv uloge. Tekstualni oblik je uloga_ime[naziv_pozorista].
public class Glumac extends Zaposleni {
    private String uloga;

    public Glumac(String naziv, String ime, String uloga) {
        super(naziv, ime);
        this.uloga = uloga;
    }

    public String getUloga() {
        return uloga;
    }

    public void setUloga(String uloga) {
        this.uloga = uloga;
    }
@Override
    public String toString() { //uloga_ime[naziv_pozorista]
        StringBuilder sb = new StringBuilder();
        sb.append(uloga).append("_");
        sb.append(super.toString());
        return sb.toString();
    }
}
