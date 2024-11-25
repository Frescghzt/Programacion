package trabajo;

class Persona {
    String nombre;
}

public class Modificar_nombre {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.nombre = "Ana";
        cambiarNombre(persona);
        System.out.println("Nombre después de cambiarNombre: " + persona.nombre); 
    }

    public static void cambiarNombre(Persona persona) {
        persona.nombre = "María";
    }
}
