package trabajo;

import java.util.Scanner;

public class mayor {
    public static void main(String[] args) {
        //programa para saber  cual es mayor 
        Scanner scanner = new Scanner(System.in);
        //pedir los numeros
        System.out.println("ingrese el primer numero");
        int number1 = scanner.nextInt();
        System.out.println("ingrese el segundo numero");
        int number2 = scanner.nextInt();
        System.out.println("ingrese el tercer numero");
        int number3 = scanner.nextInt();
        //decir si el numero uno es mayor 
        System.out.println(" el primer numero es mayor que el segundo y menor que el tercero? " + (number1 > number2 && number1 <number3) );
        scanner.close();
        

    }

}
