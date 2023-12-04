import java.util.Scanner;

public class Ejercicio16 {

    /**
     * Realiza un programa que pinte una pirámide por pantalla. La altura se debe 
     * pedir por teclado. El carácter con el que se pinta la pirámide también se 
     * debe pedir por teclado.
     */

     public static void main(String[] args) {

        int altura ;
        char caracter ;
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduce la altura de la pirámide: ");
        altura = sc.nextInt() ;

        sc.nextLine() ;

        System.out.print("Introduce el carácter de relleno: ");
        caracter = sc.nextLine().charAt(0) ;

        dibujarPiramide(altura, caracter);

        sc.close();        
     }

     /**
      * La función dibuja una pirámide de caracteres de la altura indicada.
      * @param alt
      * @param car
      */
     public static void dibujarPiramide(int alt, char car) {
       
        int fila ;
        int columna ;
        int incremento = 1 ;

        for(fila=1; fila <= alt; fila++) {

            // dibujamos los espacios
            for(columna=1; columna <= (alt-fila); columna++) {
                System.out.print(" ");
            }

            // pintamos las estrellitas
            for (columna=1; columna <= incremento; columna++) {
                System.out.print(car);
            }

            // aumentamos el número de estrellas por fila
            incremento = incremento + 2 ;

            // damos un salto de línea
            System.out.println("") ;
        }
     }
    
}
