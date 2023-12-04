import java.util.Scanner;

public class Ejercicio43 {
  public static void main(String[] args) {
    //VARIABLES:
    int anchura;
    int altura;
    double x;
    Scanner sc = new Scanner(System.in);

    do {
    System.out.print("Introduce la anchura del rectangulo (como mínimo 2): ");
    anchura = sc.nextInt();
    } while(anchura < 2);

    do {
    System.out.print("Introduce la altura (como mínimo 2): ");
    altura = sc.nextInt();
    } while(altura < 2);

    if (altura < 2 || anchura < 2) {
      System.out.println("Lo siento, los datos introducidos no son correctos, el valor mínimo para la anchura y la altura es 2");
    }
    else {
      
      //Dibujamos el rectangulo de dimensiones altura x anchura
      

    }
    sc.close();
  }

    public static int leerValor() {

    //VARIABLES:
    int numero;
    boolean ok;

    Scanner sc = new Scanner(System.in);

    do {
      numero = sc.nextInt();

      ok = (numero >= 2);

      if (!ok) {
        System.out.println("Lo siento, los datos introducidos no son correctos, el valor para la anchura y la altura es 2.");
      }
    } while (!ok);
    return numero;
  }
}
