package ejercicios;

import java.util.Scanner;

public class Ejercicio01_1 {
    public static int x;
    public static final int NUMTOTALES = 10;
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numeros;
        int opcion;

        numeros = new int[NUMTOTALES];

        leerNumeros(numeros);

        System.out.println("¿Como quieres que se muestren lo valores?");
        System.out.println("1. Al derecho");
        System.out.println("2. Al reves");
        opcion = sc.nextInt();
        
        mostrarNumeros(numeros, opcion);
    }

    /**
     * Algo a saber es que el array se pasa POR REFERENCIA, lo que significa que los valores que tenga
     * guardados, si se cambian en una función, los valores cambiaran en el resto de funciones.
     * ¡ASI QUE CUIDADO!
     * @param numeros
     */
    public static void leerNumeros(int[] numeros) {
        System.out.println("Introduce los valores:");
        for (x = 0 ; x < NUMTOTALES; x++) {
            numeros[x] = sc.nextInt();
        }
    }

    public static void mostrarNumeros(int[] numeros, int opcion) {

        System.out.printf("Estos son los valores al %s:\n" , (opcion == 1)?"derecho":"reves");
        
        for (x = 0 ; x < NUMTOTALES; x++) {
            
            if (opcion == 1) {
                System.out.printf("%d ", numeros[x]);
            }
            else {
                System.out.printf("%d ", numeros[ (NUMTOTALES - 1) - x]);
            }
        }
    }
}