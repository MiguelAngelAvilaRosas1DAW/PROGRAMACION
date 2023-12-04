package tema5;

import java.util.Scanner;

/**
 * Escribe un programa que diga si un número introducido por teclado es o no capicúa. 
 * Los números capicúa se leen igual hacia delante y hacia atrás. El programa debe 
 * aceptar números de cualquier longitud siempre que lo permita el tipo, en caso con-
 * trario el ejercicio no se dará por bueno. Se recomienda usar long en lugar de int 
 * ya que el primero admite números más largos.
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */

public class Ejercicio33 {

    public static void main(String[] args) {
        
        long numero ; 
        long temporal ;       
        long inverso = 0 ;
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduce un número entero positivo: ") ;
        numero = sc.nextLong() ;

        temporal = numero ;

        // Invertimos el número
        for (; temporal>0; temporal/=10)  {
            inverso = (inverso *  10) + (temporal%10) ;
        }

        // Comprobamos si es capicúa
        if (numero==inverso)  {
            System.out.printf("El %d es capicúa.\n", numero);            
        } else {
            System.out.printf("El %d no es capicúa.\n", numero);            
        }

        


    }
    
}
