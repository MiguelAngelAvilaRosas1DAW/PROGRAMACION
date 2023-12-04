import java.util.Scanner;

public class Ejercicio11 {
    

    public static void main(String[] args) {
    
        int base;
        int exponente;
        int resultado;        
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Cálculo de una potencia: ");
        
        System.out.print("Introduzca la base: ");
        base = sc.nextInt();
        System.out.print("Introduzca el exponente: ");
        exponente = sc.nextInt();

        System.out.printf("%d^%d = ", base, exponente);
        

        resultado = potencia(base, exponente) ;

        //temporal = exponente ;
        //exponente = Math.abs(exponente) ;

        // cálculo de la potencia cuando el exponente es positivo
        /* while (exponente > 0) {
            potencia = potencia * base;
            exponente--;
        } */

       /*  while (exponente < 0) {
            potencia = potencia / base;
            exponente++;
        } */

        System.out.println((exponente>0)?resultado:(1.0f/resultado)); 
        //System.out.println((temporal > 0)?potencia:(1.0f/potencia));
        sc.close();
    }

    /**
     * Calcula la potencia de un número.
     * @param int base
     * @param int exponente
     * @return int
     */
    public static int potencia(int b, int e) {

        int pot =  1 ;

        e = Math.abs(e) ;

         while (e > 0) {
            pot = pot * b;
            e--;
        }

        return pot ;
    }



    /**
     * La función determina si un número es par o impar.
     * @param int numero
     * @return boolean
     */
    public static boolean esPar(int numero) {
        
        return (numero%2==0) ;
        
    }
}
