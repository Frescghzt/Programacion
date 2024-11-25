package trabajo;

import java.sql.*;

public class ManejoDB {
    private static final String URL = "jdbc:mysql://localhost:3306/tu_base_de_datos";
    private static final String USER = "tu_usuario";
    private static final String PASSWORD = "tu_password";
    
    public static void main(String[] args) {
        Connection conn = null;
        
        try {
            // Intentar conexión
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Conexión exitosa a la base de datos");
            
            // Ejemplo de operación que podría causar una excepción
            Statement stmt = conn.createStatement();
            stmt.executeUpdate("INSERT INTO tabla_inexistente (columna) VALUES ('valor')");
            
        } catch (SQLSyntaxErrorException e) {
            System.out.println("Error de sintaxis SQL: " + e.getMessage());
            System.out.println("Verifique la consulta SQL");
            
        } catch (SQLIntegrityConstraintViolationException e) {
            System.out.println("Violación de restricción de integridad: " + e.getMessage());
            System.out.println("Verifique que los datos cumplan con las restricciones de la base de datos");
            
        } catch (SQLException e) {
            System.out.println("Error general de SQL: " + e.getMessage());
            System.out.println("Código de error: " + e.getErrorCode());
            System.out.println("Estado SQL: " + e.getSQLState());
            
        } finally {
            if (conn != null) {
                try {
                    conn.close();
                    System.out.println("Conexión cerrada correctamente");
                } catch (SQLException e) {
                    System.out.println("Error al cerrar la conexión: " + e.getMessage());
                }
            }
        }
    }
}
