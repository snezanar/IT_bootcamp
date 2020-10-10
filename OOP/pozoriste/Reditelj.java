package pozoriste;
//Reditelj je zaposleni koji je prepoznatljiv po svom nadimku. Tekstualni oblik je nadimak_ime[naziv_pozorista].
public class Reditelj extends Zaposleni{
    private String nadimak;

    public Reditelj(String naziv, String ime,  String nadimak) {
        super(naziv, ime);
        this.nadimak = nadimak;
    }

    public String getNadimak() {
        return nadimak;
    }

    public void setNadimak(String nadimak) {
        this.nadimak = nadimak;
    }

    @Override
    public String toString() { //nadimak_ime[naziv_pozorista].
        StringBuilder sb = new StringBuilder();
        sb.append(nadimak).append("_");
        sb.append(super.toString());
        return sb.toString();
    }
}
