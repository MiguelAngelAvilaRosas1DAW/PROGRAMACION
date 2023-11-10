import java.util.Scanner;

public class Ejercicio10 {
  public static void main(String[] args) {
    //VARIABLES:
    final int SEGUNDOS_DIA = 86400;

    int hora;
    int segundoshora;
    int minutos;
    int segundosminutos;
    int segundostotal;
    
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce la hora: ");
    hora = sc.nextInt();
    segundoshora = (hora * 60) * 60;

    System.out.print("Introduce los minutos: ");
    minutos = sc.nextInt();
    segundosminutos = minutos * 60;

    segundostotal = SEGUNDOS_DIA - segundoshora - segundosminutos;

    System.out.printf("Desde las %d:%d hasta la medianoche faltan %d segundos.\n", hora, minutos, segundostotal);
    sc.close();
  }
}
