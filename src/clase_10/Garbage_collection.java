package clase_10;

public class Garbage_collection {
    public static void main(String[] args) {
        // Creamos un objeto
        Garbage_collection obj = new Garbage_collection();

        // El objeto ya no tiene referencia después de ser nulo
        obj = null;
        System.out.println(obj);
        // El recolector de basura podrá liberar la memoria de este objeto
        System.gc();  // Sugerimos a la JVM iniciar el Garbage Collection
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("El objeto se está eliminando");
    }
}
