import java.util.Scanner;

public class Ejercicio23 {
    
     public static void main(String[] args) {
        
        String numero ;
        char digito ;          
        int posicion ;   
        Scanner sc = new Scanner(System.in) ;

        System.out.print("Introduce un número entero: ");
        numero = sc.nextLine() ;

        System.out.print("Introduce un dígito: ");
        digito = sc.nextLine().charAt(0) ;

        System.out.printf("Contando de derecha a izquierda, el %s aparece dentro de %c en las siguientes posiciones: ", numero, digito);

        for(posicion=0; posicion < numero.length(); posicion++) {

            if (numero.charAt(posicion) == digito) { 
                 System.out.printf("%d ", posicion + 1); 
            }
        }



        /* 
        int resto ;
        System.out.printf("Contando de derecha a izquierda, el %d aparece dentro de %d en las siguientes posiciones: ", numero, digito);

        numero = Varias.invertir(numero) ;

        while(numero>0) {

            resto = (int) numero%10 ;
            if (resto==digito) { System.out.printf("%d ", posicion); }

            numero = numero/10 ;
            posicion++ ;
        } */
       sc.close();
    }

}
