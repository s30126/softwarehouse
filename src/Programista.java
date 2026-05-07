public class Programista extends Pracownik {

    private String glownyJezyk;
    private int liczbaRepozytoriow;

    public Programista(String idPracownika, String imie, String nazwisko, double stawkaBazowa, String glownyJezyk, int liczbaRepozytoriow) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.glownyJezyk = glownyJezyk;
        this.liczbaRepozytoriow = liczbaRepozytoriow;
    }

    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny() + 150;
    }

    @Override
    public String przedstawSie() {
        return "programista " + super.przedstawSie();
    }

    public void wypiszTechnologie() {
        System.out.println("język: " + glownyJezyk + ", repozytoria: " + liczbaRepozytoriow);
    }

    @Override
    public String toString() {
        return super.toString() + '\'' +
                ", glownyJezyk='" + glownyJezyk + '\'' +
                ", liczbaRepozytoriow='" + liczbaRepozytoriow +
                '}';
    }
}
