package ejercicios;

public class Ejercicio24 {

    public static final int NUMFILAS = 4;
    public static final int NUMCOLUMNAS = 5;

    public static void main(String[] args) {
        //VARIABLES:
        int[][] tabla;

        tabla = new int[NUMFILAS][NUMCOLUMNAS];

        inicializarTabla(tabla);
        
        mostrarTabla(tabla);
    }

    public static void inicializarTabla(int[][] tabla) {
        //VARIABLES:
        int numFila;
        int numColumna;

        System.out.println("Por favor, introduzca los números (enteros) en el array.");
        for(numFila = 0 ; numFila < NUMFILAS ; numFila++) {
            for(numColumna = 0 ; numColumna < NUMCOLUMNAS ; numColumna++) {
                System.out.printf("Fila %d, columna %d: ", numFila, numColumna);
                tabla[numFila][numColumna] = Integer.parseInt(System.console().readLine());
            }
        }
    }

    public static void mostrarTabla(int[][] tabla) {
        //VARIABLES:
        int numFila;
        int numColumna;
        int sumaColumnas = 0;

        System.out.println("Por favor, introduzca los números (enteros) en el array.");
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