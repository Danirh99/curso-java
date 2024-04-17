package tema2.subtema4;

public class Ejercicio3 {

    public static void main(String[] args) {

        // Ejemplo de sentencias if anidadas para validar una contraseña
        String password = "Contraseña123#";

        boolean hasDigit = false;
        boolean hasUpperCase = false;
        boolean hasLowerCase = false;
        boolean hasSpecialChar = false;
        int length = password.length();

        if (length >= 8) {
            for (int i = 0; i < length; i++) {
                char c = password.charAt(i);
                if (Character.isDigit(c)) {
                    hasDigit = true;
                } else if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                } else if (Character.isLowerCase(c)) {
                    hasLowerCase = true;
                } else {
                    hasSpecialChar = true;
                }
            }

            if (hasDigit && hasUpperCase && hasLowerCase && hasSpecialChar) {
                System.out.println("La contraseña es válida.");
            } else {
                System.out.println("La contraseña no cumple con los requisitos.");
            }
        } else {
            System.out.println("La contraseña debe tener al menos 8 caracteres.");
        }

    }

}
