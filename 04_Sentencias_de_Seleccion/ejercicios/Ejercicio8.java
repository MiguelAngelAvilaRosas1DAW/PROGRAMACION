import java.util.Scanner;
import java.lang.Math;

public class Ejercicio8 {
  public static void main (String[] args) {
    //VARIABLES:
    int a;
    int b;
    int c;
    double divisor;
    double ac;
    double x1;
    double x2;

    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa resuelve ecuaciones de segundo grado.");
    System.out.println("ax2 + bx + c = 0");
    System.out.println("Introduce los valores:");
    System.out.print("a = ");
    a = sc.nextInt();
    System.out.print("b = ");
    b = sc.nextInt();
    System.out.print("c = ");
    c = sc.nextInt();
    ac = Math.sqrt (b*b - (4*a*c));
    divisor = 2*a;
    
    if (ac == 0) {
      System.out.println("La ecuación no tiene soluciones reales.");
    }
    else if (divisor == 0) {
      System.out.println("La ecuación no tiene solución.");
    }
    else if ((a == 0) && (b == 0) && (c == 0)) {
      System.out.println("La ecuación tiene infinitas soluciones.");
    }
    else {
      x1 = (-(b) + ac) / divisor;
      x2 = (-(b) - ac) / divisor;
      System.out.printf("x1 = %.1f\n", x1);
      System.out.printf("x2 = %.1f\n", x2);
    }
    sc.close();
  }
}
