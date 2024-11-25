package clase_12;

import com.google.gson.Gson;
import java.io.*;

public class ManejoJson {
    public static void main(String[] args) {
        Usuario usuario = new Usuario(1, "Juan Perez", "juan.perez@gmail.com");
        String rutaArchivo = "usuario.json";

        guardarUsuarioJson(usuario, rutaArchivo);
        Usuario usuarioLeido = leerUsuarioJson(rutaArchivo);
        System.out.println("Usuario leido: " + usuarioLeido);
    }

    public static void guardarUsuarioJson(Usuario usuario, String ruta) {
        try (Writer writer = new FileWriter(ruta)) {
            Gson gson = new Gson();
            gson.toJson(usuario, writer);
            System.out.println("Usuario guardado en JSON.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Usuario leerUsuarioJson(String ruta) {
        try (Reader reader = new FileReader(ruta)) {
            Gson gson = new Gson();
            return gson.fromJson(reader, Usuario.class);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    static class Usuario {
        private int id;
        private String nombre;
        private String email;

        public Usuario(int id, String nombre, String email) {
            this.id = id;
            this.nombre = nombre;
            this.email = email;
        }

        @Override
        public String toString() {
            return "Usuario{id=" + id + ", nombre='" + nombre + "', email='" + email + "'}";
        }
    }
}

