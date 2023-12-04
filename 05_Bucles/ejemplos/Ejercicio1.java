import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
    //VARIABLES:
    int numero;
    int contador;
    int suma;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un número negativo.");
    numero = 0;
    contador = 0;
    suma = 0;

    while (numero >= 0) {
      System.out.print("? ");
      numero = sc.nextInt();
      if (contador >= 0) {
        contador++;
        suma = suma + numero;
      }
    }

    System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d.", contador, suma);
    sc.close();
  }
}