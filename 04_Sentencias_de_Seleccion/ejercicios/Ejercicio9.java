import java.util.Scanner;

public class Ejercicio9 {
  public static void main(String[] args) {
    //VARIABLES:
    int mes;
    int dia;

    Scanner sc = new Scanner(System.in);
    System.out.println("Este programa te dirá cuál es tu horóscopo.");
    System.out.print("Introduce el número del mes en que nació (1-12): ");
    mes = sc.nextInt();
    System.out.print("Ahora introduce el dia: ");
    dia = sc.nextInt();

    switch (mes) {
      case 1:{
        if (dia >= 20) {
          System.out.println("Su horóscopo es acuario.");
        }
        else {
          System.out.println("Su horóscopo es capricornio.");
        }
      }break;

      case 2:{
        if (dia >= 19) {
          System.out.println("Su horóscopo es piscis.");
        }
        else {
          System.out.println("Su horóscopo es acuario.");
        }
      }break;

      case 3:{
        if (dia >= 21) {
          System.out.println("Su horóscopo es aries.");
        }
        else {
          System.out.println("Su horóscopo es piscis.");
        }
      }break;

      case 4:{
        if (dia >= 20) {
          System.out.println("Su horóscopo es tauro.");
        }
        else {
          System.out.println("Su horóscopo es aries.");
        }
      }break;
        
      case 5:{
        if (dia >= 21) {
          System.out.println("Su horóscopo es géminis.");
        }
        else {
          System.out.println("Su horóscopo es tauro.");
        }
      }break;

      case 6:{
        if (dia >= 21) {
          System.out.println("Su horóscopo es cáncer.");
        }
        else {
          System.out.println("Su horóscopo es géminis.");
        }
      }break;

      case 7:{
        if (dia >= 23) {
          System.out.println("Su horóscopo es leo.");
        }
        else {
          System.out.println("Su horóscopo es cáncer.");
        }
      }break;

      case 8:{
        if (dia >= 23) {
          System.out.println("Su horóscopo es virgo.");
        }
        else {
          System.out.println("Su horóscopo es leo.");
        }
      }break;

      case 9:{
        if (dia >= 23) {
          System.out.println("Su horóscopo es libra.");
        }
        else {
          System.out.println("Su horóscopo es virgo.");
        }
      }break;

      case 10:{
        if (dia >= 23) {
          System.out.println("Su horóscopo es escorpio.");
        }
        else {
          System.out.println("Su horóscopo es libra.");
        }
      }break;

      case 11:{
        if (dia >= 22) {
          System.out.println("Su horóscopo es sagitario.");
        }
        else {
          System.out.println("Su horóscopo es escorpio.");
        }
      }break;

      case 12:{
        if (dia >= 22) {
          System.out.println("Su horóscopo es capricornio.");
        }
        else {
          System.out.println("Su horóscopo es sagitario.");
        }
      }break;
    
      default: {
        System.out.println("El mes indicado no existe.");
      }
        break;
    }
    sc.close();
  }
}
