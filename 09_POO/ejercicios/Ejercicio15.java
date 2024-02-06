package ejercicios;

/**
 * SIMULADOR DE MAQUINA TRAGAPERRAS
 */
public class Ejercicio15 {
    public static void main (String[] args) {
        //VARIABLES:
        String fig1;
        String fig2;
        String fig3;
        int num = 0;

        fig1 = simbolo( (int) (Math.random() * 5) + 1);
        fig2 = simbolo( (int) (Math.random() * 5) + 1);
        fig3 = simbolo( (int) (Math.random() * 5) + 1);

        System.out.println(fig1);
        System.out.println(fig2);
        System.out.println(fig3);

        if (((fig1.equals(fig2)) || (fig1.equals(fig3)))) {
            num += 1;
        }
        if (((fig2.equals(fig3)) || (fig2.equals(fig1)))) {
            num += 1;
        }
        if (((fig3.equals(fig1)) || (fig3.equals(fig2)))) {
            num += 1;
        }

        if (num == 3) {
            System.out.println("Enhorabuena, aqui tienes tu recompensa.");
        }
        else if (num == 1 || num == 2) {
            System.out.println("Bien, ha recuperado su moneda.");
        }
        else {
            System.out.println("Lo siento, perdiste.");
        }
    }

    /**
     * Indica el simbolo salido en cada figura.
     */
    public static String simbolo (int num) {
        //VARIABLE:
        String simbolo = "";

        switch (num) {
            case 1:{
                simbolo = "corazón";
            } break;

            case 2:{
                simbolo = "diamante";
            } break;

            case 3:{
                simbolo = "herradura";
            } break;

            case 4:{
                simbolo = "campana";
            } break;

            case 5:{
                simbolo = "limón";
            }
        }

        return simbolo;
    }
}
