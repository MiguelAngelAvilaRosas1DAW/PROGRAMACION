import java.util.Scanner;
public class Ejercicio1 {
  public static void main(String[] args) {
    //VARIABLES:
    String diaSemana;

    Scanner sc = new Scanner(System.in);

    System.out.print("Introduce un dia de la semana y te dire que asignatura toca a primera hora de ese dia: ");
    diaSemana = sc.nextLine();

    switch (diaSemana) {
      case "lunes":{
        System.out.println("\033[1mPROGRAMACIÓN\033[0m");
      }break;

      case "martes":{
        System.out.println("\033[1mPROGRAMACIÓN\033[0m");
      }break;

      case "miercoles":{
        System.out.println("\033[1mSISTEMAS INFORMÁTICOS\033[0m");
      }break;

      case "jueves":{
        System.out.println("\033[1mBASES DE DATOS\033[0m");
      }break;

      case "viernes":{
        System.out.println("\033[1mSISTEMAS INFORMÁTICOS\033[0m");
      }break;

      default:{
        System.out.println("El día introducido no es correcto");
      }break;
    }
    sc.close();
  }
}