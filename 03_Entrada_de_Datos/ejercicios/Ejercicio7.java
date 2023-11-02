public class Ejercicio7 {
  public static void main (String[] args) {
    //Variables:
    String linea;
    Float base_imponible;
    Float IVA;
    Float total;

    System.out.print("Introduzca la base imponible del precio del articulo (sin IVA): ");
    linea = System.console().readLine();
    base_imponible = Float.parseFloat(linea);
    IVA = base_imponible * 0.21f;
    System.out.printf("Tu IVA es de: %.2f\n", IVA);
    total = base_imponible + IVA;
    System.out.println("");
    System.out.printf("%-20s%.2f €\n", "Base imponible", base_imponible);
    System.out.printf("%-20s%.2f €\n", "IVA (21%)", IVA);
    System.out.println("---------------------------");
    System.out.printf("%-20s%.2f €\n", "Total", total);
  }
}