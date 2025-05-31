public class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Miau!");
    }

    @Override
    public void roam() {
        System.out.println("Kot chodzi własnymi ścieżkami.");
    }
}
