package ejercicios;

public class Ejercicio30 {

    public static final int TOTALFILAS = 4;
    public static final int TOTALCOLUMNAS = 5;
    public static final char SIMBOLOBUSCANDO = 'X';
    public static final char SIMBOLOENCONTRADO = '€';
    public static final char SIMBOLOMINA = '*';
    private static boolean mostrarMapa = false;
    private static boolean tesoroEncontrado = false;
    private static boolean minaEncontrada = false;

    public static void main(String[] args) {
        //VARIABLES:
        char[][] cordenadas;
        
        cordenadas = new char[TOTALFILAS][TOTALCOLUMNAS];
        int cordenadaX = TOTALFILAS + 1;
        int cordenadaY = TOTALCOLUMNAS + 1;

        System.out.println("¡BUSCA EL TESORO!");
        mostrarMapa(cordenadas, cordenadaX, cordenadaY);
        mostrarMapa = true;

        do {
            System.out.print("Coordenada x: ");
            cordenadaX = Integer.parseInt(System.console().readLine());
            System.out.print("Coordenada y: ");
            cordenadaY = Integer.parseInt(System.console().readLine());
            mostrarMapa(cordenadas, cordenadaX, cordenadaY);
            if (minaEncontrada) {
                System.out.println("¡BOOOM! Lo siento, has perdido.");
            }
            if (tesoroEncontrado) {
                System.out.println("¡ENHORABUENA! ¡Has encontrado el tesoro!");
            }
        } while(tesoroEncontrado == false && minaEncontrada == false);
    }

    /**
     * Mostramos el mapa del tesoro con las coordenadas en que se han buscado.
     */
    public static void mostrarMapa(char[][] cordenadas,int cordenadaX, int cordenadaY) {
        final int CORDENADAXTESORO = ((int) (Math.random() * TOTALCOLUMNAS));
        final int CORDENADAYTESORO = ((int) (Math.random() * TOTALFILAS));
        final int CORDENADAXMINA = ((int) (Math.random() * TOTALCOLUMNAS));
        final int CORDENADAYMINA = ((int) (Math.random() * TOTALFILAS));

        int num;

        for (num = 0 ; num < TOTALFILAS ; num++) {
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
        for (num = 0 ; num < TOTALCOLUMNAS ; num++) {
            System.out.printf("--");

        }
        System.out.println("");
        System.out.print("  ");
        for (num = 0 ; num < TOTALCOLUMNAS ; num++) {
            System.out.printf("%d ", num);

        }
        System.out.println("");
        if ((cordenadaX == CORDENADAXMINA + 1 && cordenadaY == CORDENADAYMINA) || cordenadaX == CORDENADAXMINA + 1) {
            
        }
    }
}