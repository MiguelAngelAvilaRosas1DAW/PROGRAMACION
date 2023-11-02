/*
  Creación de la clase coche.
*/
//Autor: Miguel Ángel Ávila Rosas

public class Coches {

    //Atributos
    String marca;
    String modelo;
    String color;
    String matricula;
    String numPuertas;

    //Metodos
    public void arrancar() {
        System.out.println("BRRRRRRRR");
    }

    public void velocidadMaxima() {
        System.out.println("Estoy yendo a 120 km/h");
    }

    public void sonarClaxon() {
        System.out.println("PIPIIIIII!");
    }
    
    public static void main (String[] args) {
        //Creamos dos objetos de la clase coche.
        Coches car1 = new Coches();
        Coches car2 = new Coches();

        car1.arrancar();
        car2.velocidadMaxima();
    }
}