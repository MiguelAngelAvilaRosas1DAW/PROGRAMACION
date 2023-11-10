import java.util.Scanner;
import java.lang.Math;

public class Ejercicio5 {
  public static void main(String[] args) {
    //VARIABLES:
    final double g = 9.81;
    float h;
    double segundos;

    Scanner sc = new Scanner(System.in);
    System.out.println("Calculo del tiempo de caída de un objeto.");
    System.out.print("Introduce la altura (en metros) desde la que cae el objeto: ");
    h = sc.nextFloat();
    segundos = Math.sqrt ((2*h) / g);
    System.out.printf("El objeto tarda %.2f segundos", segundos);
    sc.close();
  }
}