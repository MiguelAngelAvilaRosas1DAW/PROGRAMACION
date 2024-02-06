package ejercicios;

public class Ejercicio31 {

    public static final int LADOSTABLERO = 8;
    public static final int MAXPOSICIONES = 13;

    public static void main(String[] args) {
        //VARIABLES:
        String[][] tablero;
        String[] resultado;
        String posicionAlfil;
        int posicionX;
        int posicionY;

        tablero = new String[LADOSTABLERO][LADOSTABLERO];
        resultado = new String[MAXPOSICIONES];

        System.out.print("Introduzca la posición del alfil: ");
        posicionAlfil = System.console().readLine();
        posicionX = obtenerPosicionXUsuario(posicionAlfil);
        posicionY = obtenerPosicioYUusuario(posicionAlfil);

        obtenerPosiciones(tablero, resultado, posicionX, posicionY);

        mostrarPosiciones(resultado);
    }

    /**
     * Pasa la letra que haya introducido el usuario a un numero.
     * @param posicionAlfil
     * @return
     */
    public static int obtenerPosicioYUusuario(String posicionAlfil) {
        int posicionY = 0;

        switch (posicionAlfil.charAt(0)) {
            case 'a':{
                posicionY = 0;
            } break;

            case 'b':{
                posicionY = 1;
            } break;

            case 'c':{
                posicionY = 2;
            } break;

            case 'd':{
                posicionY = 3;
            } break;

            case 'e':{
                posicionY = 4;
            } break;

            case 'f':{
                posicionY = 5;
            } break;

            case 'g':{
                posicionY = 6;
            } break;

            case 'h':{
                posicionY = 7;
            } break;

        }

        return posicionY;
    }

    /**
     * Pasa el numero que haya introducido el usuario a un numero.
     * @param posicionAlfil
     * @return
     */
    public static int obtenerPosicionXUsuario(String posicionAlfil) {
        int posicionX = 0;

        switch (posicionAlfil.charAt(1)) {
            case '1':{
                posicionX = 7;
            } break;

            case '2':{
                posicionX = 6;
            } break;

            case '3':{
                posicionX = 5;
            } break;

            case '4':{
                posicionX = 4;
            } break;

            case '5':{
                posicionX = 3;
            } break;

            case '6':{
                posicionX = 2;
            } break;

            case '7':{
                posicionX = 1;
            } break;

            case '8':{
                posicionX = 0;
            } break;

        }

        return posicionX;
    }

    /**
     * Pasa el numero de la posiciín a una letra del ajedrez.
     * @param posicionAlfil
     * @return
     */
    public static String obtenerPosicionYNumero(int posicionAlfil) {
        String posicionY = "";

        switch (posicionAlfil) {
            case 0:{
                posicionY = "a";
            } break;

            case 1:{
                posicionY = "b";
            } break;

            case 2:{
                posicionY = "c";
            } break;

            case 3:{
                posicionY = "d";
            } break;

            case 4:{
                posicionY = "e";
            } break;

            case 5:{
                posicionY = "f";
            } break;

            case 6:{
                posicionY = "g";
            } break;

            case 7:{
                posicionY = "h";
            } break;

        }
        return posicionY;
    }

    /**
     * Obtiene las posiciones laterales a las que se puede mover el alfil en el tablero.
     * @param tablero
     * @param resultado
     * @param posicionX
     * @param posicionY
     */
    public static void obtenerPosiciones(String[][] tablero, String[] resultado, int posicionX, int posicionY) {
        int numResultado = 0;
        String resultadoY;
        int x = posicionX;
        
        for (int y = posicionY - 1 ; y >= 0 && x >= 0 ; y--) {
                resultadoY = obtenerPosicionYNumero(y);
                resultado [numResultado] = resultadoY + (x + 1);
                x--;
                numResultado++;
        }

        //Restauramos el valor de X para la proxima operación:
        x = posicionX;


        for (int y = posicionY + 1 ; y < LADOSTABLERO && x <= LADOSTABLERO ; y++) {
            resultadoY = obtenerPosicionYNumero(y);
            resultado [numResultado] = resultadoY + (x + 1);
            x--;
            numResultado++;
        }

        //Restauramos el valor de X para la proxima operación:
        x = posicionX + 2;


        for (int y = posicionY - 1 ; y >= 0 && x <= LADOSTABLERO ; y--) {
            resultadoY = obtenerPosicionYNumero(y);
            resultado [numResultado] = resultadoY + (x + 1);
            x++;
            numResultado++;
        }

    }

    /**
     * Muestra las posiciones resultantes optenidas de la posición del alfil.
     * @param resultado
     */
    public static void mostrarPosiciones(String[] resultado) {
        for (int x = 0 ; x < MAXPOSICIONES ; x++) {
            System.out.printf("%s ", resultado[x]);
        }
    }
}
