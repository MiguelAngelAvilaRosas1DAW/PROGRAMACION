public class Ejercicio01 {

    public static void main(String[] args) {
        
        int numero ;

        /*for(numero=0; numero <= 100 ; numero++) {
            if (numero%5 == 0) {
                System.out.printf(" %d ", numero);
            }
        }*/

        numero = 0;
        while (numero <= 100){
            if (numero%5 == 0) {
                 System.out.printf(" %d ", numero);
            }
            numero++;
        }
/*
        numero = 0;
        do{
            if (numero%5 == 0) {
                System.out.printf(" %d ", numero);
            }
            numero++;
        } while  (numero <= 100);
*/




    }
    
}
