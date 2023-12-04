import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio07 {
  public static void main (String[] args) {
    //VARIABLES:
    int num;
    float numTotal = 0;
    double media;
    int contador = 0;

    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa calcula la media de números positivos introducidos.");
    System.out.println("Para parar introduzca un número negativo");
    System.out.println("Vaya introduciendo números:");

    //BUCLE NUMEROS
    try {
      do {
        num = sc.nextInt();
        if (num >= 0) {
          contador++;
          numTotal += num;
        }
      } while (num >= 0);

      //CALCULAR MEDIA
      media = numTotal / contador;

      System.out.printf("La media de numeros introducidos es de %f", media);
      sc.close();
    } catch (InputMismatchException e) {
      System.out.println("Se le pidio introducir un valor entero.");
    }
  }
}