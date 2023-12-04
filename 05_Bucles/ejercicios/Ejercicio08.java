import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejercicio08 {
  public static void main (String [] args) {
    //VARIABLES:
    int num;
    int numCuadrado;
    int numCubo;
    int contador = 0;

    Scanner sc = new Scanner(System.in);

    try {
    System.out.print("Introduzca un número: ");
    num = sc.nextInt();

    System.out.printf("%-4s   |   %-4s  |   %s\n", "n", "n2", "n3");
    System.out.println("--------------------------");

    while (contador < 5) {
      numCuadrado = num * num;
      numCubo = num * num * num;
      System.out.printf("%-4d   |   %-4d  |   %d\n", num, numCuadrado, numCubo);
      num++;
      contador++;

    }
    } catch (InputMismatchException e) {
      System.out.println("Se le pidio un numero entero.");
    }
    sc.close();
  }
}
