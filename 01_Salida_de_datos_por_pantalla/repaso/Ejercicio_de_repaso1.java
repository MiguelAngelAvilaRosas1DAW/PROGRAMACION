public class Ejercicio_de_repaso1 {
  public static void main(String[] args) {
    System.out.printf("\033[32m%7d\n", 1);
    System.out.printf("\033[33m%-5d5\n", 2);
    System.out.printf("\033[34m%03d\n", 3);
    System.out.printf("\033[35m%+4d\033[0m\n", 4);
    System.out.print("\"Hola\' \u266A\n");
  }
}