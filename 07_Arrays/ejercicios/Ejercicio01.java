package ejercicios;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main (String [] args) {
        //VARIABLES:
        int[] numeros;
        int valor;
        int x;

        numeros = new int [10];
        Scanner sc = new Scanner (System.in);

        System.out.println("Por favor, introduzca 10 números enteros.");
        System.out.println("Pulse la tecla INTRO después de introducir cada número.");
        
        for (x = 0; x < 10 ; x++) {
            valor = sc.nextInt();

            numeros[x] = valor;
        }
        System.out.println("Los números introducidos alreves son los siguientes:");
        System.out.printf("%d %d %d %d %d %d %d %d %d %d", numeros[9], numeros[8], numeros[7], numeros[6], numeros[5], numeros[4], numeros[3], numeros[2], numeros[1], numeros[0]);
        
    }
}
