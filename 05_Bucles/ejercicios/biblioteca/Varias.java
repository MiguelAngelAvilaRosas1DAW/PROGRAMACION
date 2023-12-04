package biblioteca;

public class Varias {

    /**
      * Comprueba si el número dado es o no primo.
      * @param int numero
      * @return boolean
      */
      public static boolean esPrimo(int numero) {

        int i = 2 ;

        // Hago el bucle mientras I < NUMERO y la división entre I NO ES exacta
        while ((i < numero) && (numero%i!=0)) {            
            i++ ;
        }

        // Si NUMERO es primo lo muestro en pantalla
        return (i >= numero) ;
     }


     /**
      * Invierte el número dado
      * @param long numero
      * @return long
      */
     public static long invertir(long numero) {

        long invertido = 0 ;

        for( ; numero > 0; numero/=10) {            
            invertido = (invertido*10) + (numero%10) ;
        }

        return invertido ;

     }

    
}
