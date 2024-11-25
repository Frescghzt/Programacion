package trabajo;

public class DivisionPorCero {
    public static double dividir(double numerador, double denominador) throws ArithmeticException {
        if (denominador == 0) {
            throw new ArithmeticException("Error: No se puede dividir por cero");
        }
        return numerador / denominador;
    }

    public static void main(String[] args) {
        try {
            double resultado = dividir(10, 0);
            System.out.println("Resultado: " + resultado);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
