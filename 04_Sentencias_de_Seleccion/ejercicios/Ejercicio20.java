import java.util.Scanner;
public class Ejercicio20 {
  public static void main (String[] args) {
    //VARIABLES:
    final int HORAS_SEMANA = 168;

    String diaSemana;
    int hora;
    int minutos;
    int horasTotales;
    int minutosTotales;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduzca un dia de la semana (de lunes a viernes): ");
    diaSemana = sc.next();

    System.out.println("Ahora introduce la hora (hora y minutos)");
    System.out.print("Hora: ");
    hora = sc.nextInt();
    System.out.print("Minutos: ");
    minutos = sc.nextInt();

    switch (diaSemana) {

      case "lunes": {
        horasTotales = HORAS_SEMANA - hora;
        minutosTotales = (horasTotales * 60) - minutos;
        System.out.printf("Faltan %d minutos para llegar al fin de semana.\n", minutosTotales);
      }

      case "martes": {
        horasTotales = HORAS_SEMANA - (hora + 24);
        minutosTotales = (horasTotales * 60) - minutos;
        System.out.printf("Faltan %d minutos para llegar al fin de semana.\n", minutosTotales);
      }

      case "miercoles": {
        horasTotales = HORAS_SEMANA - (hora + 48);
        minutosTotales = (horasTotales * 60) - minutos;
        System.out.printf("Faltan %d minutos para llegar al fin de semana.\n", minutosTotales);
      }

      case "jueves": {
        horasTotales = HORAS_SEMANA - (hora + 72);
        minutosTotales = (horasTotales * 60) - minutos;
        System.out.printf("Faltan %d minutos para llegar al fin de semana.\n", minutosTotales);
      }

      case "viernes": {
        horasTotales = HORAS_SEMANA - (hora + 96);
        minutosTotales = (horasTotales * 60) - minutos;
        System.out.printf("Faltan %d minutos para llegar al fin de semana.\n", minutosTotales);
      }
      default: {
        System.out.println("El dia introducido no es un dia de la semana.");
      }
    }
    sc.close();
  }
}