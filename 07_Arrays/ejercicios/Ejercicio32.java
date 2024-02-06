package ejercicios;

public class Ejercicio32 {

    public static final char FICHAMAQUINA = 'X';
    public static final char FICHAJUGADOR = 'O';
    public static final int ESTRUCTURATABLA = 3;

    public static void main(String[] args) {
        // VARIABLES:
        char[][] tabla;
        String[][] posicionesColocadas;

        tabla = new char[ESTRUCTURATABLA][ESTRUCTURATABLA];

        //Inicializamos la tabla con espacios, luego se rellenara con las variables deseadas.
        for (int i = 0; i < ESTRUCTURATABLA; i++) {
            for (int j = 0; j < ESTRUCTURATABLA; j++) {
                tabla[i][j] = ' ';
            }
        }

        //Hacemos que la maquina empiece el juego:
        turnoMaquina(tabla, null);

        // Mostramos el tablero
        mostrarTablero(tabla);
    }

    /**
     * Mostramos la tabla del juego.
     * @param tabla
     */
    public static void mostrarTablero(char[][] tabla) {
        for (int fila = 0; fila < ESTRUCTURATABLA; fila++) {
            for (int num = 0; num < ESTRUCTURATABLA; num++) {
                System.out.print("__");
            }
            System.out.println("_");
            for (int columna = 0; columna < ESTRUCTURATABLA; columna++) {
                System.out.printf("|%c", tabla[fila][columna]);
            }
            System.out.println("|");
        }
        for (int num = 0; num < ESTRUCTURATABLA; num++) {
            System.out.print("__");
        }
        System.out.println("_");
    }

    /**
     * La maquina cambia una de las celdas en el juego.
     * @param tabla
     * @param posicionesColocadas
     */
    public static void turnoMaquina(char[][] tabla, int[] posicionesColocadas) {
        int y;
        int x;

            y = ((int) (Math.random() * ESTRUCTURATABLA));
            x = ((int) (Math.random() * ESTRUCTURATABLA));

        tabla[y][x] = FICHAMAQUINA;
    }
}
