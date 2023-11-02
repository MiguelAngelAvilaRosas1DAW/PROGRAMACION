import java.util.Scanner;
public class Ejercicio12 {
  public static void main (String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Introduzca la nota del primer examen:");
    double nota1 = s.nextFloat();
    System.out.println("¿Que quieres sacar en el trimestre?");
    double notadeseada = s.nextFloat();
    double nota2 = (notadeseada - 0.4 * nota1) / 0.6;
    System.out.printf("Para tener un %.2f en el trimestre necesita sacar un %.2f en el segundo trimestre.\n", notadeseada, nota2);
    s.close();
  }
}