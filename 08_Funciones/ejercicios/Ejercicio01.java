import libreria.Matematicas ;

/**
 * Crea una biblioteca de funciones matemáticas llamada Matematicas.java que contenga las 
 * siguientes funciones. Recuerda que puedes usar unas dentro de otras si es necesario. 
 * Observa bien lo que hace cada función ya que, si las implementas en el orden adecuado, 
 * te puedes ahorrar mucho trabajo. Por ejemplo, la función esCapicua resulta trivial 
 * teniendo voltea y la función siguientePrimo también es muy fácil de implementar teniendo 
 * esPrimo.
 * 
 * @author Antonio J. Sánchez
 * @author José David Quero
 */

public class Ejercicio01 {

    public static void main(String[] args) {

        // capicúa
        System.out.printf("El 464 %s\n", Matematicas.esCapicua(464)?"es capicua":"no es capicua");

        // es primo
        System.out.printf("El 29 %s\n",  Matematicas.esPrimo(29)?"es primo":"no es primo");

        // siguiente primo mayor a 23 y 100
        System.out.printf("El siguiente primo mayor a 23 es %d\n",  Matematicas.siguientePrimo(23));
        System.out.printf("El siguiente primo mayor a 100 es %d\n",  Matematicas.siguientePrimo(100));

         // potencia
        System.out.printf("2^10 = %.4f\n",  Matematicas.potencia(2,10));
        System.out.printf("5^-3 = %.4f\n",  Matematicas.potencia(5,-3));

        // dígitos
        System.out.printf("El número 0 tiene %d digitos.\n",  Matematicas.digitos(0));
        System.out.printf("El número 7 tiene %d digitos.\n",  Matematicas.digitos(7));
        System.out.printf("El número 674893123 tiene %d digitos.\n",  Matematicas.digitos(674893123));

        // voltea
        System.out.printf("El 5 volteado es %d.\n",  Matematicas.voltea(5));
        System.out.printf("El 398004321 volteado es %d.\n",  Matematicas.voltea(398004321));
        System.out.printf("El -75839 volteado es %d.\n",  Matematicas.voltea(-75839));

        // digitoN
        System.out.printf("En la posición 0 del 3452 está el %d.\n",  Matematicas.digitoN(3452,0));
        System.out.printf("En la posición 6 del 857964034 está el %d.\n",  Matematicas.digitoN(857964034,6));
        System.out.printf("En la posición 4 del 857964034 está el %d.\n",  Matematicas.digitoN(857964034,4));

        // posicionDeDigito
        System.out.printf("En el 3452, el dígito 4 está en la posición %d.\n",  Matematicas.posicionDeDigito(3452,4));
        System.out.printf("En el 78604321, el dígito 1 está en la posición %d.\n",  Matematicas.posicionDeDigito(78604321,1));
        System.out.printf("En el 78604321, el dígito 7 está en la posición %d.\n",  Matematicas.posicionDeDigito(78604321,7));
        System.out.printf("En el 78604321, el dígito 5 está en la posición %d.\n",  Matematicas.posicionDeDigito(78604321,5));

        // quitaPorDetras
        System.out.printf("Si al 78604321 se le quitan por detrás 4 digitos, se queda como %d.\n",  Matematicas.quitaPorDetras(4,78604321));
        System.out.printf("Si al 1000 se le quitan por detrás 1 digito, se queda como %d.\n",  Matematicas.quitaPorDetras(1,1000));

        // quitaPorDelante
        System.out.printf("Si al 78604321 se le quitan por delante 4 digitos, se queda como %d.\n",  Matematicas.quitaPorDelante(4,78604321));
        System.out.printf("Si al 78604000 se le quitan por delante 2 digito, se queda como %d.\n",  Matematicas.quitaPorDelante(2,78604000));

        // pegaPorDetras
        System.out.printf("Si al 567 se le pega por detrás el 1 da el %d.\n",  Matematicas.pegaPorDetras(1,567));
        System.out.printf("Si al 33 se le pega por detrás el 0 da el %d.\n",  Matematicas.pegaPorDetras(0,33));

        // pegaPorDelante
        System.out.printf("Si al 567 se le pega por delante el 1 da el %d.\n",  Matematicas.pegaPorDelante(1,567));
        System.out.printf("Si al 33 se le pega por delante el 0 da el %d.\n",  Matematicas.pegaPorDelante(0,33));

        // trozoDeNumero
        System.out.printf("Al 78604000 le cojo el trozo que va de la posición 0 a la 3: %d.\n",  Matematicas.trozoDeNumero(78604000,0,3));
        System.out.printf("Al 78604000 le cojo el trozo que va de la posición 4 a la 6: %d.\n",  Matematicas.trozoDeNumero(78604000,4,6));
        System.out.printf("Al 78604000 le cojo el trozo que va de la posición 2 a la 2: %d.\n",  Matematicas.trozoDeNumero(78604000,2,2));

        // juntoNumeros
        System.out.printf("Juntando el 21 y el 40 da el %d\n", Matematicas.juntoNumeros(21, 40));
        System.out.printf("Juntando el 789 y el 250 da el %d\n", Matematicas.juntoNumeros(789, 250));

        System.out.println("================= FIN ===================================================");
        
    }
}
