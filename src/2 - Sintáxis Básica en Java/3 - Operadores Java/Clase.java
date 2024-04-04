package tema2.subtema3;
public class Clase {

    public static void main(String[] args) {

        /* 1º  Suma, Resta, Multiplicación y División: Los Pilares Fundamentales */
        int a = 10;
        int b = 5;

        // Suma
        int suma = a + b; // suma = 15

        // Resta
        int resta = a - b; // resta = 5

        // Multiplicación
        int multiplicacion = a * b; // multiplicacion = 50

        // División
        int division = a / b; // division = 2


        /* 2º  El Operador Módulo */
        int c = 17;
        int d = 5;

        int modulo = c % d; // modulo = 2


        /* 3º  Operadores de Incremento y Decremento */
        int e = 5;

        // Incremento
        a++; // a = 6
        ++a; // a = 7

        // Decremento
        a--; // a = 6
        --a; // a = 5


        /* 4º El Operador AND (&&): Combinando Condiciones con Precisión */
        boolean esMayorDeEdad = true;
        boolean tieneLicencia = false;

        boolean puedeConducir = esMayorDeEdad && tieneLicencia; // puedeConducir = false


        /* 5º  El Versátil Operador OR (||): Explorando Múltiples Escenarios */
        boolean estaLloviendo = true;
        boolean hayNieve = false;

        boolean necesitasParaguas = estaLloviendo || hayNieve; // necesitasParaguas = true


        /* 6º El Operador NOT (!): Negando Condiciones de Forma Eficiente */
        boolean esVerdadero = true;
        boolean esFalso = !esVerdadero; // esFalso = false



        /* 7º Igualdad (==) y Desigualdad (!=): Distinguiendo Valores */
        int f = 5;
        int g = 10;

        boolean sonIguales = f == g; // sonIguales = false
        boolean sonDiferentes = f != g; // sonDiferentes = true


        /* 8º Operadores de Comparación: Mayor que (>), Menor que (<), Mayor o Igual (>=), Menor o Igual (<=) */
        int h = 10;
        int i = 5;

        boolean aMayorQueB = h > i; // aMayorQueB = true
        boolean aMenorQueB = h < i; // aMenorQueB = false
        boolean aMayorIgualQueB = h >= i; // aMayorIgualQueB = true
        boolean aMenorIgualQueB = h <= i; // aMenorIgualQueB = false

        /* 9º La Importancia del Operador instanceof: Verificando Tipos de Objetos */
        Object obj = new String("Hola");

        boolean esString = obj instanceof String; // esString = true
        boolean esInteger = obj instanceof Integer; // esInteger = false
    }

}
