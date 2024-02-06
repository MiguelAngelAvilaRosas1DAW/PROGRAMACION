package ejercicios;

public class Ejercicio11 {
    public static final int NUMCOLUMNAS = 10;
    public static void main(String[] args) {
        //VARIABLES:
        int[] tabla;
        tabla = new int[NUMCOLUMNAS];

        inicializarArray(tabla);
        System.out.println();
        mostrarTabla(tabla);
    }

    public static void inicializarArray(int[] tabla) {
        //VARIABLES:
        int num;
        for (num = 0 ; num < NUMCOLUMNAS ; num++) {
            tabla[num] = Integer.parseInt(System.console().readLine());
        }
    }

    public static void reAgrupar(int[] tabla) {
        //VARIABLE:
        int num = 0;
        int numAnterior;

        for (int i : tabla) {
            if (esPrimo(i) == true) {
                numAnterior = tabla[num];
            }
            num++;
        }
    }

    public static void mostrarTabla(int[] tabla) {
        int x;
        System.out.print("Índice: ");
        for (x = 0 ; x < NUMCOLUMNAS ; x++) {
            System.out.printf("%d ", x);
        }
        System.out.println();
        System.out.print("Valor: ");
        for (int nums : tabla) {
            System.out.printf("%d ", nums);
        }
    }

    public static boolean esPrimo(int numero) {

        int i = 2 ; 

        while ((i <= (numero/2)) && (numero%i!=0)) { 
            i++ ; 
        }

        return (i > (numero/2)) ;
    }
}
