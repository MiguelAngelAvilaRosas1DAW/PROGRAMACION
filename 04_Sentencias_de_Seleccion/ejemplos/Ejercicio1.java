import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    //VARIABLES:
    int edad;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduce tu edad: ");
    edad = sc.nextInt();

    if (edad < 18) {
      System.out.println("Eres menor de edad.");
    }
    else if (edad >= 65) {
      System.out.println("Estas jubilado.");
    }
    else {
      System.out.println("Eres mayor de edad.");
    }
    sc.close();
  }
}