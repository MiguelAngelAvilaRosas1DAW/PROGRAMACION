package ejercicios;

public class Ejercicio08 {
    public static final int MESES = 12;
    public static final String [] MES = {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};
    public static final char SIMBOLO = '\u2584';

    public static void main (String[] args) {
        int [] temperaturas;
        temperaturas = new int[MESES + 1];

        inicializarArray(temperaturas, MES);
        System.out.println();
        mostrarTemperatura(temperaturas, MES);

    }

    /**
     * Inicializa el array:
     */
    public static void inicializarArray(int [] temperaturas, String [] MES) {
        //VARIABLES:
        int grado;

        for (grado = 0 ; grado < MESES ; grado++) {
            System.out.printf("Introduzca la temperatura media de %s: ", MES[grado]);
            temperaturas [grado] = Integer.parseInt(System.console().readLine());
        }
    }

    public static void mostrarTemperatura(int [] temperaturas, String [] MES) {
        //VARIABLES:
        int meses;
        int grado;

        for (meses = 0 ; meses < MESES ; meses++) {
            System.out.printf("%12s | ", MES[meses]);
            for (grado = 0 ; grado < temperaturas[meses] ; grado++) {
                System.out.print(SIMBOLO);
            }
            System.out.printf(" %dºC", temperaturas[meses]);
            System.out.println();
        }
    }
}