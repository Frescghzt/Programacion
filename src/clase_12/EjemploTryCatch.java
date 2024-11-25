package clase_12;

public class EjemploTryCatch {
    public static void main(String[] args) {
        try {
            int resultado = 10 / 0; // Genera una excepción de división por cero
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
