package trabajo;

import java.io.*;
import java.util.Scanner;

public class NotasManager {
    private static final String ARCHIVO_NOTAS = "notas.txt";
    
    public static void guardarNota(String nota) {
        try (FileWriter fw = new FileWriter(ARCHIVO_NOTAS, true);
             BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write(nota);
            bw.newLine();
            System.out.println("Nota guardada exitosamente.");
        } catch (IOException e) {
            System.out.println("Error al guardar la nota: " + e.getMessage());
        }
    }
    
    public static void leerNotas() {
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO_NOTAS))) {
            String linea;
            System.out.println("\nNotas guardadas:");
            while ((linea = br.readLine()) != null) {
                System.out.println("- " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error al leer las notas: " + e.getMessage());
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("\n1. Agregar nota");
            System.out.println("2. Ver notas");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea
            
            switch (opcion) {
                case 1:
                    System.out.print("Ingrese su nota: ");
                    String nota = scanner.nextLine();
                    guardarNota(nota);
                    break;
                case 2:
                    leerNotas();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida");
            }
        } while (opcion != 3);
        
        scanner.close();
    }
}
