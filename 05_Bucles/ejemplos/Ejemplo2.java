import java.util.Scanner;
public class Ejemplo2 {
  public static void main (String[] args) {
    //VARIABLES:
    int edad;
    int suma;
    int numero;

    Scanner sc = new Scanner (System.in);
    System.out.println("Introduce tu edad: ");
    edad = sc.nextInt();
    numero = 1;
    suma = 0;
    System.out.println ((edad >= 18)?"Eres mayor de edad.":"Eres menor de edad.") ;
    suma += (numero>0)?numero:0;
    System.out.printf("Suma es igual a %d", suma);
    sc.close();
  }
}
