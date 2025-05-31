import java.util.ArrayList;

class SystemRezerwacji {
    private ArrayList<Wydarzenie> listaWydarzeń = new ArrayList<>();
    private ArrayList<Klient> listaKlientów = new ArrayList<>();


    public void dodajWydarzenie(Wydarzenie wydarzenie) {
        listaWydarzeń.add(wydarzenie);
        System.out.println("Dodano wydarzenie: " + wydarzenie.getNazwa());
    }


    public void dodajKlienta(Klient klient) {
        listaKlientów.add(klient);
        System.out.println("Dodano klienta: " + klient.getImię() + " " + klient.getNazwisko());
    }


    public void dokonajRezerwacji(Klient klient, Wydarzenie wydarzenie) {
        if (listaKlientów.contains(klient) && listaWydarzeń.contains(wydarzenie)) {
            klient.dodajRezerwację(wydarzenie);
        } else {
            System.out.println("Błąd: Nie znaleziono klienta lub wydarzenia.");
        }
    }


    public Wydarzenie znajdzWydarzenie(String nazwa) {
        for (Wydarzenie w : listaWydarzeń) {
            if (w.getNazwa().equalsIgnoreCase(nazwa)) {
                return w;
            }
        }
        System.out.println("Nie znaleziono wydarzenia o nazwie: " + nazwa);
        return null;
    }


    public Klient znajdzKlienta(String nazwisko) {
        for (Klient k : listaKlientów) {
            if (k.getNazwisko().equalsIgnoreCase(nazwisko)) {
                return k;
            }
        }
        System.out.println("Nie znaleziono klienta o nazwisku: " + nazwisko);
        return null;
    }


    public void zmiezCeneWydarzenia(String nazwa, double nowaCena) {
        Wydarzenie wydarzenie = znajdzWydarzenie(nazwa);
        if (wydarzenie != null) {
            double staraCena = wydarzenie.getCena();
            wydarzenie.setCena(nowaCena);
            System.out.println("Cena wydarzenia \"" + nazwa + "\" zmieniona z " + staraCena + " na " + nowaCena);
        }
    }
}
