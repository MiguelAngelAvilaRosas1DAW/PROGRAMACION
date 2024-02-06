package ejercicios;

public class Ejercicio30 {
    public static void main (String[] args) {
        //VARIABLES:
        final char BORDE = '|';
        final char PLANTA = '*';
        final char PIEDRA = 'O';
        
        String linea;
        int longitud;
        int espacios = 6;
        int caracteresCamino;
        int numRandom;
        boolean obstaculo = false;
        boolean obstaculoRandom;
        char tipoObstaculo = PLANTA;
        int x;
        int y;

        System.out.print("Introduzca la longitud del sendero en metros: ");
        linea = System.console().readLine();
        longitud = Integer.parseInt(linea);

        //Logitud del camino:
        for (x = 0 ; x < longitud ; x++) {
            numRandom = numRandom(1, 3);

            switch (numRandom) {
                case 1: espacios -= 1; break ;
                case 3: espacios += 1; break ;
            }

            //Espacios iniciales:
            for (y = 0; y < espacios ; y++) {
                System.out.print(" ");
            }

            //Pintamos el camino:
                System.out.print(BORDE);
                
                    obstaculo = random(1, 2);
                        
                        obstaculoRandom = random(1, 2);
                        if (obstaculoRandom == true) {tipoObstaculo = PIEDRA;}
                        else {tipoObstaculo = PLANTA;}

                        numRandom = numRandom(1, 5);
                        switch (numRandom) {

                        case 1:
                            System.out.print(tipoObstaculo);
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print(" ");
                        ; break;
                            
                        case 2: 
                            System.out.print(" ");
                            System.out.print(tipoObstaculo);
                            System.out.print(" ");
                            System.out.print(" ");
                        ; break;

                        case 3:
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print(tipoObstaculo);
                            System.out.print(" ");
                        ; break;
                            
                        case 4: 
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print(tipoObstaculo);
                        ; break;

                        case 5: 
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print(" ");
                            System.out.print(" ");
                        ; break;
                    }
                System.out.print(BORDE);
                System.out.println("");
        }

    }

    public static boolean random(int num1, int num2) {
        int numRandom;
        
        numRandom = ((int) (Math.random() * num2) + num1);
        return numRandom == 1;
    }

    public static int numRandom(int num1, int num2) {
        int numRandom;
        
        numRandom = ((int) (Math.random() * num2) + num1);
        return numRandom;
    }
}