package clase_11;

class Animal {
    public void makeSound() {
        System.out.println("Some generic animal sound.");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark!");
    }
}

public class Herencia_polimorfismo {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog myDog = new Dog();

        // Llamada a métodos de la clase base y derivada
        genericAnimal.makeSound();
        myDog.makeSound();
    }
}
