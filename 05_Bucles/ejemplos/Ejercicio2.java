import java.util.Scanner;
public class Ejercicio2 {
  public static void main(String[] args) {
    //VARIABLES:
    int numero;
    int contador;
    int suma;

    Scanner sc = new Scanner(System.in);
    System.out.println("Introduzca números y pulse ENTER. Para acabar, introduce un cero:");
    contador = 0;
    suma = 0;

    do {
      System.out.print("? ");
      numero = sc.nextInt();
      if (numero != 0) {
        contador++;
      }
      suma = suma + numero;
    } while (numero != 0);

    System.out.printf("Se han introducido %d números en total y la suma de todos ellos es %d.", contador, suma);
    sc.close();
  }
}