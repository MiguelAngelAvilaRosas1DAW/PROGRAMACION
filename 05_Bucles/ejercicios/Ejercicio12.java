import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio12 {
  public static void main (String [] args) {
    //VARIABLES:

    int contador;
    int base;
    int exponente;
    int resultado;

    Scanner sc = new Scanner(System.in);

    try{
      System.out.println("Calculo de una potencia");
      System.out.print("Introduzca la base: ");
      base = sc.nextInt();
      resultado = base;
      System.out.print("Introduzca el exponente máximo: ");
      exponente = sc.nextInt();

      if (exponente >= 0) {
        if (exponente != 0) {
          for (contador=1; contador < exponente; contador++) {
            System.out.printf("%d^%d = %d\n", base, contador, resultado);
            resultado *= base;
          }
        }
        else {
          resultado = 1;
        }
        System.out.printf("%d^%d = %d", base, exponente, resultado);
      }
      else {
        System.out.println("Los dos numeros introducidos deben ser POSITIVOS o cero");
      }

    } catch (InputMismatchException e) {
      System.out.println("ERROR: Se pidio un número entero.");
    }

    sc.close();
  }
}