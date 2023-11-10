import java.util.Scanner;
public class Ejercicio15 {
  public static void main (String[] args) {
    //VARIABLES:
    String numero;
    char ultimoNum;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduce un numero entero: ");
    numero = sc.next();
    ultimoNum = numero.charAt(3);
    System.out.printf("El ultimo dígito del numero introducido es el %c", ultimoNum);
    sc.close();
  }
}