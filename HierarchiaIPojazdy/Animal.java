public class Animal {
    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public void makeNoise() {
        System.out.println("Zwierzę wydaje dźwięk.");
    }

    public void roam() {
        System.out.println("Zwierzę wędruje.");
    }
}
