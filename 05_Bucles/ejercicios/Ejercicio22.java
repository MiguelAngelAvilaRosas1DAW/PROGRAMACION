import java.util.Scanner;
import biblioteca.Varias; 

public class Ejercicio22 {

    public static void main(String[] args) {
        
        int numero ;       
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduce un número entero: ");
        numero = sc.nextInt() ;

        System.out.printf("Si le damos la vuelta al %d tenemos el %d\n",numero, Varias.invertir(numero)) ; 
        sc.close();       
    }
    
}
