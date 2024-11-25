package trabajo;

import java.util.ArrayList;
import java.util.List;

public class GestionListas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        try {
            // Intentar acceder a un índice inválido
            System.out.println(lista.get(5));
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: Índice fuera de rango. La lista solo tiene " + lista.size() + " elementos");
        }
    }
}
