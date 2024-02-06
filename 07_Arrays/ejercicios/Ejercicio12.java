package ejercicios;

public class Ejercicio12 {
    public static final int NUMCOLUMNAS = 10;

    public static void main (String [] args) {
        //VARIABLES:
        int[] tabla;
        int posicionInicial;
        int posicionFinal;

        tabla = new int[NUMCOLUMNAS];

        inicializarArray(tabla);

        System.out.println("Array original:");
        mostrarArray(tabla);
        

        do {
        System.out.print("Introduzca la posición inicial (0 - 9): ");
        posicionInicial = Integer.parseInt(System.console().readLine());
        } while (posicionInicial > NUMCOLUMNAS || posicionInicial < 0);

        do {
        System.out.print("Introduzca la posición final (0 - 9): ");
        posicionFinal = Integer.parseInt(System.console().readLine());
        } while (posicionFinal > NUMCOLUMNAS || posicionFinal < 0 || posicionFinal < posicionInicial);

        System.out.println("Array original:");
        mostrarArray(tabla);
        System.out.println("");
        cambiarArray(tabla, posicionInicial, posicionFinal);

        System.out.println("Array resultante:");
        mostrarArray(tabla);
    }

    /**
     * Inicializa el array
     */
    public static void inicializarArray(int[] tabla) {
        //Variables:
        int numFila;
        int numColumna;

        System.out.println("Introduzca 10 números separados por INTRO:");
        for (numColumna = 0 ; numColumna < NUMCOLUMNAS ; numColumna++) {
            tabla [numColumna] = Integer.parseInt(System.console().readLine());
        }
    }

    public static void cambiarArray(int[] tabla, int posicionInicial, int posicionFinal) {

        int numColumna;
    
        for (numColumna = NUMCOLUMNAS - 1 ; numColumna > 0; numColumna--) {
            
            if (numColumna == NUMCOLUMNAS-1) {
                tabla [0] = tabla[NUMCOLUMNAS -1];
                tabla [numColumna] = tabla [numColumna - 1];
            }
            else if (numColumna == posicionInicial) {
                tabla[posicionFinal] = tabla[posicionInicial];
                tabla [numColumna] = tabla [numColumna - 1];
            }
            else if (numColumna <= posicionInicial || numColumna > posicionFinal) {
                tabla [numColumna] = tabla [numColumna - 1];
            }
            
        }
        
    }

    public static void mostrarArray(int[] tabla) {
        int numColumna;

        System.out.print("| Índice ");
        for (numColumna = 0 ; numColumna < NUMCOLUMNAS ; numColumna++) {
            System.out.printf("| %d ", numColumna);
        }
        System.out.println("|");

        System.out.print("| Valor  ");
        for (int num : tabla) {
            System.out.printf("| %d ", num);
        }
        System.out.print("|");
        System.out.println("");
    }
}
