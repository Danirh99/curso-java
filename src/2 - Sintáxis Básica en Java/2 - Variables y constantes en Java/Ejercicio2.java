package tema2.subtema2;

public class Ejercicio2 {

    public static void main(String[] args) {

        // Declarar constantes
        final double IVA = 0.21;
        final double DESCUENTO = 0.1;

        // Precio base
        double precioBase = 100;

        // Aplicar descuento al precio base
        double precioDescuento = precioBase * (1 - DESCUENTO);

        // Aplicar IVA al precio con descuento
        double precioFinal = precioDescuento * (1 + IVA);

        // Mostrar precio final
        System.out.println("Precio final: " + precioFinal);

        // Resultado 108.9
    }
}
