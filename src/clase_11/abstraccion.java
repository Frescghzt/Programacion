package clase_11;

abstract class Vehicle {
    // Atributos comunes para todos los vehículos
    int wheels;
    String fuelType;

    // Método abstracto: debe ser implementado por las clases derivadas
    public abstract void startEngine();
}

// Clase 'Car' que extiende la clase abstracta 'Vehicle'
class Car extends Vehicle {
    public Car() {
        this.wheels = 4;
        this.fuelType = "Gasoline";
    }

    @Override
    public void startEngine() {
        System.out.println("The car's engine is starting...");
    }
}

public class abstraccion {
    public static void main(String[] args) {
        // Crear un objeto de la clase 'Car'
        Car myCar = new Car();
        System.out.println("The car has " + myCar.wheels + " wheels.");
        myCar.startEngine();
    }
}
