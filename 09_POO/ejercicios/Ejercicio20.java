package ejercicios;

public class Ejercicio20 {
    public static void main (String[] args) {
        //VARIABLES:
        final int MONEDAS = 5;

        int tipoMoneda;
        int caraMoneda;
        int x;

        for (x = 0 ; x < MONEDAS ; x++) {
            tipoMoneda = ((int) (Math.random() * 8) + 1);

            switch (tipoMoneda) {
                case 1: System.out.print("1 centimo"); break;
                case 2: System.out.print("2 centimos"); break;
                case 3: System.out.print("5 centimos"); break;
                case 4: System.out.print("10 centimos"); break;
                case 5: System.out.print("20 centimos"); break;
                case 6: System.out.print("50 centimos"); break;
                case 7: System.out.print("1 euro"); break;
                case 8: System.out.print("2 euros"); break;
            }
        }
    }
}
