public class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Hau hau!");
    }

    @Override
    public void roam() {
        System.out.println("Pies biega po podwórku.");
    }
}
