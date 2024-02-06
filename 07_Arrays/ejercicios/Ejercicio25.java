package ejercicios;

public class Ejercicio25 {
    public static final int NUMFILAS = 4;
    public static final int NUMCOLUMNAS = 5;
    public static final int MINRANDOM = 100;
    public static final int MAXRANDOM = 999;

    public static void main(String[] args) {
        //VARIABLES:
        int[][] tabla;

        tabla = new int[NUMFILAS][NUMCOLUMNAS];

        inicializarTabla(tabla);
        
        mostrarTabla(tabla);
    }

    /**
     * Inicializa el array.
     * @param tabla
     */
    public static void inicializarTabla(int[][] tabla) {
        //VARIABLES:
        int numFila;
        int numColumna;

        for(numFila = 0 ; numFila < NUMFILAS ; numFila++) {
            for(numColumna = 0 ; numColumna < NUMCOLUMNAS ; numColumna++) {
                tabla[numFila][numColumna] = ((int) ((Math.random() * MAXRANDOM - MINRANDOM) + MINRANDOM) * 1);
            }
        }
    }

    /**
     * Muestra el array.
     * @param tabla
     */
    public static void mostrarTabla(int[][] tabla) {
        //VARIABLES:
        int numFila;
        int numColumna;
        int sumaColumnas = 0;

        for(numFila = 0 ; numFila < NUMFILAS ; numFila++) {
            for(numColumna = 0 ; numColumna < NUMCOLUMNAS ; numColumna++) {
                System.out.printf("%d   ", tabla[numFila][numColumna]);
                sumaColumnas += tabla[numFila][numColumna];
            }
            System.out.printf("|    %d\n", sumaColumnas);
            sumaColumnas = 0;
        }
        System.out.println("-------------------------------------------------------------");

        for(numColumna = 0 ; numColumna < NUMCOLUMNAS ; numColumna++) {
            for(numFila = 0 ; numFila < NUMFILAS ; numFila++) {
                sumaColumnas += tabla[numFila][numColumna];
            }
            System.out.printf("%d   ", sumaColumnas);
            sumaColumnas = 0;
        }
    }
}