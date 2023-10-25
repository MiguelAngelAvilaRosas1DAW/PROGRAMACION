import java.util.Scanner;
public class Ejercicio8 {
  public static void main (String[]args) {
    Scanner s = new Scanner(System.in);
    System.out.println("Introduzca el numero de horas trabajadas durante la semana: ");
    int horas = s.nextInt();
    int salario = horas * 12;
    System.out.println("Su salario semanal es de " + salario + " euros.");
    s.close();
  }
}
