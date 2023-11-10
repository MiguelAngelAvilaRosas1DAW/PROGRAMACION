import java.util.Scanner;
public class Ejercicio14 {
  public static void main (String[] args) {
    //VARIABLES:
    String respuesta;
    int puntuacion;

    Scanner sc = new Scanner (System.in);
    puntuacion = 0;

    //PREGUNTA 1
    System.out.println("a. Tu pareja parece mas inquieta de lo normal sin ningñun motivo aparente.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 2
    System.out.println("b. Ha aumentado sus gastos de vestuario.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 3
    System.out.println("c. Ha perdido el interés que mostraba anteriormente por ti.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 4
    System.out.println("d. Ahora se afeita y asea con mas frecuencia (si es hombre) o ahora se arregla el pelo y asea con más frecuencia (si es mujer).");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 5
    System.out.println("e. No te deja que mires la agenda de su teléfono movil.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 6
    System.out.println("f. A veces tiene llamadas que dice no querer contestar cuando estas tu delante.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 7
    System.out.println("g. Ultimamente se preocupa mas la linea y/o estar bronceado/a.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 8
    System.out.println("h. Muchos dias viene tarde despues de trabajar porque dice tener mucho mas trabajo.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 9
    System.out.println("i. Has notado que ultimamente se perfuma mas.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //PREGUNTA 10
    System.out.println("j. Se confunde y te dice que ha estado en sitios donde no ha ido contigo.");
    System.out.print("(v)erdadero o (f)also: ");
    respuesta = sc.nextLine();
    if (respuesta.equals("v")) {
      puntuacion = puntuacion + 3;
    }
    System.out.println("");

    //RESPUESTAS
    if (puntuacion <= 10) {
      System.out.println("¡Enhorabuena! Tu pareja parece ser totalmente fiel.");
    }

    else if ((puntuacion >=11) && (puntuacion <= 22)) {
      System.out.println("Quizas exista el peligro de otra persona en su vida o en su mente, aunque seguramente sea algo sin importancia. No bajes la guardia.");
    }

    else {
      System.out.println("Tu pareja tiene todos los ingredientes para estar viviendo un romance con otra persona. Te aconsejamos que indages un poco mas y averigues que esta pasando por su cabeza.");
    }

    sc.close();
  }
}