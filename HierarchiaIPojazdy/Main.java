public class Main {
    public static void main(String[] args) {
        Car car = new Car(5);
        car.start();
        car.stop();
        System.out.println("Liczba miejsc: " + car.getNumberOfSeats());
    }
}
