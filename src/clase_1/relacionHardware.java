package clase_1;
import java.util.Scanner;  
public class relacionHardware {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = scanner.nextInt();
        int resultado = numero + 10;
        System.out.println("el numero es " + resultado);
        scanner.close();
    }       

}
