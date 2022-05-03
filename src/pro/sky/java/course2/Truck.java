package pro.sky.java.course2;

public class Truck extends Vehicle {

    public Truck(String modelName, int wheelCount){
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}