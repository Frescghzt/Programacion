package clase_10;

public class MultiHilos extends Thread{
    @Override
    public void run() {
        System.out.println("Este es un hilo en ejecución: " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        MultiHilos hilo1 = new MultiHilos();
        MultiHilos hilo2 = new MultiHilos();

        hilo1.start();
        hilo2.start();
    }
}
