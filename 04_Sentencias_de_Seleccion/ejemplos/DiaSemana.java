import java.util.Scanner;

public class DiaSemana {
  public static void main(String[] args) {
    //Variables:
    int dia;
    Scanner sc = new Scanner(System.in);
    System.out.print("Introduce el dia de la semana: ");
    dia = sc.nextInt();

    switch (dia) {
      case 1:
      case 2:
      case 3:
      case 4:
      case 5: {
        System.out.println("Es un dia entre semana.");
        } break;

      case 6:
      case 7: {
        System.out.println("Es fin de semana");
      } break;

      default: {
        System.out.println("** Error: no se corresponde con ningún dia de la semana");
      } break;
    }
    sc.close();
  }
}
