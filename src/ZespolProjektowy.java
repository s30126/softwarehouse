import java.util.ArrayList;

public class ZespolProjektowy {

    private String nazwaProjektu;
    private ArrayList<Pracownik> pracownicy;

    public ZespolProjektowy(String nazwaProjektu) {
        this.nazwaProjektu = nazwaProjektu;
        this.pracownicy = new ArrayList<>();
    }

    public void dodajPracownika(Pracownik pracownik) {
        this.pracownicy.add(pracownik);
    }

    public void wypiszSkladZespolu() {
        for (Pracownik p : pracownicy) {
            System.out.println(p.getImie() + " " + p.getNazwisko());
        }
    }

    public double policzLacznyKoszt() {
        double lacznyKoszt = 0;
        for (Pracownik p : pracownicy) {
            lacznyKoszt += p.obliczKosztMiesieczny();
        }
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
        for (Pracownik p : pracownicy) {
            if (p instanceof Programista) {
                System.out.println(p.getImie() + " " + p.getNazwisko());
            }
        }
    }



}
