import java.util.Scanner;
public class Ejercicio4 {
  public static void main(String[] args) {
    Scanner s = new Scanner (System.in);
    System.out.println("Introduce un primer número:");
    float num1 = s.nextFloat();
    System.out.println("Introduce un segundo número:");
    float num2 = s.nextFloat();
    float suma = num1 + num2;
    float resta = num1 - num2;
    float multiplicacion = num1 * num2;
    float division = num1 / num2;

    System.out.println("x = " + num1);
    System.out.println("y = " + num2);
    System.out.println("x + y = " + suma);
    System.out.println("x - y = " + resta);
    System.out.println("x / y = " + division);
    System.out.println("x * y = " + multiplicacion);
    s.close();
  }

}
