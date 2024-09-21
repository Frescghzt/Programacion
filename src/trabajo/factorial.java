package trabajo;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        //calcular el factorial de un numero
        Scanner scanner = new Scanner(System.in); 
        int number;
        long factorial=1, i=1;
        //pedir el numero para calcular el factorial
        System.out.println("ingrese el numero del que decea ver el factorial");
        number = scanner.nextInt();
        while (i <= number) {
            //calcular el factorial
            factorial*=i;
            i++;
            
        }
        //imprimir el factorial
        System.out.println("el factorial de " + number+ " es " + factorial);
        scanner.close();
    }

}
