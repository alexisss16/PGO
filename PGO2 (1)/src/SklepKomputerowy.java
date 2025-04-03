import java.util.ArrayList;

public class SklepKomputerowy {
    private Produkt[] produkty = new Produkt[100];
    private Klient[] klienci = new Klient[100];
    private Zamowienie[] zamowienia = new Zamowienie[100];

    private int liczbaProduktow = 0;
    private int liczbaKlientow = 0;
    private int liczbaZamowien = 0;

    // Dodawanie produktu do sklepu
    public void dodajProdukt(Produkt produkt) {
        if (liczbaProduktow < produkty.length) {
            produkty[liczbaProduktow++] = produkt;
        } else {
            System.out.println("Nie można dodać więcej produktów.");
        }
    }

    // Dodawanie klienta do sklepu
    public void dodajKlienta(Klient klient) {
        if (liczbaKlientow < klienci.length) {
            klienci[liczbaKlientow++] = klient;
        } else {
            System.out.println("Nie można dodać więcej klientów.");
        }
    }

    // Tworzenie nowego zamówienia
    public Zamowienie utworzZamowienie(Klient klient, Produkt[] produktyZamowienie, int[] ilosci) {
        if (liczbaZamowien >= zamowienia.length) {
            System.out.println("Nie można dodać więcej zamówień.");
            return null;
        }

        Zamowienie zamowienie = new Zamowienie(liczbaZamowien + 1, klient, produktyZamowienie, ilosci);

        // Jeśli klient jest stały, stosujemy zniżkę
        if (klient.isCzyStaly()) {
            zamowienie.zastosujZnizke();
        }

        zamowienia[liczbaZamowien++] = zamowienie;
        aktualizujStanMagazynowy(zamowienie);
        return zamowienie;
    }

    // Aktualizacja stanu magazynowego po złożeniu zamówienia
    public void aktualizujStanMagazynowy(Zamowienie zamowienie) {
        for (int i = 0; i < zamowienie.getProdukty().length; i++) {
            Produkt produkt = zamowienie.getProdukty()[i];
            int iloscZamowiona = zamowienie.getIlosci()[i];
            produkt.setIloscWMagazynie(produkt.getIloscWMagazynie() - iloscZamowiona);
        }
    }

    // Zmiana statusu zamówienia
    public void zmienStatusZamowienia(int idZamowienia, String nowyStatus) {
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie != null && zamowienie.getId() == idZamowienia) {
                zamowienie.setStatus(nowyStatus);
                return;
            }
        }
        System.out.println("Nie znaleziono zamówienia o podanym ID.");
    }

    // Wyświetlenie produktów w określonej kategorii
    public void wyswietlProduktyWKategorii(String kategoria) {
        System.out.println("Produkty w kategorii: " + kategoria);
        for (Produkt produkt : produkty) {
            if (produkt != null && produkt.getKategoria().equalsIgnoreCase(kategoria)) {
                produkt.wyswietlInformacje();
            }
        }
    }

    // Wyświetlenie zamówień danego klienta
    public void wyswietlZamowieniaKlienta(int idKlienta) {
        System.out.println("Zamówienia klienta o ID: " + idKlienta);
        for (Zamowienie zamowienie : zamowienia) {
            if (zamowienie != null && zamowienie.getKlient().getId() == idKlienta) {
                zamowienie.wyswietlSzczegoly();
            }
        }
    }
}
