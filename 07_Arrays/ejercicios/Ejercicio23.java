package ejercicios;

public class Ejercicio23 {
    public static void main (String[] args) {
        //VARIABLES:
        int[][] tabla = {
                         {0,30,2,0,0,7},
                         {75,0,0,0,0,0},
                         {0,0,-2,9,0,11}
                        };

        mostrarTabla(tabla);
    }

    public static void mostrarTabla(int[][] tabla) {
        int num;
        int num2;

        System.out.print("         ");
        for(num = 0 ; num < 6 ; num++) {
            System.out.printf("Columna %d ", num);
        }
        System.out.println("");
        for (num = 0 ; num < 3 ; num++){
            System.out.printf("Fila %-6d ", num);
            for(num2 = 0 ; num2 < 6 ; num2++) {
                System.out.printf("%-9d ", tabla[num][num2]);
            }
            System.out.println("");
        }
    }
}
