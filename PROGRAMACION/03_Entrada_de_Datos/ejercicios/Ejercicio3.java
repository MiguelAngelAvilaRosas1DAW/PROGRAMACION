import java.util.Scanner;
public class Ejercicio3 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Indique el numero de pesetas que quiere pasar a euros:");
    int pesetas = s.nextInt();

    double euros = pesetas / 166.386;

    System.out.printf("%d pesetas son %.2f €", pesetas,euros);
    s.close();
  }
}