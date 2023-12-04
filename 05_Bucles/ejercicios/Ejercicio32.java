import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio32 {
  public static void main(String[] args) {
    //VARIABLES:
    int alturaVertical;
    boolean fin = false;
    int contador;

    Scanner sc = new Scanner(System.in);

    try {
    System.out.print("Introduzca la altura de la X: ");
    alturaVertical = sc.nextInt();

    fin = (alturaVertical >= 3) && (alturaVertical%2!=0);

    if (fin == false) {
    }


    } catch (InputMismatchException e) {
      System.out.println("Se le pidio introducir un valor entero.");
    }
    sc.close();
  }
}