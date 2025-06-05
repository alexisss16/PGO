public class Orzel extends Ptak {
    private double rozpietoscSkrzydel;

    public Orzel(String nazwa, int wiek, double rozpietoscSkrzydel) {
        super(nazwa, wiek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    public String szybuj() {
        return "Orzeł szybując obserwuje teren z góry.";
    }

    @Override
    public String wydajDzwiek() {
        return "Kreee!";
    }

    @Override
    public String poruszajSie() {
        return "Orzeł leci majestatycznie";
    }

    @Override
    public String srodowiskoNaturalne() {
        return "Góry i klify";
    }
}
