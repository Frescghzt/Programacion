package clase_12;

import java.util.HashMap;

public class EjemploHashMap {
    public static void main(String[] args) {
        HashMap<String, String> heroesPorClave = new HashMap<>();
        heroesPorClave.put("Iron Man", "Tony Stark");
        heroesPorClave.put("Captain America", "Steve Rogers");
        heroesPorClave.put("Thor", "Thor Odinson");

        // Recorrer el mapa de héroes
        for (String clave : heroesPorClave.keySet()) {
            System.out.println("Clave: " + clave + ", Valor: " + heroesPorClave.get(clave));
        }

        // Obtener un valor por clave
        System.out.println("El nombre real de Thor es: " + heroesPorClave.get("Thor"));
    }
}
