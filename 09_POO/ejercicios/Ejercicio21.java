package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static void main (String[] args) {
        //VARIABLE:
        final char CABEZA = '@';

        int longitudSerpiente;

        Scanner sc = new Scanner(System.in);

        //Pedimos los datos al usuario:
        System.out.print("Introduce la longitud de la serpiente: ");
        longitudSerpiente = sc.nextInt();

        //Dibujamos la cabeza de la serpiente:
        System.out.printf("            %c\n", CABEZA);

        cuerpoSerpiente(longitudSerpiente);
    }

    /**
     * Muestra el cuerpo de la serpiente de forma aleatoria.
     * @param longitud
     */
    public static void cuerpoSerpiente(int longitud) {
        //VARIABLES:
        final char CUERPO = '#';
        int espacios;
        int x;
        int numEspacios = 0;
        int numRandom = 0;

        for (x = 0 ; x < longitud; x++) {
            
            numRandom = ( (int) (Math.random() * 3) + 1);

            switch (numRandom) {
                case 0:
                    numEspacios = 11;
                break;
    
                case 1:
                    numEspacios = 12;
                break;
    
                case 2:
                    numEspacios = 13;
                break;
            }
            for (espacios = 0 ; espacios < numEspacios; espacios++) {
                System.out.print(" ");
            }
            System.out.println(CUERPO);
        }
    }
}