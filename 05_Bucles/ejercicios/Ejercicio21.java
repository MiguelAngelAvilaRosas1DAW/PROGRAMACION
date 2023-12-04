import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        
        int altura ;
        int fila ;
        int columna ;
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduce la altura de la pirámide: ");
        altura = sc.nextInt() ;

        for(fila=1; fila<=altura; fila++) {

            // Escribir espacios
            for(columna=1; columna <= (altura-fila); columna++) {
                System.out.print(" ");
            }

            // Escribir secuencia numérica creciente
            for(columna=1; columna <= fila; columna++) {
                System.out.print(columna);
            }

            // Escribir secuencia numérica decreciente
            for(columna=fila-1; columna >= 1; columna--) {
                System.out.print(columna);
            }

            // Escribimos un salto de línea
            System.out.println("");
        }


    }
    
}
