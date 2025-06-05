public class Lew extends Ssak {
    private String typGrzywy;

    public Lew(String nazwa, int wiek, String typGrzywy) {
        super(nazwa, wiek);
        this.typGrzywy = typGrzywy;
    }

    public String ryczy() {
        return "Lew ryczy głośno!";
    }

    @Override
    public String wydajDzwiek() {
        return "Roooaar!";
    }

    @Override
    public String poruszajSie() {
        return "Lew biegnie na czterech łapach";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Sawanna afrykańska";
    }
}
