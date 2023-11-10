import java.util.Scanner;
public class Ejercicio3 {
  public static void main (String[] args) {
    //VARIABLES:
    final int HORAS_ORDINARIAS = 40;
    int horas;
    int salario;

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca el numero de horas trabajadas durante la semana: ");
    horas = sc.nextInt();
    if (horas <= 40) {
      salario = horas * 12;
    }
    else {
      horas = horas - HORAS_ORDINARIAS;
      salario = (HORAS_ORDINARIAS * 12) + (horas * 16);
    }
    System.out.printf("Su salario semanal es de %d euros.\n", salario);
    sc.close();
  }
}