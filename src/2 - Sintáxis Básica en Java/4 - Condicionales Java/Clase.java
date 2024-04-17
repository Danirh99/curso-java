package tema2.subtema4;
public class Clase {

    public static void main(String[] args) {

        int edad = 18;
        if (edad >= 18) {
            System.out.println("Eres mayor de edad.");
        }
        else if(edad == 17)
        {
            System.out.println("Ya casi eres mayor de edad");
        }
        else {
            System.out.println("Eres menor de edad.");
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
