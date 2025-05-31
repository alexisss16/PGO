public class Lion extends Animal {
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Roaaar!");
    }

    @Override
    public void roam() {
        System.out.println("Lew patroluje swoje terytorium.");
    }
}
