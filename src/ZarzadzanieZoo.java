public class ZarzadzanieZoo {
    public static void main(String[] args) {
        Zwierze lew = new Lew("Simba", 5, "Gęsta grzywa");
        Zwierze orzel = new Orzel("Bielik", 3, 2.1);
        Zwierze waz = new Waz("Kobra", 2, true);

        Zwierze[] zwierzeta = {lew, orzel, waz};

        for (Zwierze z : zwierzeta) {
            z.wyswietlInformacje();
            System.out.println("---------------------------");
        }
    }
}
