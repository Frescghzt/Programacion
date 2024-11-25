package clase_10;

public class Clases {
    private String mensaje = "¡Hola desde la clase externa!";

    public class Interna {
        public void mostrarMensaje() {
            System.out.println(mensaje);  // Accede a la variable de la clase externa
        }
    }

    public static void main(String[] args) {
        Clases externa = new Clases();
        Clases.Interna interna = externa.new Interna();
        interna.mostrarMensaje();
    }
}
