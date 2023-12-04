import java.util.Scanner;

public class Ejercicio25 {
  public static void main(String[] args) {
    //VARIABLES:
    int numero;
    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero: ");
    numero = sc.nextInt();

    //Mostramos el resultado llamando a la función factorial
    System.out.printf("%d! = %d\n", numero, factorial(numero));
    sc.close();
  }

  public static int factorial (int numero) {

    int fact = 1;
    while (numero > 1) {
      fact = fact * numero ;
      numero--;

    }

    return fact;
  }
}
