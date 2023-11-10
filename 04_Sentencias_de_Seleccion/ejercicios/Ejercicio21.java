import java.util.Scanner;
public class Ejercicio21 {
  public static void main(String[] args) {
    //VARIABLES:
    final String GRIS = "\033[213;211;206;0;0m";

    float base;
    String ivaSeleccion;
    float iva;
    float precioConIva;
    String codigoSeleccionado;
    float codigo;
    float total;

    Scanner sc = new Scanner(System.in);
    System.out.print("Introduzca la base imponible: ");
    base = sc.nextFloat();

    System.out.print("Introduzca el tipo de IVA (general, reducido o superreducido): ");
    ivaSeleccion = sc.next();

    System.out.print("Introduzca el codigo promocional (nopro, mitad, meno5, 5proc): ");
    codigoSeleccionado = sc.next();

    System.out.printf("%-25s%.2f\n", "Base imponible", base);
    if (ivaSeleccion.equals("general")) {
      iva = base * 0.21f;
      precioConIva = base + iva;
      System.out.printf("%-25s%.2f\n", "IVA (21%)", iva);
      System.out.printf("%-25s%.2f\n", "Precio con IVA",precioConIva);
      if (codigoSeleccionado.equals("nopro")) {
        codigo = 0.0f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (nopro)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("mitad")) {
        codigo = precioConIva / 2;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (mitad)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("meno5")) {
        codigo = 5.0f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (meno5)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("5proc")) {
        codigo = precioConIva * 0.05f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (5proc)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }
      else {
        System.out.println("El codigo promocional introducido es incorrecto.");
      }
    }
    else if (ivaSeleccion.equals("reducido")) {
      iva = base * 0.10f;
      precioConIva = base + iva;
      System.out.printf("%-25s%.2f\n", "IVA (10%)", iva);
      System.out.printf("%-25s%.2f\n", "Precio con IVA",precioConIva);
      if (codigoSeleccionado.equals("nopro")) {
        codigo = 0.0f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (nopro)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("mitad")) {
        codigo = precioConIva / 2;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (mitad)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("meno5")) {
        codigo = 5.0f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (meno5)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("5proc")) {
        codigo = precioConIva * 0.05f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (5proc)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }
      else {
        System.out.println("El codigo promocional introducido es incorrecto.");
      }
    }
    else if (ivaSeleccion.equals("superreducido")) {
      iva = base * 0.04f;
      precioConIva = base + iva;
      System.out.printf("%-25s%.2f\n", "IVA (4%)", iva);
      System.out.printf("%-25s%.2f\n", "Precio con IVA",precioConIva);
      if (codigoSeleccionado.equals("nopro")) {
        codigo = 0.0f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (nopro)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("mitad")) {
        codigo = precioConIva / 2;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (mitad)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("meno5")) {
        codigo = 5.0f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (meno5)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }

      else if (codigoSeleccionado.equals("5proc")) {
        codigo = precioConIva * 0.05f;
        System.out.printf("%-25s-%.2f\n", "Cod. promo. (5proc)",codigo);
        total = precioConIva - codigo;
        System.out.printf("\033[1m%s%-25s%.2f\033[0m\n", GRIS, "TOTAL:",total);
      }
      else {
        System.out.println("El codigo promocional introducido es incorrecto.");
      }
    }
    else {
      System.out.println("El tipo de IVA es incorrecto.");
    }
    sc.close();
  }
}