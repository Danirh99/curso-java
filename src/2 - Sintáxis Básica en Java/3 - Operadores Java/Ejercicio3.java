package tema2.subtema3;

public class Ejercicio3 {

    public static void main(String[] args) {

        int calificacionFinal = 75;
        int calificacionMinima = 60;
        boolean asistenciaRegular = true;

        boolean aprobado = calificacionFinal >= calificacionMinima && asistenciaRegular;

        if (aprobado) {
            System.out.println("El estudiante aprobó el curso.");
        } else {
            System.out.println("El estudiante reprobó el curso.");
        }

        // Salida: El estudiante aprobó el curso.

    }

}
