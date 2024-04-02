import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        // Hola Mundo Básico
        System.out.println("Hola Mundo");

        // Hola Mundo con entrada de usuario
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce tu nombre: ");
        String nombre = scanner.nextLine();

        System.out.println("Hola Mundo, mi nombre es " + nombre);

        // Hola Mundo con formato especial
        System.out.printf("%s %s %s", "Hola", "Mundo", "!!!");

    }

}
