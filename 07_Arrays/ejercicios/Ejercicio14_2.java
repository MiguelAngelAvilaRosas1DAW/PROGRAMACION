package ejercicios;

public class Ejercicio14_2 {

    public static final int TOTALPALABRAS = 8;
    private static final String[] COLORES = {"verde", "rojo", "azul", "amarillo", "naranja", "rosa", "negro", "blanco", "morado"};

    public static void main(String[] args) {
        //VARIABLES:
        String[] palabrasUsuario;

        palabrasUsuario = new String [TOTALPALABRAS];

        inicializarArray(palabrasUsuario);

        System.out.println("Array original:");
        mostrarArray(palabrasUsuario);

        cambiarPosicionArray(palabrasUsuario, COLORES);

        System.out.println("Array resultante:");

        mostrarArray(palabrasUsuario);
    }

    
    /**
     * Inicializamos el array, pidiendole palabras al usuario.
     * @param palabrasUsuario
     */
    public static void inicializarArray(String[] palabrasUsuario) {
        int num;

        System.out.println("Introduzca 8 palabras (vaya pulsando [INTRO] entre una y otra):");
        for (num = 0 ; num < TOTALPALABRAS ; num++) {
            palabrasUsuario[num] = System.console().readLine();
        }
    }


    /**
     * Mostramos el array.
     * @param palabrasUsuario
     */
    public static void mostrarArray(String[] palabrasUsuario) {
        int num;

        for (num = 0 ; num < TOTALPALABRAS ; num++) {
            System.out.printf("|     %-7d", num);
        }
        System.out.println("|");

        for (num = 0 ; num < TOTALPALABRAS ; num++) {
            System.out.printf("|  %-10s", palabrasUsuario[num]);
        }

        System.out.println("|");
    }


    /**
     * Ordena el array para que los colores vayan primero.
     * @param palabrasUsuario
     * @param COLORES
     */
    public static void cambiarPosicionArray(String[] palabrasUsuario, String[] COLORES) {
        //VARIABLES:
        String temp;
        boolean ordenado = true;

        //Esta variable permite un proceso mas rapido al reducir el numero de comparaciones de la tabla.
        int max = 1;

        do {

            for (int i = 0 ; i < palabrasUsuario.length - max ; i++) {
                if (!esColor(palabrasUsuario[i], COLORES) && esColor(palabrasUsuario[i+1], COLORES)) {
                    temp = palabrasUsuario[i];
                    palabrasUsuario[i] = palabrasUsuario[i+1];
                    palabrasUsuario[i+1] = temp;
                    ordenado = false;
                }
            }

            max++;

        } while (!ordenado);
    }


    /**
     * Cogemos el array modificado y lo pasamos al array original.
     * @param aux
     * @param palabras
     */
    public static void copiar(String[] aux, String[] palabras) {
        int x = 0;

        for (String item : aux) {
            palabras [x] = item;
            x++;
        }
    }


    /**
     * Comprobamos si la palabra seleccionada es un color.
     * @param palabra
     * @param COLORES
     * @return
     */
    public static boolean esColor(String palabra, String[] COLORES) {
        int i = 0;
        
        while ((i < COLORES.length) && (!palabra.equals(COLORES[i]))) {
            i++;
        }

        return (i<COLORES.length);
    }
}