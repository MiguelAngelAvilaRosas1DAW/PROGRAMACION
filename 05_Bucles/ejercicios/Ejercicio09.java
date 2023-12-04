import java.util.Scanner;

public class Ejercicio09 {
    
    public static void main(String[] args) {
        

        int primero = 0 ;
        int segundo = 1 ;
        int temporal ;
                
        int numero ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("\033[1mN PRIMEROS NÚMEROS DE LA SERIE DE FIBONACCI\033[0m") ;
        System.out.print("Introduzca un número: ") ;
        numero = sc.nextInt() ;

        for( ; numero >= 1 ; numero--) {

            System.out.printf(" %d ", primero) ;

            temporal = primero ;    // hacemos copia de seguridad de primero
            primero = segundo ;
            segundo += temporal ;

        }

        System.out.println("");

        //System.out.println("primero = " + primero + " - segundo = " + segundo + "\n");
        sc.close();
    }

}
