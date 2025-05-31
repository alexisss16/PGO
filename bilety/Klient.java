import java.util.ArrayList;

class Klient {
    private String imię;
    private String nazwisko;
    private String email;
    private ArrayList<Wydarzenie> listaRezerwacji = new ArrayList<>();


    public Klient(String imię, String nazwisko, String email) {
        this.imię = imię;
        this.nazwisko = nazwisko;
        this.email = email;
    }


    public String getImię() { return imię; }
    public void setImię(String imię) { this.imię = imię; }

    public String getNazwisko() { return nazwisko; }
    public void setNazwisko(String nazwisko) { this.nazwisko = nazwisko; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }


    public void dodajRezerwację(Wydarzenie wydarzenie) {
        if (wydarzenie.getDostępneMiejsca() < wydarzenie.getMaxLiczbaMiejsc()) {
            listaRezerwacji.add(wydarzenie);
            wydarzenie.zarezerwujMiejsce();
            System.out.println("Zarezerwowano miejsce na wydarzenie: " + wydarzenie.getNazwa());
        } else {
            System.out.println("Brak wolnych miejsc na wydarzenie: " + wydarzenie.getNazwa());
        }
    }


    public void anulujRezerwację(Wydarzenie wydarzenie) {
        if (listaRezerwacji.contains(wydarzenie)) {
            listaRezerwacji.remove(wydarzenie);
            System.out.println("Anulowano rezerwację na wydarzenie: " + wydarzenie.getNazwa());
        } else {
            System.out.println("Nie znaleziono takiego wydarzenia w rezerwacjach.");
        }
    }


    public void wyświetlRezerwacje() {
        if (listaRezerwacji.isEmpty()) {
            System.out.println("Brak zarezerwowanych wydarzeń.");
        } else {
            System.out.println("Rezerwacje klienta " + imię + " " + nazwisko + ":");
            for (Wydarzenie w : listaRezerwacji) {
                System.out.println(w);
            }
        }
    }
}
