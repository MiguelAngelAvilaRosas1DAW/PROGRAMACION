package ejercicios;

public class Ejercicio29 {

    //Indicamos las columnas y filas totales que habra:
    public static final int TOTALFILAS = 3;
    public static final int TOTALCOLUMNAS = 4;

    //Indicamos las posiciones X e Y del tesoro y la Mina: 
    public static final int CORDENADAXTESORO = ((int) (Math.random() * TOTALCOLUMNAS));
    public static final int CORDENADAYTESORO = ((int) (Math.random() * TOTALFILAS));
    public static final int CORDENADAXMINA = ((int) (Math.random() * TOTALCOLUMNAS));
    public static final int CORDENADAYMINA = ((int) (Math.random() * TOTALFILAS));

    //Inidicamos los caracteres que se utilizaran para representar objetos en el tablero:
    public static final char SIMBOLOBUSCANDO = 'X';
    public static final char SIMBOLOENCONTRADO = '€';
    public static final char SIMBOLOMINA = '*';

    //Estas variables booleanas indican si el usuario encontro algunos de los dos eventos:
    private static boolean tesoroEncontrado = false;
    private static boolean minaEncontrada = false;

    //Esta variable inidica que el usuario ha visto al menos UNA VEZ el mapa:
    private static boolean mostrarMapa = false;

    //Indica los colores que es utilizaran para ciertos eventos y errores:
    private static final String ERROR= "\033[31m\033[1m";
    private static final String VICTORIA= "\033[33m\033[1m";
    private static final String NADA= "\033[0m";

    public static void main(String[] args) {
        //VARIABLES:
        char[][] cordenadas;
        
        cordenadas = new char[TOTALFILAS][TOTALCOLUMNAS];
        int cordenadaX = TOTALFILAS + 1;
        int cordenadaY = TOTALCOLUMNAS + 1;

        //Mostramos el mapa inicial al jugador, e indicamos que ya ha visto el tablero:
        System.out.println("¡BUSCA EL TESORO!");
        mostrarMapa(cordenadas, cordenadaX, cordenadaY);
        mostrarMapa = true;

        jugando(cordenadas, cordenadaX, cordenadaY);
    }

    /**
     * Introduce espacios en el array para generar la estructura.
     * @param cordenadas
     */
    public static void inicializarTablero(char[][] cordenadas) {
        for (int fila = TOTALFILAS - 1 ; fila >= 0 ; fila--) {
            for (int columna = 0 ; columna < TOTALCOLUMNAS ; columna++) {
                cordenadas[fila][columna] = ' ';
            }
        }
    }

    /**
     * Mostramos el mapa del tesoro con las coordenadas en que se han buscado.
     * @param cordenadas
     * @param cordenadaX
     * @param cordenadaY
     */
    public static void mostrarMapa(char[][] cordenadas,int cordenadaX, int cordenadaY) {

        int num;

        //Mostramos las filas:
        for (num = TOTALFILAS - 1 ; num >= 0 ; num--) {
            System.out.printf("%d|", num);
                if (mostrarMapa == true) {
                    if (cordenadaX == CORDENADAXTESORO && cordenadaY == CORDENADAYTESORO) {
                        cordenadas[cordenadaY][cordenadaX] = SIMBOLOENCONTRADO;
                        tesoroEncontrado = true;
                    }
                    else if (cordenadaX == CORDENADAXMINA && cordenadaY == CORDENADAYMINA) {
                        cordenadas[cordenadaY][cordenadaX] = SIMBOLOMINA;
                        minaEncontrada = true;
                    }
                    else {
                        cordenadas[cordenadaY][cordenadaX] = SIMBOLOBUSCANDO;
                    }

                    for (int y = 0 ; y < TOTALCOLUMNAS ; y++) {
                        System.out.printf("%c ", cordenadas[num][y]);
                    }
                }
            System.out.println("");
        }

        System.out.print("  ");

        //Mostramos las columnas:
        for (num = 0 ; num < TOTALCOLUMNAS ; num++) {
            System.out.printf("--");

        }
        System.out.println("");
        System.out.print("  ");
        for (num = 0 ; num < TOTALCOLUMNAS ; num++) {
            System.out.printf("%d ", num);

        }
        System.out.println("");
    }

    //Pedimos al usuario que indique una posición a buscar:
    public static void jugando(char[][] cordenadas ,int cordenadaX, int cordenadaY) {
        try {
            do {
                do{
                System.out.printf("Coordenada X (0-%d): ", TOTALCOLUMNAS - 1);
                cordenadaX = Integer.parseInt(System.console().readLine());
    
                //Si la cordenada X se sale de los limites, se dara un mensaje de error
                //y se pedira que lo vuelva a introducir.
                if (cordenadaX > TOTALCOLUMNAS - 1 || cordenadaX < 0) {
                    System.out.printf("%sLa posición X tiene que estar entre 0 y %d%s\n\n", ERROR, TOTALCOLUMNAS - 1, NADA);
                }
                } while(cordenadaX > TOTALCOLUMNAS - 1 || cordenadaX < 0);
    
                do{
                System.out.printf("Coordenada Y (0-%d): ", TOTALFILAS - 1);
                cordenadaY = Integer.parseInt(System.console().readLine());
    
                //Si la cordenada Y se sale de los limites, se dara un mensaje de error
                //y se pedira que lo vuelva a introducir.
                if (cordenadaY > TOTALFILAS - 1 || cordenadaY < 0) {
                    System.out.printf("%sLa posición Y tiene que estar entre 0 y %d%s\n\n", ERROR, TOTALFILAS - 1, NADA);
                }
                } while(cordenadaY > TOTALFILAS - 1 || cordenadaY < 0);
    
                //Una vez indicadas las posiciones correctas, se mostrara el mapa con el
                //resultado de la busqueda.
                mostrarMapa(cordenadas, cordenadaX, cordenadaY);
    
                //Mensaje de victoria o derrota:
                if (minaEncontrada) {
                    System.out.printf("%s¡BOOOM! Lo siento, has perdido.%s\n", ERROR, NADA);
                }
                if (tesoroEncontrado) {
                    System.out.printf("%s¡ENHORABUENA! ¡Has encontrado el tesoro!%s\n", VICTORIA, NADA);
                }
            } while(tesoroEncontrado == false && minaEncontrada == false);
    
        //Si el usuario introduce valores incorrectos (palabras), enviamos un mensaje de error.
        } catch (NumberFormatException e) {
            System.out.println("\033[31m\033[1mERROR: Se le pidio introducir un número.\033[0m");
        }
    }
    
}