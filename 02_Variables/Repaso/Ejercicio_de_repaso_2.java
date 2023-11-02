public class Ejercicio_de_repaso_2 {
  public static void main(String[] args) {
    //Variables:
    float num1;
    float num2;
    String linea;
    double suma;
    double resta;
    double multiplicacion;
    double division;

    System.out.println("CALCULADORA UNIVERSAL");
    System.out.println("---------------------");
    System.out.println("Introduce el \033[32mprimer numero\033[0m:");
    linea = System.console().readLine();
    num1 = Float.parseFloat(linea);
    System.out.println("Introduce el \033[31msegundo numero\033[0m:");
    linea = System.console().readLine();
    num2 = Float.parseFloat(linea);

    suma = num1 + num2;
    resta = num1 - num2;
    multiplicacion = num1 * num2;
    division = num1 / num2;

    System.out.printf("%.2f + %.2f = %.2f\n", num1, num2, suma);
    System.out.printf("%.2f - %.2f = %.2f\n", num1, num2, resta);
    System.out.printf("%.2f * %.2f = %.2f\n", num1, num2, multiplicacion);
    System.out.printf("%.2f / %.2f = %.2f\n", num1, num2, division);
  }
}