import java.util.Scanner;
import biblioteca.Varias;

public class Ejercicio41 {
 public static void main (String [] args) {
  //VARIABLES:
  long numero;
  int posicion;
  int digito;
  long num1 = 0;
  long num2 = 0;

  Scanner sc = new Scanner (System.in);

  //Introducción de datos:
  System.out.print("Introduce un número entero positivo: ");
  numero = sc.nextLong();

  System.out.print("Introduce la posición donde quiere insertar: ");
  posicion = sc.nextInt();

  System.out.print("Introduce el dígito que quiere insertar: ");
  digito = sc.nextInt();

  //Invertimos el numero:
  numero = Varias.invertir(numero);

  //Extraemos la primera parte de los números:
  for ( ; posicion > 1 ; posicion--) {
    num1 = (num1 * 10) + (numero % 10);
    numero /= 10; 
  }

  //Extraemos la segunda parte de los números:
  for ( ; numero > 0 ; numero /= 10) {
    num2 = (num2 * 10) + (numero % 10);
  }

  System.out.printf("El número resultante es %d%d%d.", num1, digito, num2);
  sc.close();
 } 
}
