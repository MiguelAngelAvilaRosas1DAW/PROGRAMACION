import biblioteca.Varias ;

public class Ejercicio19 {
    
     public static void main(String[] args) {

        int numero ;        

        System.out.println("Números primos entre 2 y 100:");

        for (numero=2; numero <= 100; numero++) {
           if (Varias.esPrimo(numero)) { System.out.printf("%d ", numero); }
        }
     }

}
