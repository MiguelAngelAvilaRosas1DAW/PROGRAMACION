import java.util.Scanner;
public class Ejemplo2 {
  public static void main (String[] args) {
    //Variables:
    final String PALABRA_SECRETA = "galapago";
    String palabra;

    Scanner sc = new Scanner(System.in);
    System.out.print("Adivina la palabra: ");
    palabra = System.console().readLine();
    
    if (palabra.equals(PALABRA_SECRETA)) {
      System.out.print("¡Has adivinado la palabra secreta!");  
    } 
    else {
      System.out.print("Oh... lo siento.");
    }
    sc.close();
  }
}