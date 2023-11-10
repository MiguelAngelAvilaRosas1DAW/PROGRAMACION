import java.util.Scanner;
public class Ejercicio12 {
  public static void main (String[] args) {
    //VARIABLES:
    int numero;
    int parImpar;
    int divisible;

    Scanner sc = new Scanner (System.in);

    System.out.print("Introduce un número entero: ");
    numero = sc.nextInt();
    parImpar = numero % 2;
    divisible = numero % 5;
    
    if ((parImpar == 0) && (divisible == 0)) {
      System.out.println("El número introducido es \033[1mpar\033[0m y \033[1mdivisible\033[0m entre 5.");
    }

    else if ((parImpar != 0) && (divisible == 0)) {
      System.out.println("El número introducido es \033[1mimpar\033[0m y \033[1mdivisible\033[0m entre 5.");
    }

    else if ((parImpar == 0) && (divisible != 0)) {
      System.out.println("El número introducido es \033[1mpar\033[0m y \033[1mno es\033[0m divisible entre 5.");
    }

    else {
      System.out.println("El número introducido es \033[1mimpar\033[0m y \033[1mno es\033[0m divisible entre 5.");
    }
    sc.close();
  }

}
