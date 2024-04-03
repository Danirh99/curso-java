package tema2.subtema2;

public class Ejercicio3 {

    // Variable global
    static int global = 10;

    public static void main(String[] args) {

        // Variable local
        int local = 5;

        System.out.println(global); // 10
        System.out.println(local); // 5

        modificarVariable();

        System.out.println(global); // 20
        System.out.println(local); // 5

    }

    public static void modificarVariable() {
        global = 20; // Modifica global

        // local no es accesible aquí
    }
}
