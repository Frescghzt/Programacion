package clase_6;

public class Calificaciones {
    public static void main(String[] args) {
        int[] calificaciones = {85, 90, 78, 92, 88};
        int suma = 0;

        for (int calificacion : calificaciones) {
            suma += calificacion;
        }

        double promedio = suma / (double) calificaciones.length;
        System.out.println("El promedio de las calificaciones es: " + promedio);
            }

}
