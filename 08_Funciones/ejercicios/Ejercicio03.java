import libreria.Matematicas;
public class Ejercicio03 {
  public static void main (String[] args) {
    //VARIABLES:
    int contador;

    for (contador = 1 ; contador <=9999 ; contador++) {
      if (Matematicas.esCapicua(contador)) {
        System.out.printf(" %d ", contador);
      }
    }
  }
}
