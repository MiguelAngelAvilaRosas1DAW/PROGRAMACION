import java.util.Scanner;
import libreria.Matematicas;

public class Ejercicio05 {
  public static void main (String[] args) {
    //VARIABLES:
    long numDec;
    long numDec1;
    long numBin = 0;
    long numBinTemp = 1;
    long numDecTemp;
    int exp = 0;

    Scanner sc = new Scanner (System.in);
    
    //Pedimos los datos:
    System.out.print("Introduzca un número en base 10 para pasarlo a binario: ");
    numDec = sc.nextLong();
    numDec1 = numDec;

    //Calculamos el numero binario:
    do {
      //Indicar que posición tendra un 1:
      do {
        numDecTemp = numDec1;
        numDecTemp -= Matematicas.potencia(2, exp);
        numBinTemp *= 10;
        exp++;
      } while (numDecTemp > 0);

      /*
       * En caso de que le numero ya de 0, procederemos a restar solo un exponente para que de esa cantidad,
       * en caso contrario, quitaremos hasta el ultimo numero que no diera negativo, y repetiremos el ciclo.
      */
      if (numDecTemp == 0) {
        exp--;
        numBinTemp /= 10;
      }
      else {
        exp -= 2;
        numBinTemp /= 100;
      }
      numDec1 -= Matematicas.potencia(2, exp);
      numBin += numBinTemp;

      //Restauramos los valores originales para empezar de nuevo:
      numBinTemp = 1;
      exp = 0;
    } while (numDec1 > 0);

    //Damos el resultado:
    System.out.printf("%d en decimal es %d en binario.", numDec, numBin);

    sc.close();
  }
}
