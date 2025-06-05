public class Waz extends Gad {
    private boolean jadowity;

    public Waz(String nazwa, int wiek, boolean jadowity) {
        super(nazwa, wiek);
        this.jadowity = jadowity;
    }

    public String syczy() {
        return "Wąż syczy ostrzegawczo.";
    }

    @Override
    public String wydajDzwiek() {
        return "Ssss...";
    }

    @Override
    public String poruszajSie() {
        return "Wąż pełznie cicho po ziemi";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Dżungla tropikalna";
    }
}
