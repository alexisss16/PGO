public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog("Reksio");
        dog.makeNoise();
        dog.roam();

        Animal cat = new Cat("Mruczek");
        cat.makeNoise();
        cat.roam();

        Animal lion = new Lion("Simba");
        lion.makeNoise();
        lion.roam();
    }
}
