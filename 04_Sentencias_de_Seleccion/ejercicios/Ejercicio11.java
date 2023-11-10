import java.util.Scanner;

public class Ejercicio11 {
  public static void main(String[] args) {
    //VARIABLES:
    String respuesta;
    int puntuacion;
    
    Scanner sc = new Scanner(System.in);
    puntuacion = 0;

    //PREGUNTA 1
    System.out.println("1. ¿Cual de los siguientes tipos de datos tiene más precisión?");
    System.out.println("a. int");
    System.out.println("b. double");
    System.out.println("c. float");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("a")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 2
    System.out.println("2. ¿Cuál es el lenguaje que se utiliza para hacer consultas en las bases de datos?");
    System.out.println("a. XML");
    System.out.println("b. Select");
    System.out.println("c. SQL");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("c")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 3
    System.out.println("3. Para insertar un hiperenlace en una página se utiliza la etiqueta...");
    System.out.println("a. href");
    System.out.println("b. a");
    System.out.println("c. link");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("a")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 4
    System.out.println("4. ¿En que directorio se encuentran los archivos de configuración de Linux?");
    System.out.println("a. /etc");
    System.out.println("b. /config");
    System.out.println("c. /cfg");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("a")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 5
    System.out.println("5. ¿Cual de las siguientes memorias es volátil?");
    System.out.println("a. RAM");
    System.out.println("b. EPROM");
    System.out.println("c. ROM");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("a")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 6
    System.out.println("6. ¿En qué unidad del microprocesador se halla el Reloj que marca el ritmo de todo el sistema?");
    System.out.println("a. Unidad de Proceso (UP)");
    System.out.println("b. Unidad de Control (UC)");
    System.out.println("c. Unidad de Velocidad (UV)");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("b")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 7
    System.out.println("7. ¿Que posición en CSS nos permite mover a voluntad una imagen?");
    System.out.println("a. sticky");
    System.out.println("b. relative");
    System.out.println("c. absolute");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("c")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 8
    System.out.println("8. ¿Cuales de estas son  que relaciones existen entre entidades?");
    System.out.println("a. 1:1, N:1");
    System.out.println("b. 1:1, 1:N, N:M");
    System.out.println("c. 1:1, 1:N, M:N");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("c")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 9
    System.out.println("9. ¿Con que comando creamos la carpeta .git en Git Bash?");
    System.out.println("a. git init");
    System.out.println("b. git commit");
    System.out.println("c. git innit");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("a")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    //PREGUNTA 10
    System.out.println("10. ¿Como se debe de escribir la variable \"Gran coche\" en JAVA?");
    System.out.println("a. GranCoche");
    System.out.println("b. granCoche");
    System.out.println("c. Gran-coche");
    System.out.print("=> ");
    respuesta = sc.next();
    if (respuesta.equals("b")) {
      System.out.println("Correcto");
      puntuacion = puntuacion + 1;
    }
    else {
      System.out.println("Incorrecto");
    }
    System.out.println("");

    System.out.printf("Ha obtenido \033[1m%d puntos.\033[0m", puntuacion);

    sc.close();
  }
}
