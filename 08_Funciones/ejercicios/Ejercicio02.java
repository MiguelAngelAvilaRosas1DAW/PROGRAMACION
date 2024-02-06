import libreria.Matematicas;
public class Ejercicio02 {
  public static void main (String [] args) {
    //VARIABLES:
    int contador;
    for (contador = 1 ; contador <= 1000; contador++) {
      if (Matematicas.esPrimo(contador) && (contador != 1)) {
        System.out.printf(" %d ", contador);
      }
    }
  }
}
