package extends1.ex1;

public class CarMain {

    public static void main(String[] args) {
        ElectirCar electirCar = new ElectirCar();
        electirCar.move();
        electirCar.charge();

        GasCar gasCar = new GasCar();
        gasCar.move();
        gasCar.fillUp();

    }
}
