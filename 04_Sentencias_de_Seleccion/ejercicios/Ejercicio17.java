import java.util.Scanner;
public class Ejercicio17 {
  public static void main (String[] args) {
    //VARIABLES:
    String numero;
    int numcifras;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduce un numero entero (de 5 cifras como maximo): ");
    numero = sc.next();
    numcifras = numero.length();
    System.out.printf("El numero introducido tiene %d digitos", numcifras);

    sc.close();
  }
}