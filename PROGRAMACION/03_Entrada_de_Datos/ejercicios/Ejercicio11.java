import java.util.Scanner;

public class Ejercicio11 {
  public static void main (String[] args) {
   Scanner s = new Scanner (System.in);
    System.out.println("Introduzca el numero de Kb:");
    float Kb = s.nextFloat();
    float Mb = Kb / 1024;
    System.out.println (Kb + "Kb son " + Mb + "Mb");
    s.close();
  }
}
