package clase_12;

public class Heroe {
    private String nombre;
    private int nivelDePoder;

    public Heroe(String nombre, int nivelDePoder) {
        this.nombre = nombre;
        this.nivelDePoder = nivelDePoder;
    }

    public boolean salvarMundo() {
        return nivelDePoder > 80; // El héroe solo puede salvar el mundo si su poder es superior a 80
    }

    public String getNombre() {
        return nombre;
    }
}


