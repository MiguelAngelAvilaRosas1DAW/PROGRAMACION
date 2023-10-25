import java.util.Scanner;
public class Ejercicio7 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Introduzca la base imponible (precio del articulo sin IVA): ");
    float base_imponible = s.nextFloat();

    double IVA = (base_imponible * 0.21);
    double total = base_imponible + IVA;

    System.out.printf("Una base imponible de %.2f € mas un IVA de %.2f € da un total de %.2f €", base_imponible, IVA, total);
    s.close();
  }
}