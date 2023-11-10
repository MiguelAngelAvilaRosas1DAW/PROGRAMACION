import java.util.Scanner;
public class Ejercicio19 {
  public static void main (String[] args) {
    //VARIABLES:
    float nota1;
    float nota2;
    double media;
    String recuperacion;

    Scanner sc = new Scanner (System.in);
    System.out.print("Nota del primer examen: ");
    nota1 = sc.nextFloat();
    System.out.print("Nota del segundo examen: ");
    nota2 = sc.nextFloat();
    
    media = (nota1 + nota2) / 2;
    if (media >= 5) {
      System.out.printf("Tu nota en programación es %.1f\n", media);
    }
    else {
      System.out.print("¿Cual a sido el resultado de la operación? (apto/no apto): ");
      recuperacion = sc.next();
      if (recuperacion.equals("apto")) {
        System.out.println("Tu nota en programación es 5");
      }
      else {
        System.out.printf("Tu nota en programación es %.1f\n", media);
      }
    }
    sc.close();
  }
}