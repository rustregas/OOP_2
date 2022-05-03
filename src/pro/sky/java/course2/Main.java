package pro.sky.java.course2;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("car1", 4);
        Truck truck1 = new Truck("truck1", 6);
        Bicycle bicycle1 = new Bicycle("bicycle1", 2);

        ServiceStation station = new ServiceStation();
        station.check(car1);
        station.check(truck1);
        station.check(bicycle1);

    }
}