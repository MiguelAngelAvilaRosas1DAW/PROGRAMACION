import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio30 {
  public static void main(String[] args) {
    //VARIABLES:
    int alturaVertical;
    int contador;

    Scanner sc = new Scanner(System.in);

    try {
    System.out.print("Introduzca la altura de la U: ");
    alturaVertical = sc.nextInt();

    //Dibujar U vertical:
    for (contador = 1 ; contador < alturaVertical; contador++) {
      System.out.println("*     *");
    }

      System.out.print(" * * * ");

    } catch (InputMismatchException e) {
      System.out.println("Se le pidio introducir un valor entero.");
    }
    sc.close();
  }
}