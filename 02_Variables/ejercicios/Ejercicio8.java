public class Ejercicio8 {
  public static void main (String[] args) {
    char h;
    char o;
    char l;
    char a;
    String saludo;
    h = 'h';
    o = 'o';
    l = 'l';
    a = 'a';
    /*El problema radica en que un String no puede sumar las otras variables por que solo concatenan palabras.
    La solución a esto es poner dos comillas al principio, debido a que al contenarlo con texto funciona.*/
    saludo ="" + h + o + l + a;
    System.out.println(saludo);

  }
}
