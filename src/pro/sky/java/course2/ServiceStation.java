package pro.sky.java.course2;

public class ServiceStation {

    private static void updateTyre(Vehicle vhcl) {
        for (int i = 0; i < vhcl.getWheelsCount(); i++) {
            vhcl.updateTyre();
        }
    }

    public void check(Bicycle bicycle){
        System.out.println("Обслуживаем " + bicycle.getModelName());
        updateTyre(bicycle);
    }

    public void check(Car car){
        System.out.println("Обслуживаем " + car.getModelName());
        updateTyre(car);
        car.checkEngine();
    }

    public void check(Truck truck){
        System.out.println("Обслуживаем " + truck.getModelName());
        updateTyre(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }
}