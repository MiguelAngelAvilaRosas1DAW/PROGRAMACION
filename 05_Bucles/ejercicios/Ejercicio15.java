import java.util.Scanner;
import java.util.InputMismatchException;
public class Ejercicio15 {
  public static void main (String[] args) {
    //VARIABLES:
    int num1;
    int num2;
    int contador;


    Scanner sc = new Scanner(System.in);

    try {
        System.out.print("Introduzca un número entero: ");
        num1 = sc.nextInt();

        System.out.print("Introduzca un número distinto al anterior: ");
        num2 = sc.nextInt();

        //Comprobar si los numero son iguales:
        if (num1 != num2) {
            //Calcular los numeros sumando de 7 en 7:
            for (contador = num1; contador <= num2; contador += 7) {
              System.out.printf(" %d ", contador);
            }
        }
        else {
          System.out.println("Números no validos, deben ser distintos.");
        }
    } catch (InputMismatchException e) {
      System.out.println("Se le pidio introducir número enteros.");
    }
    sc.close();
  }
}
