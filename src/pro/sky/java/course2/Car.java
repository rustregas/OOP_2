package pro.sky.java.course2;

public class Car extends Vehicle{

    public Car(String modelName, int wheelCount){
        super(modelName, wheelCount);
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }
}