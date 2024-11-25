package clase_10;

public class Manejo_excepciones {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0;
            System.out.println(resultado);  // Esto lanzará una excepción
        } catch (ArithmeticException e) {
            System.out.println("Error: División por cero.");
        } finally {
            System.out.println("Este bloque se ejecuta siempre.");
        }
    }
}
