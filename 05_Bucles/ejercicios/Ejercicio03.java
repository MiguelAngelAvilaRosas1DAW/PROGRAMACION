public class Ejercicio03 {
  public static void main(String[] args) {
    //VARIABLES:
    int numero = 0;
    do {
      if (numero % 5 == 0) {
        System.out.printf(" %d ", numero);
      }
      numero++;
    } while (numero <= 100);
    
  }
}