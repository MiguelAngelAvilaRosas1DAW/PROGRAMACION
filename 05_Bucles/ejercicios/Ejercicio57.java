import java.util.Scanner;
public class Ejercicio57 {
  public static void main (String [] args) {
    //VARIABLES:
    int altura;
    int contador;
    int contador2;

    Scanner sc = new Scanner (System.in);

    System.out.print("Introduce la altura de la V (Mayor o igual a 3): ");
    altura = sc.nextInt();

    if (altura < 3) {
      System.out.println("La altura tiene que ser mayor o igual a 3");
    }

    else {
      for (contador = 0 ; contador <= altura ; contador ++) {
        
        //Espacios del inicio:
        for (contador2 = 0 ; contador2 < contador ; contador2 ++) {
          System.out.print(" ");
        }

        System.out.print("***");

        //Espacios intermedios:
        for (contador2 = contador ; contador2 < (altura * 2) ; contador2 ++) {   
          System.out.print(" ");
        }

        System.out.print("***");
        System.out.println("");
      }
    }
  }
}