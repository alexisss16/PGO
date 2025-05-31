// Example usage
public class Main {
    public static void main(String[] args) {
        // Tworzenie systemu rezerwacji
        SystemRezerwacji system = new SystemRezerwacji();

        // Dodawanie wydarzeń
        Wydarzenie koncert = new Wydarzenie("Koncert Symphony", 120.0);
        Wydarzenie teatr = new Wydarzenie("Hamlet", 85.0);
        system.dodajWydarzenie(koncert);
        system.dodajWydarzenie(teatr);

        // Dodawanie klientów
        Klient klient1 = new Klient("Jan", "Kowalski", "jan@example.com");
        Klient klient2 = new Klient("Anna", "Nowak", "anna@example.com");
        system.dodajKlienta(klient1);
        system.dodajKlienta(klient2);

        // Dokonywanie rezerwacji
        system.dokonajRezerwacji(klient1, koncert);
        system.dokonajRezerwacji(klient1, teatr);
        system.dokonajRezerwacji(klient2, koncert);

        // Wyświetlanie rezerwacji klientów
        System.out.println("\nRezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + ":");
        klient1.wyświetlRezerwacje();

        System.out.println("\nRezerwacje klienta " + klient2.getImię() + " " + klient2.getNazwisko() + ":");
        klient2.wyświetlRezerwacje();

        // Modyfikacja ceny wydarzenia
        Wydarzenie koncertRef = system.znajdzWydarzenie("Koncert Symphony");
        if (koncertRef != null) {
            System.out.println("\nZmiana ceny koncertu z " + koncertRef.getCena() + " na 150.0 zł");
            koncertRef.setCena(150.0);
        }

        // Sprawdzenie, czy zmiana ceny jest widoczna
        System.out.println("\nRezerwacje klienta " + klient1.getImię() + " " + klient1.getNazwisko() + " po zmianie ceny:");
        klient1.wyświetlRezerwacje();

        System.out.println("\nRezerwacje klienta " + klient2.getImię() + " " + klient2.getNazwisko() + " po zmianie ceny:");
        klient2.wyświetlRezerwacje();

        // Anulowanie rezerwacji
        System.out.println("\nKlient " + klient1.getImię() + " anuluje rezerwację na teatr:");
        klient1.anulujRezerwację(teatr);
        klient1.wyświetlRezerwacje();

        // Sprawdzenie liczby dostępnych miejsc
        System.out.println("\nDostępne miejsca na koncercie: " + koncert.getDostępneMiejsca() + " z " + koncert.getMaxLiczbaMiejsc());
    }
}
