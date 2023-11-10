import java.util.Scanner;
public class Ejemplo1 {
  public static void main (String[] args) {
    //Variables:
    Float nota;
    Scanner sc = new Scanner(System.in);
    System.out.println("¿Que nota as sacado en el último examen? ");

    nota = sc.nextFloat();
    
    if ((nota >= 0) && (nota <= 10)) {
      
      if ((nota >= 5) && (nota != 10)) {
        System.out.println("\033[32m¡Enhorabuena! ¡has aprobado!\033[0m");
      }
      else if (nota == 10) {
        System.out.println("\033[33m¡WOW! ¡Muy buen trabajo!\033[0m");
      }
      else if (nota == 0) {
        System.out.println("\033[31mVaya... lo siento mucho.\033[0m");
      }
      else {
        System.out.println("\033[31mLo siento :( Has suspendido.\033[0m");
      }

    }
    else {
      System.out.println("Esa nota no existe.");
    }
    sc.close();
  }
}