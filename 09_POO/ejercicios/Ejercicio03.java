package ejercicios;

public class Ejercicio03 {

        public static void main (String [] args) {
        //VARIABLES:
        int num;
        String cartaNom = " ";
        String tipoCarta = " ";

        num = ( (int) (Math.random() * 4) + 1);

        switch (num) {

            case 1: {
                tipoCarta = "copas";
            } break;

            case 2: {
                tipoCarta = "espadas";
            } break;

            case 3: {
                tipoCarta = "bastos";
            } break;

            case 4: {
                tipoCarta = "oro";
            } break;

        }

        num = ( (int) (Math.random() * 10) + 1);

        switch (num) {

            case 1: {
                cartaNom = "As";
            } break;

            case 8: {
                cartaNom = "Sota";
            }

            case 9: {
                cartaNom = "Caballo";
            } break;

            case 10: {
                cartaNom = "Rey";
            } break;

        }

        if (num > 10 || num == 1) {
            System.out.print(cartaNom);    
        }

        else {
            System.out.print(num);
        }

        System.out.printf(" de %s", tipoCarta);
    }
}
