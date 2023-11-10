import java.util.Scanner;
public class Ejercicio18 {
  public static void main (String[] args) {
    //VARIABLES:
    String numero;
    int primerNum;
    int segundoNum;
    int penultimoNum;
    int ultimoNum;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduce un numero entero (de 5 cifras como maximo): ");
    numero = sc.next();
    if (numero.length() <= 3) {
      primerNum = numero.charAt(0);
      ultimoNum = numero.charAt(numero.length()-1);
      if (primerNum == ultimoNum) {
        System.out.println("El número introducido \033[1mes capicúa\033[0m.");
      }
      else {
      System.out.println("El número introducido \033[1mno es\033[0m capicúa.");
      }
    }
    else if ((numero.length() > 3) && (numero.length() <= 5)) {
      primerNum = numero.charAt(0);
      segundoNum = numero.charAt(1);
      penultimoNum = numero.charAt(numero.length()-2);
      ultimoNum = numero.charAt(numero.length()-1);
      if ((primerNum == ultimoNum) && (segundoNum == penultimoNum)) {
        System.out.println("El número introducido \033[1mes capicúa\033[0m.");
      }
      else {
      System.out.println("El número introducido \033[1mno es\033[0m capicúa.");
      }
    }

    sc.close();
  }
}