package clase_8;

public class cambioValor {
    public static void main(String[] args) {
        int num = 5;
        cambiarValor(num);
        System.out.println("valor despues del metodo" + num);
    }
    public static void cambiarValor(int num){
        num = 20;
        System.out.println("el numero dentro del metodo es: " + num);
    }

}
