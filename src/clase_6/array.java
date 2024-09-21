package clase_6;

public class array {
    public static void main(String[] args) {
        int[] numero = new int[4];
        numero[0]=10;
        numero[1]=15;
        numero[2]=25;
        numero[3]=35;
        for (int i = 0; i<4 ; i++) {
            System.out.println("el numero es: "+numero[i]);
            
        }
        for (int i : numero) {
            System.out.println(i);
            
        }
        numero[3]=15;
        System.out.println("el numero es: "+ numero[3]);
    }

}
