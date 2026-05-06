import java.util.ArrayList;

public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public void dodajPracownika(Pracownik pracownik) {
        this.pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu() {

    }

    public double policzLacznyKoszt() {
        double lacznyKoszt = 0;
        return lacznyKoszt;
    }

    public Pracownik znajdzPoId(String idPracownika) {
        for (Pracownik p : pracownicy) {
            if (p.getIdPracownika() == idPracownika) {
                return p;
            }
        }
        return null;
    }

    public void wypiszProgramistow() {

    }



}
