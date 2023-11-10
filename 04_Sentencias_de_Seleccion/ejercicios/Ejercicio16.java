import java.util.Scanner;
public class Ejercicio16 {
  public static void main (String[] args) {
    //VARIABLES:
    String numero;
    char primerNum;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduce un numero entero (de 5 cifras como maximo): ");
    numero = sc.next();
    primerNum = numero.charAt(0);
    System.out.printf("El primer dígito del numero introducido es el %c", primerNum);
    sc.close();
  }
}