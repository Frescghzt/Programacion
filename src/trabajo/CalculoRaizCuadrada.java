package trabajo;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class CalculoRaizCuadrada {
    public static double calcularRaiz(double numero) throws NumeroNegativoException {
        if (numero < 0) {
            throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo");
        }
        return Math.sqrt(numero);
    }

    public static void main(String[] args) {
        try {
            double resultado = calcularRaiz(-4);
            System.out.println("La raíz cuadrada es: " + resultado);
        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
