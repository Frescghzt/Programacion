package clase_6;

public class FiltrarArray {
    public static void main(String[] args) {
        int[] numeros = {5, 8, 13, 22, 35, 42};

        System.out.println("Números pares:");
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }

}
