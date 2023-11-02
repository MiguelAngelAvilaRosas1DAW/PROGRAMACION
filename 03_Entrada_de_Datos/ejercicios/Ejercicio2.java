import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Indique el numero de euros que quiere pasar a pesetas:");
    double euros = s.nextDouble();

    int pesetas = (int) (euros * 166.386);

    System.out.printf("%.2f € son %d pesetas", euros,pesetas);
    s.close();
  }
}