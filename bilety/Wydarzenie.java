import java.util.ArrayList;

class Wydarzenie {
    private String nazwa;
    private String data;
    private String miejsce;
    private int maxLiczbaMiejsc = 100;
    private int dostępneMiejsca = 0;
    private double cena;


    public Wydarzenie(String nazwa, double cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }


    public Wydarzenie(String nazwa, double cena, String data) {
        this(nazwa, cena);
        this.data = data;
    }


    public Wydarzenie(String nazwa, double cena, String data, String miejsce) {
        this(nazwa, cena, data);
        this.miejsce = miejsce;
    }


    public String getNazwa() { return nazwa; }
    public void setNazwa(String nazwa) { this.nazwa = nazwa; }

    public String getData() { return data; }
    public void setData(String data) { this.data = data; }

    public String getMiejsce() { return miejsce; }
    public void setMiejsce(String miejsce) { this.miejsce = miejsce; }

    public int getMaxLiczbaMiejsc() { return maxLiczbaMiejsc; }

    public int getDostępneMiejsca() { return dostępneMiejsca; }
    public void setDostępneMiejsca(int dostępneMiejsca) { this.dostępneMiejsca = dostępneMiejsca; }

    public double getCena() { return cena; }
    public void setCena(double cena) { this.cena = cena; }


    @Override
    public String toString() {
        return "Wydarzenie: " + nazwa +
                ", Data: " + (data != null ? data : "Brak daty") +
                ", Miejsce: " + (miejsce != null ? miejsce : "Brak miejsca") +
                ", Cena: " + cena +
                ", Dostępne miejsca: " + dostępneMiejsca;
    }


    public void zarezerwujMiejsce() {
        if (dostępneMiejsca < maxLiczbaMiejsc) {
            dostępneMiejsca++;
        } else {
            System.out.println("Brak dostępnych miejsc!");
        }
    }
}
