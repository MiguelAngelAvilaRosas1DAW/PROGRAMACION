public class Ejercicio02 {
  public static void main(String[] args) {
    //VARIABLES:
    int numero = 0;
    while (numero <= 100) {
      if (numero % 5 == 0) {
        System.out.printf(" %d ", numero);
      }
      numero++;
    }
  }
}