 package trabajo;
import java.util.Scanner;
public class mediaNumeros {
    public static void main(String[] args) {
        //conocer la media de 3 numero ingresados por el usuario
        Scanner numero = new Scanner(System.in);
        System.out.println("Programa para conocer la media de 3 numeros");
        System.out.println("--------------------------------------------------");
        //pedir los numeros
        System.out.println("ingrese el primer numero");
        double oneNumber = numero.nextDouble();
        System.out.println("ingrese el segundo numero");
        double twoNumber = numero.nextDouble();
        System.out.println("ingrese el tercer numero");
        double threeNumber = numero.nextDouble();
        //calcular el promedio
        double average = (oneNumber+twoNumber+threeNumber)/3;
        //imprimir el promedio
        System.out.println("la media de los numeros ingresados es: "+average);
        numero.close();
    }

}
