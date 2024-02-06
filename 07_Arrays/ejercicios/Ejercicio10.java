package ejercicios;

public class Ejercicio10 {
    public static void main(String[] args) {
        String[] nomReyes;
        int numReyes;

        System.out.print("Introduzca el número total de nombres de reyes: ");
        numReyes = Integer.parseInt(System.console().readLine());
        nomReyes = new String [numReyes];
        inicializarArray(nomReyes, numReyes);
        mostrarReyes(nomReyes, numReyes);

    }
    
    public static void inicializarArray(String[] nomReyes, int numReyes) {
        int num;
        
        System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO.");
        for (num = 0 ; num < numReyes ; num++) {
            nomReyes [num] = System.console().readLine();
        }
    }

    public static void mostrarReyes(String[] nomReyes, int numReyes) {
        //VARIABLES:
        int[] numRey;
        numRey = new int [numReyes];

        for (String nomRey : nomReyes) {
            System.out.printf("%s\n", nomRey);

        }
    }
}