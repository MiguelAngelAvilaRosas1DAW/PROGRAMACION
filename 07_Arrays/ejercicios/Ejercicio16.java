package ejercicios;

public class Ejercicio16 {

    public static final int TOTALENTEROS = 20;
    public static final int MAXNUM = 400;

    public static void main(String[] args) {
        //VARIABLES:
        int[] numEnteros;
        int opcion;

        numEnteros = new int[TOTALENTEROS];

        inicializarArray(numEnteros);

        System.out.println("¿Qué números quiere resaltar?");
        System.out.print("(1 – los múltiplos de 5, 2 – los múltiplos de 7): ");
        opcion = Integer.parseInt(System.console().readLine());

        mostrarArray(numEnteros, opcion);

    }

    /**
     * Inicializa el array de los numeros.
     */
    public static void inicializarArray (int[] numEnteros) {
        //VARIABLES:
        int num;
        for (num = 0 ; num < TOTALENTEROS ; num++) {
            numEnteros[num] = ((int) (Math.random() * (MAXNUM + 1)));
        }
    }

     /**
     * Muestra el array de los numeros, y si estos cumplen la condición, se le añaden [].
     */
    public static void mostrarArray(int[] numEnteros, int opcion) {
        int numOpcion;

        if (opcion == 1) {
            numOpcion = 5;
        }
        else {
            numOpcion = 7;
        }
        
        for (int num : numEnteros) {
                if (num % numOpcion == 0) {
                    System.out.printf("[%d] ", num); 
                }
                else {
                    System.out.printf("%d ", num);
                }
             
        }
    }
}
