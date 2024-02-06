package ejercicios;

public class Ejercicio13 {

    public static int NUMCELDAS = 100;
    public static int NUMTOTAL = 500;

    public static void main(String [] args) {
        //VARIABLES:
        int [] array;
        int numDestacado = NUMTOTAL + 1;
        int opcion;

        array = new int[NUMCELDAS];

        inicializarArray(array);
        mostrarArray(array, numDestacado);

        do {
        System.out.print("¿Qué quiere destacar? (1 – mínimo, 2 – máximo): ");
        opcion = Integer.parseInt(System.console().readLine());
        
        } while (opcion != 1 && opcion != 2);

        numDestacado = numDestacado(array, opcion);

        mostrarArray(array, numDestacado);
    }

    public static void inicializarArray(int[] array) {
        int num;
        for (num = 0 ; num < NUMCELDAS ; num++) {
            array[num] = (int) (Math.random() * (NUMTOTAL + 1));
        }

    }

    public static void mostrarArray(int[] array, int numDestacado) {
        int num;
        for (num = 0 ; num < NUMCELDAS ; num++) {
            if (array [num] == numDestacado) {
                System.out.printf("**%d** ", array[num]);
            }
            else {
                System.out.printf("%d ", array[num]);
            }
            
        }
        System.out.println("");
    }

    public static int numDestacado(int[] array, int opcion) {
        int num;
        int numDestacado = array [0];
        
        if (opcion == 1) {
            for (num = 1 ; num < NUMCELDAS; num++) {
                if (array [num] < numDestacado) {
                    numDestacado = array [num];
                }
            }
        }
        else {
            for (num = 1 ; num < NUMCELDAS; num++) {
                if (array [num] >= numDestacado) {
                    numDestacado = array [num];
                }
            }
        }

        return numDestacado;
    }

}
