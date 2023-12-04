import java.util.Scanner;

public class Ejercicio10 {
    
    public static void main(String[] args) {
        
        int positivos = 0 ;
        int negativos = 0 ;        
             
        int contador ;
        int numero ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Introduce 10 números enteros: ") ;
       
        try {
            for(contador=1; contador<=10; contador++) {
                numero = sc.nextInt() ;
                if      (numero > 0) { positivos++ ; }
                else if (numero < 0) { negativos++ ;}
            }

        } catch (Exception excepcion) {
            System.out.println("Se ha producido un error en la lectura de datos.");
            // falta una cosa para que termine el programa
        }


        System.out.printf("Has introducido %d positivos y %d negativos.\n", positivos, negativos);
        sc.close();
    }
}
