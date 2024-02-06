package ejercicios;

public class Ejercicio03 {
    public static final int NUMTOTALES = 100;
    public static final int RANDOMMAX = 20;

    public static void main(String[] args) {   
        
        //VARIABLES:
        int numElegido = RANDOMMAX + 1;
        int reemplazo = RANDOMMAX + 1;
        int[] tabla;


        tabla = new int[NUMTOTALES];
        
        inicializarArray(tabla);

        mostrarNumeros(tabla, numElegido, reemplazo);

        System.out.println();

        try{
            System.out.print("Introduzca un número de los que se han mostrado: ");
            numElegido = Integer.parseInt(System.console().readLine());

            System.out.print("Introduzca el valor por el que quiere sustituirlo: ");
            reemplazo = Integer.parseInt(System.console().readLine());

            mostrarNumeros(tabla, numElegido, reemplazo);
        } catch (NumberFormatException e) {
            System.out.println("ERROR. Se le pidio introducir un valor entero.");
        }
    }

    /**
     * Muestra los numeros que contiene el array, y reemplaza un numero si lo ha indicado el usuario.
     * @param tabla 
     */
    public static void mostrarNumeros(int[] tabla, int numElegido, int reemplazo) {

        for (int numeroMostrado : tabla) {
            if (numeroMostrado == numElegido) {
                System.out.printf("\"%d\" ", reemplazo);
            } else {
                System.out.printf("%d ",numeroMostrado);   
            }
        }
    }

    /**
     * Inicializa el array con números aleatorios:
     * @param tabla 
     */
    public static void inicializarArray(int[] tabla) {

        int numero;

        for (numero = 0 ; numero < NUMTOTALES; numero ++) {
            tabla [numero] = ((int) (Math.random() * RANDOMMAX + 1));
        }

    }

}