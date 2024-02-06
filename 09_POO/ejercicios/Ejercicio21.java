package ejercicios;

import java.util.Scanner;

public class Ejercicio21 {
    public static final char CUERPO = '#';
    public static final char CABEZA = '@';
    public static void main (String[] args) {
        //VARIABLE:
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
        int espacios;
        int x;
        int numEspacios = 12;
        int numRandom = 0;

        for (x = 0 ; x < longitud; x++) {
            
            numRandom = ( (int) (Math.random() * 3) + 1);

            switch (numRandom) {
                case 1:
                    numEspacios--;
                break;
    
                case 3:
                    numEspacios++;
                break;
            }
            for (espacios = 0 ; espacios < numEspacios; espacios++) {
                System.out.print(" ");
            }
            System.out.println(CUERPO);
        }
    }
}