import java.util.Scanner;
public class Ejercicio5 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Area del rectángulo");
    System.out.println("-------------------");
    System.out.println("Introduzca la longitud de la base (cm):");
    float base = s.nextFloat();
    System.out.println("Introduzca la altura (cm):");
    float altura = s.nextFloat();
    float area = base * altura;
    System.out.printf("El area del rectangulo es %.2f cm\u00B2\n", area);
    s.close();
  }
}