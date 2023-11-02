public class Colores {
    public static void main (String[] args) {
        System.out.print("\033[33m mandarina");
        System.out.print("\033[32m hierba");
        System.out.print("\033[31m tomate");
        System.out.print("\033[37m sábanas");
        System.out.print("\033[36m cielo");
        System.out.print("\033[35m nazareno");
        System.out.print("\033[34m mar");

        System.out.println("\033[0m"); //Reseteo el color para que el texto no se siga pintando de ese color.

        System.out.print("\033[1;43m mandarina");
        System.out.print("\033[1;42m hierba");
        System.out.print("\033[1;41m tomate");
        System.out.print("\033[1;47m sábanas");
        System.out.print("\033[1;46m cielo");
        System.out.print("\033[1;45m nazareno");
        System.out.print("\033[1;44m mar");
    }
}