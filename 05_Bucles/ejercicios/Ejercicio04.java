import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio04 {
    
    public static void main(String[] args) {

        final int NUMERO_INTENTOS = 4 ;
        final int CLAVE_CORRECTA = 8888 ;
        
        int clave = 0;
        int intentos = 0 ;
        Scanner sc = new Scanner(System.in) ;

        do {
            try {
                System.out.print("Introduce la clave de la caja fuete: ");
                clave = sc.nextInt() ;

                if (clave!=CLAVE_CORRECTA) {
                    System.out.println("Clave incorrecta.") ;
                } else {
                    System.out.println("\033[33mSe ha abierto la caja fuete\033[0m") ;
                }

                intentos++ ;

            } catch(InputMismatchException ime) {

                System.out.println("Se ha producido un error mu gordo en la entrada de datos.");
            }

        } while ((clave != CLAVE_CORRECTA) && (intentos!=NUMERO_INTENTOS)) ;
        sc.close();
    }

}
