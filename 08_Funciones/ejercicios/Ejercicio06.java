import libreria.Matematicas;
import java.util.Scanner;

public class Ejercicio06 {
  public static void main (String[] args) {
    //VARIABLES:
    final String NEGRITA = "\033[1m";
    final String CURSIVA = "\033[3m";
    final String NADA = "\033[0m";

    char opcion;
    long num;
    boolean salirBucle = false;
    boolean mensajeError = false;

    Scanner sc = new Scanner (System.in);

    while (salirBucle == false) {
        System.out.println("A) Binario -> Octal");
        System.out.println("B) Binario -> Decimal");
        System.out.println("C) Binario -> Hexadecimal");
        System.out.println("D) Octal -> Binario");
        System.out.println("E) Octal -> Decimal");
        System.out.println("F) Octal -> Hexadecimal");
        System.out.println("G) Decimal -> Binario");
        System.out.println("H) Decimal -> Octal");
        System.out.println("I) Decimal -> Hexadecimal");
        System.out.println("J) Hexadecimal -> Binario");
        System.out.println("K) Hexadecimal -> Octal");
        System.out.println("L) Hexadecimal -> Decimal");
        System.out.println("T) Terminar");

        if (mensajeError == true) {
            System.out.printf("\n%s%sLa opción introducida no se encuentra en el menu.%s\n", NEGRITA, CURSIVA, NADA);
            mensajeError = false;
        }

        System.out.print("\nElija una opción: ");
        opcion = sc.next().charAt(0);

        switch (opcion) {
            case 'A':
            case 'H':
            case 'K': {
                System.out.print("\nIntroduzca el número que quiere convertir: ");
                num = sc.nextLong();
            }break;

            case 'B':
            case 'E':
            case 'L': {
                System.out.print("\nIntroduzca el número que quiere convertir: ");
                num = sc.nextLong();
            }break;

            case 'C':
            case 'F':
            case 'I': {
                System.out.print("\nIntroduzca el número que quiere convertir: ");
                num = sc.nextLong();
            }break;

            case 'D':
            case 'G':
            case 'J': {
                System.out.print("\nIntroduzca el número que quiere convertir: ");
                num = sc.nextLong();
            }break;

            case 'T': {
                salirBucle = true;
            }break;
            
            default:{
                mensajeError = true;
            }break;
        }
    }

  }
}