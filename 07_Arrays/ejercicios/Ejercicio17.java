package ejercicios;

public class Ejercicio17 {

    public static final int MAXTABLA = 10;
    public static final int NUMMAX = 100;

    public static void main(String[] args) {
        //VARIABLES:
        int[] tabla;
        int numUsuario;
        boolean numUsuarioCorrecto = false;

        tabla = new int[MAXTABLA];

        inicializarArray(tabla);

        //Mostramos el array original:
        mostrarArray(tabla);

        do {
        System.out.print("Introduzca uno de los números del array: ");
        numUsuario = Integer.parseInt(System.console().readLine());
        for (int item : tabla) {
            if (numUsuario == item) {
                numUsuarioCorrecto = true;
            }
        }
        if (numUsuarioCorrecto == false) {
            System.out.println("Ese número no se encuentra en el array.");
        }
        } while (numUsuarioCorrecto == false);

        modificarArray(tabla, numUsuario);

        //Mostramos el array modificado:
        mostrarArray(tabla);
    }

    /**
     * Inicializa el array poniendo numeros en la tabla.
     */
    public static void inicializarArray(int[] tabla) {
        for (int x = 0 ; x < MAXTABLA ; x++) {
            tabla[x] = ((int) (Math.random() * NUMMAX + 1));
        }
    }

    /**
     * Muestra la tabla junto con la posición.
     */
    public static void mostrarArray(int[] tabla) {
        for (int x = 0 ; x < MAXTABLA ; x++) {
            System.out.printf("%d ", x);
        }
        System.out.println("");

        for (int item : tabla) {
            System.out.printf("%d ", item);
        }
        System.out.println("");
    }

    /**
     * Modifica el array para que el número elejido vaya el primero.
     */
    public static void modificarArray(int[] tabla, int numUsuario) {
        int[] aux;
        aux = new int[MAXTABLA];
        int ini = 0;
        int x;

        for (x = 0 ; x < MAXTABLA ; x++) {
            if (tabla[x] == numUsuario) {
                while (ini < MAXTABLA && x < MAXTABLA) {
                    aux[ini] = tabla[x];
                    ini++;
                    x++;
                }
            }
        }
        x = 0;

        while (ini < MAXTABLA) {
            aux[ini] = tabla[x];
            ini++;
            x++;
        }

        copiarArray(aux, tabla);
    }

    /**
     * Copiamos el array modificado en el array original.
     */
    public static void copiarArray(int[] aux, int[] tabla) {
        int x = 0;
        for (int item : aux) {
            tabla[x] = item;
            x++;
        }
    }
}