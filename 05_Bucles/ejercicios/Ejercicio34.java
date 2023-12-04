/**
 * Realiza un conversor del sistema decimal al sistema de “palotes”. En este sistema, cada 
 * dígito se representa por su correspondiente número de palotes. Por ejemplo el 1 se re-
 * presenta con un palote (|), el 2 con dos palotes (||) y así sucesivamente. El cero es 
 * la ausencia de palotes. Cada dígito se separa del siguiente con un guión (-).
 * @author Antonio J. Sánchez
 * @author José David Quero
 */

import java.util.Scanner;

public class Ejercicio34 {
    
    public static void main(String[] args) {
        
        long numero ;  
        int resto ;     
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduce un número entero positivo: ") ;
        numero = sc.nextInt() ;

        System.out.printf("El %d en decimal es el ", numero) ;

        // invertimos el número
        numero = invertir(numero) ;

        // transformamos al sistema de palotes
        while(numero>0) {

            // me quedo con el resto de la división
            resto = (int) numero%10 ;

            for ( ; resto > 0; resto--) {
                System.out.print("|");
            }

            numero/=10 ;

            if(numero > 0) { System.out.print("-"); }
        }

        System.out.println(" en el sistema de palotes.");
    }

    /**
     * Invierte un número dado
     * @param long numero
     * @return long
     */
    public static long invertir(long numero) {

        long inverso = 0 ;

        for( ; numero>0; numero/=10) {
            inverso = (inverso*10) + (numero%10) ;
        }

        return inverso ;

    }
}
