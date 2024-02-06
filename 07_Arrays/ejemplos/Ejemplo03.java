package ejemplos;

import java.util.Scanner;

public class Ejemplo03 {
    public static final int TAMANIO_TABLA = 3;
    public static void main (String [] args) {
        //VARIABLES:

        int columna;
        int fila;
        int valor;
        int[][] tabla = {{8, -12, 33},
                         {14, 33, -24},
                         {100, 51, 69}};
    
        Scanner sc = new Scanner(System.in);

        try {
        
        System.out.print("Introduce el numero del valor quieres sacar (0 a 8): ");
        valor = sc.nextInt();        

        fila = valor / TAMANIO_TABLA;
        columna = valor % TAMANIO_TABLA;
        
        System.out.println(tabla [fila][columna]);

        } catch (IndexOutOfBoundsException e) {
            System.out.println("El valor introducido no esta en la tabla.");
        }
    }
}