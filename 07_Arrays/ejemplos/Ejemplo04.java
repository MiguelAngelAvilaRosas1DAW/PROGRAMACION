package ejemplos;

public class Ejemplo04 {
    public static void main (String [] args) {
        
        int [][] numeros = { {1,2},{3,4},{5,6},{7,8},{9,10} };

        //Con (array):length se especifica la longitud que tiene el array, se suele usar para los bucles.

        /*Con esto ira cogiendo uno a uno cada valor dentro del array*/
        for (int[] fila : numeros) {
            for (int numero: fila) {
                System.out.print(numero + " ");
            }
        }
    }
}
