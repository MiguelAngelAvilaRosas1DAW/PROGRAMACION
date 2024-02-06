package ejercicios;

public class Ejercicio17 {
    public static void main (String[] args) {
        //VARIABLES:
        final int NUMCUARTOS = 6;
        
        int random;
        int x;
        
        for (x = 0; x < NUMCUARTOS; x++) {
            random = ((int) (Math.random() * 6) + 1);
            
            switch (random) {
                case 1: 
                System.out.print("rojo"); break;
                case 2: 
                System.out.print("azul"); break;
                case 3: 
                System.out.print("amarillo"); break;
                case 4: 
                System.out.print("verde"); break;
                case 5: 
                System.out.print("naranja"); break;
                case 6: 
                System.out.print("violeta"); break;
            }
            if (x != NUMCUARTOS - 1) {
                System.out.print(", ");
            }
            
        }
    }
}
