import java.util.Scanner;

public class Ejercicio6 {
  public static void main(String[] args) {
    //VARIABLES:
    float nota1;
    float nota2;
    float nota3;
    float media;

    Scanner sc = new Scanner (System.in);
    System.out.print("Introduzca la primera nota: ");
    nota1 = sc.nextFloat();
    System.out.print("Ahora introduzca la segunda nota: ");
    nota2 = sc.nextFloat();
    System.out.print("Por último introduzca la tercera nota: ");
    nota3 = sc.nextFloat();

    media = (nota1 + nota2 + nota3) / 3;
    System.out.printf("La media es de %.2f\n", media);
    sc.close();
  }
}