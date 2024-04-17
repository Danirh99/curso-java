package tema2.subtema4;
public class Clase {

    public static void main(String[] args) {

        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        else {
            System.out.println("Eres menor de edad.");
        }


        int calificacion = 75;

        if (calificacion >= 90) {
            System.out.println("Excelente trabajo, obtuviste una A.");
        } else if (calificacion >= 80) {
            System.out.println("Muy bien, obtuviste una B.");
        } else if (calificacion >= 70) {
            System.out.println("Buen esfuerzo, obtuviste una C.");
        } else if (calificacion >= 60) {
            System.out.println("Necesitas mejorar, obtuviste una D.");
        } else {
            System.out.println("Lo siento, has reprobado.");
        }

        int dia = 3;
        switch (dia) {
            case 1:
                System.out.println("Lunes");
                break;
            case 2:
                System.out.println("Martes");
                break;
            case 3:
                System.out.println("Miércoles");
                break;
            default:
                System.out.println("Otro día");
                break;
        }

    }

}
