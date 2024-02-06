package ejemplos;

public class Ejemplo01 {
 
    public static void main(String[] args) {
     
        Coche miCoche;
        Coche tuCoche;

        miCoche = new Coche("Audi", "negro", 3);
        tuCoche = new Coche("Citroen", "blanco", 3);  
    
        System.out.println(miCoche);
        System.out.println(tuCoche);

    }
    /**
     * Este metodo
     */
    @Override
    public String toString() {

        return "Hola mundo!";
    }
}