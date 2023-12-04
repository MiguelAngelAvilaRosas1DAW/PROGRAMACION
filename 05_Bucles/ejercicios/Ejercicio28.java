import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio28 {
  public static void main(String[] args) {
    //VARIABLES:
    int alturaHorizontal;
    int alturaVertical;
    int contador;

    Scanner sc = new Scanner(System.in);

    try {
    System.out.print("Introduzca la altura de la L: ");
    alturaVertical = sc.nextInt();
    alturaHorizontal = alturaVertical / 2;

    //Dibujar L vertical:
    for (contador = 1 ; contador < alturaVertical; contador++) {
      System.out.println("*");
    }

    //Dibujar L horizontal:
    for (contador = 0 ; contador <= alturaHorizontal; contador++) {
      System.out.print("* ");
    }

    } catch (InputMismatchException e) {
      System.out.println("Se le pidio introducir un valor entero.");
    }
    sc.close();
  }
}