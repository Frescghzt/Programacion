package clase_6;
public class EjemploFunciones {
    public static void main(String[] args) {
        int[] numeros = {10, 20, 30, 40, 50};
        imprimirArray(numeros); // Llama a la función y pasa el array
    }

    public static void imprimirArray(int[] arr) {
        for (int numero : arr) {
            System.out.println("Número: " + numero);
        }
    }
}