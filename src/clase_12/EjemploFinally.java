package clase_12;

public class EjemploFinally {
    public static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[5]); // Genera una excepción de índice fuera de rango
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Índice fuera de rango: " + e.getMessage());
        } finally {
            System.out.println("Este bloque se ejecutará siempre.");
        }
    }
}

