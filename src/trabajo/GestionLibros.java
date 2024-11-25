package trabajo;

import java.io.*;
import java.util.*;

class Libro {
    private String titulo;
    private String autor;
    private String isbn;
    
    public Libro(String titulo, String autor, String isbn) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
    }
    
    @Override
    public String toString() {
        return String.format("Título: %s, Autor: %s, ISBN: %s", 
            titulo, autor, isbn);
    }
    
    public String getIsbn() {
        return isbn;
    }
}

public class GestionLibros {
    private static final String ARCHIVO_LIBROS = "libros.txt";
    private static List<Libro> libros = new ArrayList<>();
    
    public static void guardarLibros() {
        try (PrintWriter writer = new PrintWriter(new FileWriter(ARCHIVO_LIBROS))) {
            for (Libro libro : libros) {
                writer.println(String.format("%s|%s|%s", 
                    libro.toString().split(", ")[0].substring(8),
                    libro.toString().split(", ")[1].substring(7),
                    libro.toString().split(", ")[2].substring(6)));
            }
            System.out.println("Libros guardados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar libros: " + e.getMessage());
        }
    }
    
    public static void cargarLibros() {
        libros.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_LIBROS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split("\\|");
                if (partes.length == 3) {
                    libros.add(new Libro(partes[0], partes[1], partes[2]));
                }
            }
        } catch (IOException e) {
            System.out.println("No se encontró el archivo de libros o está vacío.");
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cargarLibros();
        
        int opcion;
        do {
            System.out.println("\n1. Agregar libro");
            System.out.println("2. Buscar libro por ISBN");
            System.out.println("3. Listar todos los libros");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Título: ");
                    String titulo = scanner.nextLine();
                    System.out.print("Autor: ");
                    String autor = scanner.nextLine();
                    System.out.print("ISBN: ");
                    String isbn = scanner.nextLine();
                    
                    libros.add(new Libro(titulo, autor, isbn));
                    guardarLibros();
                    break;
                    
                case 2:
                    System.out.print("Ingrese el ISBN a buscar: ");
                    String isbnBuscar = scanner.nextLine();
                    libros.stream()
                        .filter(l -> l.getIsbn().equals(isbnBuscar))
                        .findFirst()
                        .ifPresentOrElse(
                            System.out::println,
                            () -> System.out.println("Libro no encontrado")
                        );
                    break;
                    
                case 3:
                    System.out.println("\nLista de libros:");
                    libros.forEach(System.out::println);
                    break;
            }
        } while (opcion != 4);
        
        scanner.close();
    }
}
