import libreria.Matematicas;

public class Ejercicio08 {
  public static void main (String[] args) {
    //VARIABLES:
    long n = 100;
    String nMorse;

    nMorse = Matematicas.convierteEnMorse(n);

    System.out.printf("El %d es el %s en morse.", n, nMorse);
  }
}
