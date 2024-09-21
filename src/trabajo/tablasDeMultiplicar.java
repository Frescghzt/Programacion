package trabajo;

import java.util.Scanner;

public class tablasDeMultiplicar {
    public static void main(String[] args) {
        //tablas de multiplicar
        Scanner input = new Scanner(System.in);
        int number;
        //pedimos que numero queremos ver sus tablas de multiplicar
        System.out.println("ingrese el numero que decea ver la tabla de multiplicar");
        number = input.nextInt();
        //mostramos la tablas de multiplicar
        for(int i = 0; i<=10 ; i++){
            System.out.println(number + "x" + i + "=" + (number*i) );
        }
        input.close();
    }

}
