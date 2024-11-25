package trabajo;
public class Modificacion_valor {
    public static void main(String[] args) {
        int valor = 10;
        cambiarValor(valor);
        System.out.println("Valor después de cambiarValor: " + valor);  
    }

    public static void cambiarValor(int valor) {
        valor = 20;
    }
}
