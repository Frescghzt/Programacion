package clase_5;

import java.util.Scanner;

public class comparacion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int number1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int number2 = scanner.nextInt();
        System.out.println("numero 1 es igual a numero 2 " + (number1 == number2));
        System.out.println("numero 1 es diferente a numero 2 " + (number1 != number2));
        System.out.println("numero 1 es mayor a numero 2 " + (number1 > number2));
        System.out.println("numero 1 es menor a numero 2 " + (number1 < number2));
        System.out.println("numero 1 es mayor o igual a numero 2 " + (number1 >= number2));
        System.out.println("numero 1 es menor o igual a numero 2 " + (number1 <= number2));
        scanner.close();
    }

}
