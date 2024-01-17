import java.util.InputMismatchException;
import java.util.Scanner;
public class Ejemplo1 {
  public static void main (String[] args) {
    //VARIABLES:
    int numero;
    int digito;

    Scanner sc = new Scanner (System.in);

    try {
        System.out.print ("Introduce un número entero (de 5 cifras como maximo): ");
        numero = sc.nextInt();
        digito = 0;

        if ((numero > 0) && (numero < 100000)) {
          if ((numero >= 0 ) && (numero < 10)) {
          digito = numero;
          }

          else if (numero < 100) {
            digito = numero / 10;
          }

          else if (numero < 1000) {
            digito = numero / 100;
          }

          else {
            digito = numero / 1000;
          }
          System.out.printf("El primer dígito del numero introducido es el %d", digito);
          }

          else {
          System.out.println("El numero introducido no es correcto.");
        }  
    
  } catch (InputMismatchException e) {
    System.out.println("Se ha producido un error.");
  }

    sc.close();
  }
}