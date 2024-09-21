package trabajo;
import java.util.Scanner;
public class operadoresAritmeticos {
    public static void main(String[] args) {
        //operadores aritmeticos
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numeros a usar");
        float numero1 = scanner.nextFloat();
        System.out.println("Ingrese el segundo numeros a usar");
        float numero2 = scanner.nextFloat();
        //suma
        float suma = numero1 + numero2;
        //resta 
        float resta = numero1 - numero2;
        //multiplicacion
        float multiplicacion = numero1 * numero2;
        //division 
        float division = numero1 / numero2;
        //modulo
        float modulo = numero1 % numero2;
        //resultado suma
        System.out.println("el resultado de la suma es: " + suma);
        //resultado resta
        System.out.println("el resultado de la resta es: " + resta);
        //resultado multiplicacion
        System.out.println("el resultado de la multiplicacion es: " + multiplicacion);
        //resultado division
        System.out.println("el resultado de la division es: " + division);
        //resultado modulo25
        System.out.println("el resultado de la modulo es: " + modulo);
        scanner.close();
        

    }

}
