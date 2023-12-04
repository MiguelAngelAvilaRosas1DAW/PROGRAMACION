import java.util.Scanner;

public class Ejercicio13 {
  public static void main(String[] args) {
    //VARIABLES:
    int num;
    int contador;
    int contadorNum = 0;

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduzca un número entero: ");
    num = sc.nextInt();

    //Comprovación del número (primo o no primo):
    for (contador=1; contador <= num ; contador++) {
      if (num % contador == 0) {
        contadorNum++;
      }
    }

    System.out.printf("El numero \033[1m%ses primo\033[0m", (contadorNum == 2)?"":"no ");
    sc.close();
  }
}