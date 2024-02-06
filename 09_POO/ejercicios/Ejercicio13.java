package ejercicios;

public class Ejercicio13 {
    
    public static final int MAXIMO = 100;

    public static void main(String[] args) {
        //VARIABLES:
        int numero;
        int opcion;
        int minimo = 0;
        int maximo = 100;
        int intentos = 5;
        boolean exacto = false;

        System.out.println("Piensa en un número del 0 al 100. Intentare adivinarlo en 5 intentos.");
        System.out.println("Pulsa la tecla intro cuando estes preparado.");
        System.console().readLine();

        while (intentos > 0 && exacto == false) {

            numero = ((int) (Math.random() * maximo) + minimo);

            System.out.printf("¿Es el %d?\n", numero);

            System.out.println("El numero que estas pensando es: 1) mayor 2) menor 3) igual");
            opcion = Integer.parseInt(System.console().readLine());

            switch (opcion) {
                case 1:
                System.out.println("has elegido MAYOR");
                minimo = numero + 1;
                maximo -= minimo;
                break;

                case 2:
                System.out.println("has elegido MENOR");
                maximo = numero - 1;
                break;

                case 3:
                System.out.println("has elegido IGUAL");
                System.out.println("¡Bien, hacerte!");
                exacto = true;
                break;
            }
            intentos--;

        }
    }
}
