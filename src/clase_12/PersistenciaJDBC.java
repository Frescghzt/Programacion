package clase_12;

import java.sql.*;

public class PersistenciaJDBC {
    private static final String URL = "jdbc:mysql://localhost:3306/pruebas";
    private static final String USUARIO = "root";
    private static final String CLAVE = "password";

    public static void main(String[] args) {
        try (Connection conexion = DriverManager.getConnection(URL, USUARIO, CLAVE)) {
            System.out.println("Conexión exitosa a la base de datos.");
            insertarUsuario(conexion, "Juan Perez", "juan.perez@gmail.com");
            leerUsuarios(conexion);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void insertarUsuario(Connection conexion, String nombre, String email) throws SQLException {
        String sql = "INSERT INTO usuarios (nombre, email) VALUES (?, ?)";
        try (PreparedStatement statement = conexion.prepareStatement(sql)) {
            statement.setString(1, nombre);
            statement.setString(2, email);
            int filasInsertadas = statement.executeUpdate();
            if (filasInsertadas > 0) {
                System.out.println("Usuario insertado correctamente.");
            }
        }
    }

    public static void leerUsuarios(Connection conexion) throws SQLException {
        String sql = "SELECT * FROM usuarios";
        try (Statement statement = conexion.createStatement();
            ResultSet resultado = statement.executeQuery(sql)) {
            while (resultado.next()) {
                int id = resultado.getInt("id");
                String nombre = resultado.getString("nombre");
                String email = resultado.getString("email");
                System.out.println("ID: " + id + ", Nombre: " + nombre + ", Email: " + email);
            }
        }
    }
}

