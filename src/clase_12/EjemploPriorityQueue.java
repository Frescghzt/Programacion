package clase_12;

import java.util.PriorityQueue;

public class EjemploPriorityQueue {
    public static void main(String[] args) {
        PriorityQueue<Integer> numeros = new PriorityQueue<>();
        numeros.add(5);
        numeros.add(1);
        numeros.add(3);
        numeros.add(2);

        // Recorrer la cola con prioridad
        while (!numeros.isEmpty()) {
            System.out.println("Número: " + numeros.poll());
        }
    }
}
