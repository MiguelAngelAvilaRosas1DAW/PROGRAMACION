//import java.util.Scanner;
public class Ejercicio8 {
  public static void main (String[] args) {
    //Scanner sc = new Scanner(System.in);
    
    //Variables:
    String linea;
    int horas;
    int salario;
    System.out.print("Introduzca el numero de horas trabajadas durante la semana: ");
    linea = System.console().readLine();
    horas = Integer.parseInt(linea);
    //horas = sc.nextInt();
    salario = horas * 12;
    System.out.printf("Su salario semanal es de %d euros.\n", salario);
    //sc.close();
  }
}