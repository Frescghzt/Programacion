package clase_12;

import java.util.HashSet;

public class EjemploHashSet {
    public static void main(String[] args) {
        HashSet<String> villanos = new HashSet<>();
        villanos.add("Loki");
        villanos.add("Thanos");
        villanos.add("Red Skull");
        villanos.add("Thanos"); // Elemento duplicado

        // Recorrer el conjunto de villanos
        for (String villano : villanos) {
            System.out.println("Villano: " + villano);
        }

        // Verificar si un elemento está en el conjunto
        System.out.println("¿Existe Thanos? " + villanos.contains("Thanos"));
    }
}
