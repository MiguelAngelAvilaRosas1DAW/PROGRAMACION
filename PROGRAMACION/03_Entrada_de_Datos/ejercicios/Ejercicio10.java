import java.util.Scanner;
public class Ejercicio10 {
  public static void main (String[] args) {
    Scanner sc = new Scanner (System.in);
    System.out.println("Introduzca el numero de Mb:");
    float Mb = sc.nextFloat();
    float Kb = Mb * 1024;
    System.out.println (Mb + "Mb son " + Kb + "Kb");
    sc.close();
  }
}
