import java.util.Scanner;
public class Ejercicio9 {
  public static void main(String[] args) {
    //Definimos la constante PI
    final double PI = 3.14159;
  Scanner s = new Scanner(System.in);
  System.out.println("Volumen de un cono");
  System.out.println("------------------");
  System.out.println("Introduzca la altura (cm):");
  double altura = s.nextFloat();
  System.out.println("Introduzca el radio de la base (cm):");
  double radio = s.nextFloat();
  //Calculamos el volumen.
  double volumen = (PI * radio * altura) / 3;
  System.out.printf("El volumen del cono es de %f cm3\n", volumen);
  s.close();
  }
}
