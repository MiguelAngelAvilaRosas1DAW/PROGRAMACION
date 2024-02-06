package ejercicios;

public class Ejercicio02 {
    public static void main (String [] args) {
        //VARIABLES:
        final int NUMFILAS = 3;
        final int NUMCOLUMNAS = 3;

        int[][] tabla;
        int columna;
        int fila;

        tabla = new int[NUMFILAS][NUMCOLUMNAS];

        System.out.println("Indica cada celda de la tabla:");

        try{
            for (fila = 0 ; fila <= NUMFILAS - 1; fila++) {
                for (columna = 0; columna <= NUMCOLUMNAS - 1; columna++) {
                    
                    System.out.printf("Fila %d, columna %d: ", fila, columna);
                    tabla [columna][fila] = Integer.parseInt(System.console().readLine());
                    
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Se le pidio un valor entero.");
        }

        for (fila = 0 ; fila <= NUMFILAS - 1; fila++) {
            for (columna = 0; columna <= NUMCOLUMNAS - 1; columna++) {
                System.out.printf("%d ",tabla [columna][fila]);
            }
            System.out.println("");
        }
    }
}