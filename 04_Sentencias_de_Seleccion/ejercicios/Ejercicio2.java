import java.util.Scanner;
public class Ejercicio2 {
  public static void main (String[] args) {
    //VARIABLES:
    int hora;
    
    Scanner sc = new Scanner (System.in);

    System.out.print("Introduce una hora del dia (0 - 23): ");
    hora = sc.nextInt();

    if ((hora >= 6) && (hora <= 12)) {
      System.out.println("Buenos días.");
    }

    else if ((hora >= 13) && (hora <= 20)) {
      System.out.println("Buenas tardes.");
    }

    else if ((hora >= 21) && (hora <= 23) || (hora >= 0) && (hora <= 5)) {
      System.out.println("Buenas noches.");
    }
    else {
      System.out.println("La hora introducida no es correcta.");
    }
    sc.close();
  }
}
