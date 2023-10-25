public class Ejercicio6 {
  public static void main(String[] args) {
    float base_imponible;
    double IVA;
    double total;

    base_imponible = 4;
    IVA = base_imponible * 1.21;
    total = base_imponible + IVA;

    System.out.printf("Una base imponible de %.2f € mas un IVA de %.2f € da un total de %.2f €", base_imponible, IVA, total);
  }
}
