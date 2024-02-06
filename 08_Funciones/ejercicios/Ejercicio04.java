import libreria.Matematicas;
import java.util.Scanner;
public class Ejercicio04 {
  public static void main (String [] args) {
    //VARIABLES:
    long numBin;
    long numOperacion;
    long numDec = 0;
    int posicion;
    int digitos;

    Scanner sc = new Scanner (System.in);

    System.out.print("Introduzca un número en binario: ");
    numBin = sc.nextLong();
    numOperacion = numBin;

    //Calculamos el número de dígitos de un número:
    digitos = Matematicas.digitos(numBin);

    for (posicion = 0 ; posicion < digitos; posicion++) {
      if (numOperacion % 10 == 1) {
        numDec += Matematicas.potencia(2, posicion);
      }
      numOperacion /= 10;
    }

    System.out.printf("%d en binario es %d en decimal.", numBin, numDec);

    sc.close();
  }
}
