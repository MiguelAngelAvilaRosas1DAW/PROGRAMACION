import java.util.Scanner;
public class Ejercicio4 {
  public static void main (String[] args){
    //VARIABLES:
    float a;
    float b;
    double resultado;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduzca el valor de a: ");
    a = sc.nextFloat();
    System.out.print("Ahora introduzca el valor de b: ");
    b = sc.nextFloat();

    if (a != 0) {
      resultado = b / a;
      System.out.printf("x = -%.1f\n", resultado);
    }
    else{
      System.out.println("Esta ecuación no tiene solución real.");
    }
    sc.close();
  }
}