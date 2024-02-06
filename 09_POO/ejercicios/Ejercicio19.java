package ejercicios;
import java.util.Scanner;

public class Ejercicio19 {
    public static void main (String [] args) {
        //VARIABLES:
        final int ANCHO_CUBA = 6;

        int capacidad;
        int litrosRandom;
        int x;
        int y;

        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, indique la capacidad de la cuba en litros: ");
        capacidad = sc.nextInt();

        litrosRandom = ((int) (Math.random() * capacidad) + 1);

        for (y = capacidad ; y >= 0; y--) {
            for (x = 1 ; x <= ANCHO_CUBA ; x++) {
                if (y == 0) {
                    System.out.print("#");
                }
                else {
                    if (x == 1 || x == ANCHO_CUBA) {
                        System.out.print("#");
                    }
                    else {
                        if (y < litrosRandom + 1) {
                            System.out.print("=");
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                }
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.printf("La cuba tiene una capacidad de %d litros y contiene %d litros de agua.", capacidad, litrosRandom);
    }
}