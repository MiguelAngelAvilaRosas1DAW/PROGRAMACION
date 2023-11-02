import java.util.Scanner ;
 
public class Entrada {
  public static void main (String[] args) {

    String nombre ;

    Scanner sc = new Scanner (System.in) ; //Leemos desde la entrada genérica
    System.out.print("¿Como te llamas? ");
    nombre = sc.nextLine();
    //nombre = System.console().readLine() ; //Leer nombre
    System.out.println ("Hola, " + nombre + ", bienvenido/a.");
    sc.close();
  }
}
