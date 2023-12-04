import java.util.Scanner;

public class Ejercicio14 {
  public static void main (String [] args) {
    //VARIABLES:
    int num;
    int num100;
    int numNuevo;
    int numAnterior;
    int contador;

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce un número entero positivo: ");
    num = sc.nextInt();

    //COMPROBAR QUE EL NÚMERO ES POSITIVO:
    if (num >= 0) {
      for (contador = num + 1; contador < num + 100; contador++) {
        numNuevo = contador;
        num100 = numNuevo + contador;
        numAnterior = num100;
      }
    }
    else {
      System.out.println("Numero introducido incorrecto, debe introducír un número positivo.");
    }

  }
}
