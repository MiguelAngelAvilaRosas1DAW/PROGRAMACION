import java.util.Scanner;

public class Ejercicio3 {
  public static void main(String[] args) {
    //VARIABLES:
    int opcion;
    float ladoCuadrado;
    float base;
    float altura;
    float area;

    Scanner sc = new Scanner(System.in);

    System.out.println("CALCULADORA DE AREA");
    System.out.println("===================");
    System.out.println("1. Cuadrado");
    System.out.println("2. Rectangulo");
    System.out.println("3. Triangulo");
    System.out.println("");
    System.out.print("¿Que area quieres calcular? (Indica el numero) ");
    opcion = sc.nextInt();
    System.out.print("");

    switch (opcion) {
      case 1:{
        System.out.print("Indique el tamaño de cada lado del cuadrado (cm): ");
        ladoCuadrado = sc.nextFloat();
        area = ladoCuadrado * ladoCuadrado;
        System.out.printf("El area del cuadrado es de %.2f cm\n", area);
      }break;

      case 2:{
        System.out.print("Indique la base del rectangulo (cm): ");
        base = sc.nextFloat();
        System.out.print("Indique la altura del rectangulo (cm): ");
        altura = sc.nextFloat();
        area = base * altura;
        System.out.printf("El area del rectangulo es de %.2f cm\n", area);
      }break;

      case 3:{
         System.out.print("Indique la base del triangulo (cm): ");
        base = sc.nextFloat();
        System.out.print("Indique la altura del triangulo (cm): ");
        altura = sc.nextFloat();
        area = base * altura /2;
        System.out.printf("El area del triangulo es de %.2f cm\n", area);
      }break;
    
      default: {
        System.out.println("** ERROR La opción indicada no existe.");
      }break;
    }
    sc.close();
  }
}