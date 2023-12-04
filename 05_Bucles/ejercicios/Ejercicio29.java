import java.util.Scanner;
import biblioteca.Varias;

public class Ejercicio29 {
  public static void main(String[] args) {
    
    //VARIABLES:
    long numero;
    int digito;
    int suma = 0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un número entero positivo: ");
    numero = sc.nextLong();

    numero = Varias.invertir(numero);

    System.out.print("Digitos pares: ");

    for ( ; numero > 0; numero /= 10) {

      digito =  (int) numero % 10;

      if (digito % 2 == 0) {
        System.out.printf(" %d ", digito);
        suma += digito;
      }
    }

    System.out.printf("\nSuma de los dígitod pares: %d\n", suma);
    sc.close();
  }
}
