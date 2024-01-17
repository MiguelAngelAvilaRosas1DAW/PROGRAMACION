package ejercicios;

public class Ejercicio02 {
    public static void main (String [] args) {
        //VARIABLES:
        int num;
        char cartaNom = 'A';
        String palo = " ";

        num = ( (int) (Math.random() * 4) + 1);

        switch (num) {

            case 1: {
                palo = "picas";
            } break;

            case 2: {
                palo = "corazones";
            } break;

            case 3: {
                palo = "diamantes";
            } break;

            case 4: {
                palo = "tréboles";
            }

        }

        num = ( (int) (Math.random() * 13) + 1);

        switch (num) {

            case 1: {
                cartaNom = 'J';
            } break;

            case 11: {
                cartaNom = 'Q';
            }

            case 12: {
                cartaNom = 'K';
            } break;

            case 13: {
                cartaNom = 'A';
            }

        }

        if (num > 10 || num == 1) {
            System.out.print(cartaNom);    
        }

        else {
            System.out.print(num);
        }

        System.out.printf(" de %s", palo);
    }

}