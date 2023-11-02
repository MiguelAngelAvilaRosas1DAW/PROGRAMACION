import java.util.Scanner;

public class Ejercicio1 {
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
  /*Es recomendable, que no obligatorio, que las variable esten definidas
  al principio por si hay muchas poder verlas con claridad.*/

    System.out.println("Este programa multiplica 2 numeros enteros.");
    System.out.println("Por favor introduzca el primer numero: ");
    int num1 = s.nextInt();
    System.out.println("Por favor introduzca el segundo numero: ");
    int num2 = s.nextInt();
    int resultado = num1 * num2;
    System.out.printf("%d * %d = %d\n", num1 ,num2 ,resultado); //La \n del final es para el salto de linea.

    /*Otra forma:
     * linea= System.console().readline();
     * num1 = Integer.parseInt(linea);
     * linea2 = System.console().readline();
     * num1 = Integer.parseInt(linea);
    */
    s.close();
  }
}
