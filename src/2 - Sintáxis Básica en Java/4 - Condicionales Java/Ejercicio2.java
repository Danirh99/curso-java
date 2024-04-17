package tema2.subtema4;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Ejemplo de sentencia if-else-if para calcular el descuento en una tienda
        double precioInicial = 100.0;
        double descuento = 0.0;

        if (precioInicial >= 200) {
            descuento = 0.2; // 20% de descuento
        } else if (precioInicial >= 100) {
            descuento = 0.1; // 10% de descuento
        } else {
            descuento = 0.0; // Sin descuento
        }

        double precioFinal = precioInicial * (1 - descuento);
        System.out.println("Precio inicial: €" + precioInicial);
        System.out.println("Descuento: " + (descuento * 100) + "%");
        System.out.println("Precio final: €" + precioFinal);

    }
}
