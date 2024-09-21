package trabajo;

import java.util.Scanner;

public class numeroMayor {
    public static void main(String[] args) {
        //saber que numero es el mayor de los 3 
        Scanner scanner = new Scanner(System.in);
        
        //pedimos el primer numero
        
        System.out.println("Ingrese el primer numero");
        int numberOne = scanner.nextInt();

        //pedimos el segundo numero

        System.out.println("Ingrese el segundo numero");
        int numberTwo = scanner.nextInt();

        //pedimos el tercer numero

        System.out.println("Ingrese el tercer numero");

        //calculamos el mayor
        int numberThree = scanner.nextInt();
        if (numberOne > numberTwo && numberOne > numberThree) {
            System.out.println("El numero mayor es: " + numberOne);
        } else if (numberTwo > numberOne && numberTwo > numberThree) {
            System.out.println("El numero mayor es: " + numberTwo);
        } else{
            System.out.println("El numero mayor es: " + numberThree);
        }
        scanner.close();
    }

}
