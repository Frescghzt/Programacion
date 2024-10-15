package trabajo;

import java.util.Scanner;

public class metodo_java {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        int num1 = input.nextInt();
        System.out.println("ingrese el segundo numero");
        int num2 = input.nextInt();
        System.out.println("ingrese el tercer numero");
        int num3 = input.nextInt();
        int resultado = num_mayor(num1, num2, num3);
        System.out.println("el numero mayor es " + resultado);
        input.close();
    }
    public static int num_mayor(int num1, int num2, int num3){
        if (num1 > num2 && num1 > num3) {
            return num1;
        }
        else if(num2 > num1 && num2 > num3){
            return num2;
        }
        else{
            return num3;
        }
    }


}
