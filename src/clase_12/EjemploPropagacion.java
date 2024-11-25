package clase_12;

public class EjemploPropagacion {
    public static void main(String[] args) {
        try {
            metodo1();
        } catch (Exception e) {
            System.out.println("Excepción capturada en main: " + e.getMessage());
        }
    }

    public static void metodo1() throws Exception {
        metodo2();
    }

    public static void metodo2() throws Exception {
        throw new Exception("Excepción lanzada desde método2");
    }
}
