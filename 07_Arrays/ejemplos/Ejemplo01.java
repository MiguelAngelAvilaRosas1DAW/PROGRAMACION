package ejemplos;

public class Ejemplo01 {
    public static void main(String[] args) {
        //VARIABLES:
        int[] numeros ;
        numeros = new int[4];

        //Las celdas son 4, contandose como: 0, 1, 2 y 3.
        numeros[0] = 26;

        //Sep puede inicializar de forma inmediata:
        int[] numeros2 = {1, 2, 3, 4};

        //Insertamos los valores:
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        
        //Mostramos los resultados:
        System.out.println("Los valores del array son los siguientes: ");
        System.out.printf("%d, %d, %d y %d", numeros[0], numeros[1], numeros[2], numeros[3]);

        //numeros nos devuelve la dirección de memoria donde se guardan los valores:
        System.out.println(numeros);
    }
}
