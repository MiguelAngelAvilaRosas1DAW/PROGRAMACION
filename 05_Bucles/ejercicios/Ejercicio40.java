package tema5;

/**
 * Escribe un programa que permita partir un número introducido por teclado en 
 * dos partes. Las posiciones se cuentan de izquierda a derecha empezando por el 
 * 1. Suponemos que el usuario introduce correctamente los datos, es decir, el 
 * número introducido tiene dos dígitos como mínimo y la posición en la que se 
 * parte el número está entre 2 y la longitud del número. No se permite en este 
 * ejercicio el uso de funciones de manejo de String (por ej. para extraer sub-
 * cadenas dentro de una cadena).
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 * 
 */

import java.util.Scanner;

public class Ejercicio40 {
    
    public static void main(String[] args) {
        
        long num1 = 0 ;
        long num2 = 0 ;
        long numero ;
        int posicion ;
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduce un número entero positivo: ");
        numero = sc.nextInt() ;

        System.out.print("Introduce la posición a partir de la cual quiere partir el número: ");
        posicion = sc.nextInt() ;

        // invertimos el número
        numero = invertir(numero) ;

        // obtenemos los números a partir de la información anterior
        for( ; posicion>1; posicion--) {
            num1 = (num1*10) + (numero%10) ;
            numero = numero / 10 ;
        }

        for( ; numero > 0; numero/=10) {
            num2 = (num2*10) + (numero%10) ;
        }


        // mostramos el resultado
        System.out.printf("Los números partidos son el %d y el %d\n", num1, num2);

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
