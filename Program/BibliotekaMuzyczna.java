import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BibliotekaMuzyczna {
    private String nazwa;
    private String wlasciciel;
    private ArrayList<String> utwory;
    private ArrayList<Playlista> playlisty;

    public BibliotekaMuzyczna(String nazwa, String wlasciciel) {
        this.nazwa = nazwa;
        this.wlasciciel = wlasciciel;
        this.utwory = new ArrayList<>();
        this.playlisty = new ArrayList<>();
    }


    public void dodajUtwor(String utwor) {
        if (!utwory.contains(utwor)) {
            utwory.add(utwor);
        }
    }


    public void usunUtwor(String utwor) {
        utwory.remove(utwor);
        for (Playlista p : playlisty) {
            p.usunUtwor(utwor);
        }
    }


    public void wyswietlUtwory() {
        System.out.println("Utwory w bibliotece:");
        for (String utwor : utwory) {
            System.out.println(" - " + utwor);
        }
    }


    public void wyszukajUtwory(String fraza) {
        List<String> znalezione = utwory.stream()
                .filter(u -> u.toLowerCase().contains(fraza.toLowerCase()))
                .collect(Collectors.toList());
        System.out.println("Wyniki wyszukiwania dla \"" + fraza + "\":");
        for (String utwor : znalezione) {
            System.out.println(" - " + utwor);
        }
    }


    public void utworzPlayliste(String nazwaPlaylisty) {
        if (znajdzPlayliste(nazwaPlaylisty) == null) {
            playlisty.add(new Playlista(nazwaPlaylisty));
        }
    }


    private Playlista znajdzPlayliste(String nazwaPlaylisty) {
        for (Playlista p : playlisty) {
            if (p.getNazwa().equalsIgnoreCase(nazwaPlaylisty)) {
                return p;
            }
        }
        return null;
    }


    public void dodajUtworDoPlaylisty(String utwor, String nazwaPlaylisty) {
        Playlista playlista = znajdzPlayliste(nazwaPlaylisty);
        if (playlista != null && utwory.contains(utwor)) {
            playlista.dodajUtwor(utwor);
        }
    }


    public void wyswietlPlayliste(String nazwaPlaylisty) {
        Playlista playlista = znajdzPlayliste(nazwaPlaylisty);
        if (playlista != null) {
            playlista.wyswietl();
        } else {
            System.out.println("Nie znaleziono playlisty o nazwie: " + nazwaPlaylisty);
        }
    }


    public void wyswietlWszystkiePlaylisty() {
        System.out.println("Wszystkie playlisty:");
        for (Playlista p : playlisty) {
            System.out.println(" - " + p.getNazwa());
        }
    }


    public int getLiczbaUtworow() {
        return utwory.size();
    }


    public int getLiczbaPlaylist() {
        return playlisty.size();
    }
}
