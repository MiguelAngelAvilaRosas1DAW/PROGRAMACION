import java.util.Scanner;
public class readLine {
  public static void main(String[] args) {
    //Variables:
    String nombre;
    int edad;
    float num1;
    float num2;
    double suma;
    double resta;
    double multiplicacion;
    double division;

    Scanner sc =  new Scanner (System.in);
    System.out.println("\033[33m\"IDENTIFICACIÓN\"");
    System.out.println("-------------------\033[0m");
    System.out.print("Por favor introduzca su \033[34mNombre\033[0m: ");
    nombre = sc.nextLine();
    System.out.print("Introduce tu \033[32medad\033[0m: ");
    edad = sc.nextInt();
    System.out.printf("¡Bienvenido, \033[34m%s\033[0m de \033[32m%d\033[0m años!\n", nombre, edad);
    System.out.println("");
    System.out.println("\033[33m\"¡VAMOS A OPERAR!\"");
    System.out.println("---------------------\033[0m");
    System.out.println("Introduce el \033[31mprimer numero\033[0m: ");
    num1 = sc.nextFloat();
    System.out.println("Introduce el \033[35msegundo numero\033[0m: ");
    num2 = sc.nextFloat();
    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = num1 / num2;
    System.out.println("----------------------------------------");
    System.out.printf("\033[1mSuma\033[0m             %.2f + %.2f = %.2f\n", num1, num2, suma);
    System.out.println("----------------------------------------");
    System.out.printf("\033[1mResta\033[0m            %.2f - %.2f = %.2f\n", num1, num2, resta);
    System.out.println("----------------------------------------");
    System.out.printf("\033[1mMultiplicación\033[0m   %.2f * %.2f = %.2f\n", num1, num2, multiplicacion);
    System.out.println("----------------------------------------");
    System.out.printf("\033[1mDivisión\033[0m         %.2f / %.2f = %f\n", num1, num2, division);
    System.out.println("----------------------------------------");
    sc.close();
  }
}
