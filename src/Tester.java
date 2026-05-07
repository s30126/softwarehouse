public class Tester extends Pracownik {

    private boolean czyAutomatyzujacy;
    private int liczbaScenariuszy;

    public Tester(String idPracownika, String imie, String nazwisko, double stawkaBazowa, boolean czyAutomatyzujacy, int liczbaScenariuszy) {
        super(idPracownika, imie, nazwisko, stawkaBazowa);
        this.czyAutomatyzujacy = czyAutomatyzujacy;
        this.liczbaScenariuszy = liczbaScenariuszy;
    }

    public boolean isCzyAutomatyzujacy() {
        return czyAutomatyzujacy;
    }

    public int getLiczbaScenariuszy() {
        return liczbaScenariuszy;
    }

    @Override
    public double obliczKosztMiesieczny() {
        return super.obliczKosztMiesieczny();
    }

    @Override
    public String przedstawSie() {
        return "tester " + super.przedstawSie();
    }

    public void uruchomRaportTestow() {

    }

}
