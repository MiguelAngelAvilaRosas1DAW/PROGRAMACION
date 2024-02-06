package ejemplos;

public class Coche {
  
    //CONSTANTES

    //ATRIBUTOS | PROPIEDADES DE LA CLASE
    protected String marca;
    protected String modelo;
    protected String color;
    protected String matricula;
    protected int numPuertas;

    //MÉTODOS | COMPORTAMIENTO DE LA CLASE
    Coche(String marca, String color, int numPuertas) {
        this.marca = marca;
        this.color = color;
        this.numPuertas = numPuertas;
    }

    @Override
    public String toString() {
        return "Mi coche es un " + this.marca + " de color " + this.color + " con " + this.numPuertas + " puertas.";
    }

}