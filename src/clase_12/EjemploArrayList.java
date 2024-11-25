package clase_12;

import java.util.ArrayList;

public class EjemploArrayList {
    public static void main(String[] args) {
        ArrayList<String> heroes = new ArrayList<>();
        heroes.add("Iron Man");
        heroes.add("Captain America");
        heroes.add("Thor");
        heroes.add("Hulk");

        // Recorrer la lista de héroes
        for (String heroe : heroes) {
            System.out.println("Héroe: " + heroe);
        }

        // Obtener un elemento por índice
        System.out.println("Héroe en posición 2: " + heroes.get(2));

        // Eliminar un elemento
        heroes.remove("Hulk");
        System.out.println("Lista después de eliminar a Hulk: " + heroes);
    }
}
