package Multicapa;

// Clase principal
public class Main {
    public static void main(String[] args) {
        UserController userController = new UserController();

        // Crear un nuevo usuario
        userController.crearUsuario("John Doe", "johndoe@example.com");

        // Mostrar información del usuario con ID 1
        userController.mostrarUsuario(1);
    }
}
