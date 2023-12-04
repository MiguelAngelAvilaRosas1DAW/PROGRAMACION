import java.util.Scanner;
public class Ejercicio3 {
  public static void main (String[] args) {
    //VARIABLES:
    int edad;
    int contador;
    Scanner sc = new Scanner (System.in);

    System.out.print("Introduce tu edad: ");
    edad = sc.nextInt();

    for (contador = 1 ; contador <= edad ; contador++) {
      System.out.printf("%d ", contador);
    }
    sc.close();
  }
}
