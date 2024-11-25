package clase_12;

import java.io.*;

public class ManejoArchivos {
    public static void main(String[] args) {
        String rutaArchivo = "datos.txt";
        escribirArchivo(rutaArchivo, "¡Hola, mundo! Este es un archivo de texto.");
        leerArchivo(rutaArchivo);
    }

    public static void escribirArchivo(String ruta, String contenido) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ruta))) {
            writer.write(contenido);
            System.out.println("Archivo escrito exitosamente.");
        } catch (IOException e) {
            System.err.println("Error al escribir el archivo: " + e.getMessage());
        }
    }

    public static void leerArchivo(String ruta) {
        try (BufferedReader reader = new BufferedReader(new FileReader(ruta))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }
        } catch (IOException e) {
            System.err.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}

