import java.util.Scanner;

public class Ejercicio7 {
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
    if ((media >= 9) && (media <= 10)) {
      System.out.println("Sobresaliente");
    }
    else if ((media >= 7) && (media <= 8.99)){
      System.out.println("Notable");
    }
    else if ((media >= 6) && (media <= 6.99)){
      System.out.println("Bien");
    }
    else if ((media >= 5) && (media <= 5.99)){
      System.out.println("Suficiente");
    }
    else {
      System.out.println("Insuficiente");
    }
    sc.close();
  }
}