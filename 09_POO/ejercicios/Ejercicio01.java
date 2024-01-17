package ejercicios;

public class Ejercicio01 {
    
    public static void main (String[] args) {
        //VARIABLES:
        int dado1 = 0;
        int dado2 = 0;
        int dado3 = 0;
        int i;

        System.out.println("Tiras los dados...");

        //Sacamos el resultado de los dados:
        dado1 = tirarDados();
        dado2 = tirarDados();
        dado3 = tirarDados();    

        System.out.printf("¡El primer dado es un %d!\n", dado1);
        System.out.printf("¡El segundo dado es un %d!\n", dado2);
        System.out.printf("¡El tercer dado es un %d!\n", dado3);


        System.out.printf("La suma de los dados da %d\n", dado1 + dado2 + dado3);

    }

    /**
     * Devuelve un número entero entre 1 y 6.
     * @return
     */
    public static int tirarDados () {
        int dado;

        dado = ( (int) (Math.random() * 6) + 1);
        return dado;
    }
}