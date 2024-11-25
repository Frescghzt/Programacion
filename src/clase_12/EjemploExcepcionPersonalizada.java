package clase_12;

class ExcepcionPersonalizada extends Exception {
    public ExcepcionPersonalizada(String mensaje) {
        super(mensaje);
    }
}

public class EjemploExcepcionPersonalizada {
    public static void main(String[] args) {
        try {
            verificarEdad(15);
        } catch (ExcepcionPersonalizada e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public static void verificarEdad(int edad) throws ExcepcionPersonalizada {
        if (edad < 18) {
            throw new ExcepcionPersonalizada("Edad insuficiente para realizar esta acción.");
        }
        System.out.println("Acción permitida.");
    }
}

