package trabajo;

public class numeroPares {
    public static void main(String[] args) {
        //programa para saber los numero pares
        int even=0;
        //ciclo para calcular cuantos numero pares hay 
        for (int i=1; i <=100  ; i++) {
            if (i % 2 == 0) {
                
                even++;    
            }
        }
        System.out.println("Hay " + even + " numeros pares entre 1 y 100  ");
    }

}
