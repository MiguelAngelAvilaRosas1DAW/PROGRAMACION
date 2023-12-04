import java.util.Scanner;

public class Ejercicio06 {

    public static void main(String[] args) {
        

        int numero ;
        int temporal ;
        int contador = 1 ;
        Scanner sc = new Scanner(System.in) ;

        System.out.println("NÚMERO DE DÍGITOS DE UN NÚMENOR");
        System.out.print("Introduca un número entero: ");
        numero = sc.nextInt() ;

        temporal = Math.abs(numero) ;

        while(temporal >= 10) {

            temporal /= 10 ;  // en honor a Pablo.
            contador++ ;

        }

        System.out.printf("%d tiene %d digitos", numero, contador);
        sc.close();
    }
    
}
