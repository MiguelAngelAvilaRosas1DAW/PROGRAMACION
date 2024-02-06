package ejercicios;

public class Ejercicio19 {

    private static final int MAXTABLA = 12;
    private static final int MINNUM = 10;
    private static final int MAXNUM = 200;

    public static void main(String[] args) {
        //VARIABLES:
        int[] tabla;
        tabla = new int[MAXTABLA];
        int numNuevo;
        int posicion;

        inicializarTabla(tabla);

        //Mostramos la tabla con los valores originales:
        System.out.println("Array original:");
        mostrarTabla(tabla);

        System.out.print("Introduzca el número que quiere insertar: ");
        numNuevo = Integer.parseInt(System.console().readLine());

        System.out.printf("Introduzca la posición donde lo quiere insertar (0 – %d): ", MAXTABLA - 1);
        posicion = Integer.parseInt(System.console().readLine());

        insertarNumero(tabla, numNuevo, posicion);

        //Mostramos la tabla con los valores modificados:
        System.out.println("Array resultado:");
        mostrarTabla(tabla);
    }

    public static void inicializarTabla(int[] tabla) {
        for(int x = 0 ; x < MAXTABLA ; x++) {
            tabla[x] = ((int) (Math.random() * MAXNUM - MINNUM) + MINNUM);
        }
    }

    public static void mostrarTabla(int[] tabla) {
        System.out.print("Indice ");
        for(int x = 0 ; x < MAXTABLA ; x++) {
            System.out.printf("%4d ", x);
        }
        System.out.println("");
        System.out.print("Valor ");
        for(int item : tabla) {
            System.out.printf("%5d ", item);
        }
        System.out.println("");
    }

    public static void insertarNumero(int[] tabla, int numNuevo, int posicion) {
        int[] nuevaTabla;
        nuevaTabla = new int[MAXTABLA];

        nuevaTabla [posicion] = numNuevo;
        for (int x = posicion + 1 ; x < MAXTABLA ; x++) {
            nuevaTabla[x] = tabla[x - 1];
        }
        for (int x = 0 ; x < posicion ; x++) {
            nuevaTabla[x] = tabla[x];
        }

        copiar(nuevaTabla, tabla);
    }

    public static void copiar(int[] nuevaTabla, int[] tabla) {
        int ini = 0;

        for (int item : nuevaTabla) {
            tabla[ini] = item;
            ini++;
        }
    }
}
