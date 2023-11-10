import java.util.Scanner;
public class Ejercicio13 {
    public static void main (String[] args) {
      //VARIABLES:
      String caracter;
      int tipo;

      Scanner sc = new Scanner (System.in);

      System.out.println ("Este programa pinta una pirámide.");
      System.out.print ("Introduzca el caracter de relleno: ");
      caracter = sc.next();
      System.out.println ("Elija un tipo de pirámide:");
      System.out.println ("1. Con el vértice hacia arriba");
      System.out.println ("2. Con el vértice hacia abajo");
      System.out.println ("3. Con el vértice hacia la izquierda");
      System.out.println ("4. Con el vértice hacia derecha");
      System.out.print ("? ");
      tipo = sc.nextInt();
      System.out.println ("");
      System.out.println ("La pirámide es:");
      System.out.println ("");

      switch (tipo) {
        case 1:{
          System.out.printf ("  %s\n", caracter);
          System.out.printf (" %s%s%s\n", caracter, caracter, caracter);
          System.out.printf ("%s%s%s%s%s\n", caracter, caracter, caracter, caracter, caracter);
        }break;

        case 2:{
          System.out.printf ("%s%s%s%s%s\n", caracter, caracter, caracter, caracter, caracter);
          System.out.printf (" %s%s%s\n", caracter, caracter, caracter);
          System.out.printf ("  %s\n", caracter);
        }break;

        case 3:{
          System.out.printf ("  %s\n", caracter);
          System.out.printf (" %s%s\n", caracter, caracter);
          System.out.printf ("%s%s%s\n", caracter, caracter, caracter);
          System.out.printf (" %s%s\n", caracter, caracter);
          System.out.printf ("  %s\n", caracter);
        }break;

        case 4:{
          System.out.printf ("%s\n", caracter);
          System.out.printf ("%s%s\n", caracter, caracter);
          System.out.printf ("%s%s%s\n", caracter, caracter, caracter);
          System.out.printf ("%s%s\n", caracter, caracter);
          System.out.printf ("%s\n", caracter);
        }break;
      }
      sc.close();
    }
}