package clase_4;

import java.util.Scanner;

public class programa_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ingrese el numero entero: ");
        int numero = scanner.nextInt();
        
        System.out.println("Numero entero leido: "+ numero);

        scanner.close();
    }

}
