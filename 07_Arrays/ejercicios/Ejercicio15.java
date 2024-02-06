package ejercicios;

public class Ejercicio15 {

    public static final int NUMMESAS = 10;
    public static final int NUMMAXGRUPOS = 4;

    public static void main(String[] args) {
        //VARIABLES:
        int[] ocupacionMesas;
        int numGrupo;

        ocupacionMesas = new int[NUMMESAS];

        inicializarArray(ocupacionMesas);

        mostrarDistribucionMesas(ocupacionMesas);

        do {
            System.out.print("¿Cuantos son? (Introduzca -1 para salir del programa): ");
            numGrupo = Integer.parseInt(System.console().readLine());

            if (numGrupo != -1) {
                if (numGrupo <= 4) {
                    sentarGrupo(ocupacionMesas, numGrupo);
                    mostrarDistribucionMesas(ocupacionMesas);
                }
                else {
                    System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo");
                }
                
            }
            else {
                System.out.println("Gracias. Hasta pronto.");
            }
        } while (numGrupo != -1);
    }

    /**
     * Indica una ocupación aleatoria que tendran las mesas al principio.
     */
    public static void inicializarArray(int[] ocupacionMesas) {
        int num;

        for (num = 0 ; num < NUMMESAS ; num++) {
            ocupacionMesas[num] = ((int) (Math.random() * (NUMMAXGRUPOS + 1)));
        }
    }

    /**
     * Muestra la distribución que tendran las mesas.
     */
    public static void mostrarDistribucionMesas(int[] ocupacionMesas) {
        int num;

        System.out.print("Mesa nº   | ");
        for (num = 1 ; num <= NUMMESAS ; num++) {
            System.out.printf("%d | ", num);
        }
        System.out.println("");

        System.out.print("Ocupación | ");
        for (num = 0 ; num < NUMMESAS ; num++) {
            System.out.printf("%d | ", ocupacionMesas[num]);
        }
        System.out.println("\n");
    }

    public static void sentarGrupo(int[] ocupacionMesas, int numGrupo) {
        int num;
        boolean mesaEncontrada = false;

        for (num = 0 ; num < NUMMESAS && mesaEncontrada == false ; num++) {
            if (ocupacionMesas [num] == 0) {
                System.out.printf("Por favor, sientese en la mesa numero %d.\n", num + 1);
                ocupacionMesas [num] += numGrupo;
                mesaEncontrada = true;
            }
        }

        for (num = 0 ; num < NUMMESAS && mesaEncontrada == false ; num++) {
            if (ocupacionMesas[num] + numGrupo <= NUMMAXGRUPOS) {
                System.out.printf("Tendrán que compartir mesa. Por favor, siéntense en la mesa número %d.\n", num + 1);
                ocupacionMesas [num] += numGrupo;
                mesaEncontrada = true;
            }
        }

        if (mesaEncontrada == false) {
            System.out.println("Lo siento, en estos momentos no queda sitio.");   
        }
    }
}