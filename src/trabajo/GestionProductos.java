package trabajo;

import java.io.*;
import java.util.*;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

class Producto {
    private String nombre;
    private double precio;
    private int cantidad;
    
    public Producto(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    @Override
    public String toString() {
        return String.format("Producto: %s, Precio: %.2f, Cantidad: %d", 
            nombre, precio, cantidad);
    }
}

public class GestionProductos {
    private static final String ARCHIVO_JSON = "productos.json";
    private static List<Producto> productos = new ArrayList<>();
    private static final Gson gson = new Gson();
    
    public static void guardarProductos() {
        try (FileWriter writer = new FileWriter(ARCHIVO_JSON)) {
            gson.toJson(productos, writer);
            System.out.println("Productos guardados exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }
    
    public static void cargarProductos() {
        try (Reader reader = new FileReader(ARCHIVO_JSON)) {
            productos = gson.fromJson(reader, new TypeToken<List<Producto>>(){}.getType());
            if (productos == null) {
                productos = new ArrayList<>();
            }
        } catch (IOException e) {
            System.out.println("No se encontró el archivo de productos o está vacío.");
            productos = new ArrayList<>();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        cargarProductos();
        
        int opcion;
        do {
            System.out.println("\n1. Agregar producto");
            System.out.println("2. Listar productos");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine();
            
            switch (opcion) {
                case 1:
                    System.out.print("Nombre del producto: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Precio: ");
                    double precio = scanner.nextDouble();
                    System.out.print("Cantidad: ");
                    int cantidad = scanner.nextInt();
                    
                    productos.add(new Producto(nombre, precio, cantidad));
                    guardarProductos();
                    break;
                    
                case 2:
                    System.out.println("\nLista de productos:");
                    productos.forEach(System.out::println);
                    break;
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}
