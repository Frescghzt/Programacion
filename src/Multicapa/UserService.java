package Multicapa;

// Clase: UserService (Capa de Lógica de Negocio)
public class UserService {
    private UserRepository userRepository = new UserRepository();

    public void crearUsuario(Usuario usuario) {
        // Aquí podríamos añadir lógica de validación antes de guardar el usuario
        userRepository.guardarUsuario(usuario);
    }

    public Usuario obtenerUsuario(int id) {
        return userRepository.obtenerUsuario(id);
    }
}