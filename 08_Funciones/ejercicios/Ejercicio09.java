import java.util.Scanner;
import libreria.Matematicas;

public class Ejercicio09 {
  public static void main(String[] args) {
    //VARIABLE:
    long num;
    String numPalabras;

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número: ");
    num = sc.nextLong();
    numPalabras = Matematicas.convierteEnPalabras(num);
    System.out.println(numPalabras);
    sc.close();
  }
}