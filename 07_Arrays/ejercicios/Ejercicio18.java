package ejercicios;

public class Ejercicio18 {

    private static final int MAXTABLA = 10;
    private static final int MINNUM = 10;
    private static final int MAXNUM = 200;
    private static final int NUMMOD = 100;

    public static void main(String[] args) {
        //VARIABLES:
        int[] tabla;
        tabla = new int[MAXTABLA];

        inicializarTabla(tabla);

        //Mostramos el array original:

        System.out.println("Array original:");
        mostrarTabla(tabla);

        modificarTabla(tabla);

        //Mostramos el array modificado:

        System.out.println("Array resultado:");
        mostrarTabla(tabla);
    }

    public static void inicializarTabla(int[] tabla) {
        for (int num = 0 ; num < MAXTABLA ; num++) {
            tabla[num] = ((int) (Math.random() * MAXNUM - MINNUM) + MINNUM);
        }
    }

    public static void mostrarTabla(int[] tabla) {
        System.out.print("Índice ");
        for (int x = 0 ; x < MAXTABLA ; x++) {
            System.out.printf("| %d ", x);
        }
        System.out.println("|");

        System.out.print("Valor ");
        for (int item : tabla) {
            System.out.printf("| %d ", item);
        }
        System.out.println("|");
    }

    public static void modificarTabla(int[] tabla) {
        //VARIABLES:
        int[] nuevaTabla;
        nuevaTabla = new int[MAXTABLA];
        boolean numEncontrado = false;
        int ini = 0;
        int temp = 0;
        int temp2 = 0;

        while (ini < MAXTABLA){
            for(int num = 0 + temp ; num < MAXTABLA && numEncontrado == false ; num++) {
                if (tabla[num] <= NUMMOD) {
                    nuevaTabla[ini] = tabla[num];
                    numEncontrado = true;
                    ini++;
                    temp = num + 1;
                }
            }
            numEncontrado = false;
            for(int num = 0 + temp2 ; num < MAXTABLA && numEncontrado == false ; num++) {
                if (tabla[num] > NUMMOD) {
                    nuevaTabla[ini] = tabla[num];
                    numEncontrado = true;
                    ini++;
                    temp2 = num + 1;
                }
            }
            numEncontrado = false;
        }

        copiarTabla(nuevaTabla, tabla);
    }

    public static void copiarTabla(int[] nuevaTabla, int[] tabla) {
        int ini = 0;
        for (int item : nuevaTabla) {
            tabla[ini] = item;
            ini++;
        }
    }
}