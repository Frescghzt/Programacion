package trabajo;

import java.util.Scanner;

public class vector {
    public static void main(String[] args) {
        // suma y promedio de un vector 
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[5];
        System.out.println("ingrese 5 numeros");
        //llenamos el vector
        for (int i = 0; i<5; i++) {
            System.out.println("ingrese el numero "+ (i+1));
            numeros[i] = input.nextInt();
            
        }
        int suma=0;
        //sumamos los numeros del vector
        for (int i = 0 ; i<5; i++) {
            suma+=numeros[i];            
        }
        //imprimimos la suma
        System.out.println("el resultado de la suma es: "+suma);
        //calculamos el promedio
        double average = (double)suma/numeros.length;
        //imprimimos el promedio
        System.out.println("el promedio es: "+average);

        input.close();
    }

}
