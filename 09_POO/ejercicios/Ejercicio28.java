package ejercicios;

import java.util.Scanner;

public class Ejercicio28 {
    public static void main(String[] args) {
        //VARIABLES:
        final char BLOQUE = '*';
        final char PEZ = '&';
        final char CABALLITO = '$';
        final char CARACOLA = '@';

        int anchura;
        int altura;
        int pezAltura;
        int pezAnchura;
        boolean pezSi = false;
        int x;
        int y;
    
        Scanner sc = new Scanner (System.in);

        System.out.print("Por favor, introduzca la altura de la pecera (como mínimo 4): ");
        altura = sc.nextInt();

        //Definimos la altura aleatoria que tendra el pez:
        pezAltura = ((int) (Math.random() * (altura - 2)) + 2);

        System.out.print("Ahora introduzca la anchura (como mínimo 4): ");
        anchura = sc.nextInt();

        //Definimos la anchura aleatoria que tendra el pez:
        pezAnchura = ((int) (Math.random() * (anchura - 2)) + 2);

        for (x = 1 ; x <= altura; x++) {
            if (x == pezAltura) {
                pezSi = true;
            }
            for (y = 1 ; y <= anchura ; y++) {
                if (x == 1 || x == altura) {
                    System.out.print(BLOQUE);
                }
                else {
                    if (y == 1 || y == anchura) {
                        System.out.print(BLOQUE);
                    }
                    else if (pezSi == true) {
                        if (y == pezAnchura) {
                            System.out.print(PEZ);
                            pezSi = false;
                        }
                        else {
                            System.out.print(" ");
                        }
                    }
                    else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println("");
        }

    }
}
