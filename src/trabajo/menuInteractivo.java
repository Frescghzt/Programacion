package trabajo;

import java.util.Scanner;

public class menuInteractivo {
    public static void main(String[] args) {
        //menu interactivo
        
        Scanner scanner = new Scanner(System.in);
        //pedir numero uno
        System.out.println("ingrese el primer numero");
        int numberOne = scanner.nextInt();

        //pedir numero dos
        System.out.println("ingrese el segundo numero");
        int numberTwo = scanner.nextInt();

        //menu
        System.out.println("ingrese el codigo de la opcion que decea realizar");
        System.out.println("_________________________________________________");
        System.out.println("       codigo                        opcion      ");
        System.out.println("_________________________________________________");
        System.out.println("           1                          sumar");
        System.out.println("           2                          resta");
        System.out.println("           3                     multiplicacion");
        System.out.println("           4                       division");
       
        //leer codigo

        int code =  scanner.nextInt();

        //switch

        switch (code) {
            case 1:
                System.out.println("el resultado es: " + (numberOne + numberTwo));
                break;
            case 2:
                System.out.println("el resultado es: " + (numberOne  - numberTwo));
                break;
            case 3:
                System.out.println("el resultado es: " + (numberOne * numberTwo));
                break;  
            case 4:
                System.out.println("el resultado es: " + ((double)numberOne / numberTwo));
                break;
          }
        scanner.close();
    }

}
