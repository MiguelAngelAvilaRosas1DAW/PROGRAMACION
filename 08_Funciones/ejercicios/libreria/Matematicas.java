package libreria ;

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
import java.util.Scanner;
public class Matematicas {

    /**
     * Introduce un valor y si es menor que dos, vuelve a preguntar.
     * @return
     */
    public static int leerValor() {
        //VARIABLE:
        int numero;
    
        Scanner sc = new Scanner (System.in);
        numero = sc.nextInt();
        
        while (numero < 2) {
            System.out.println("Lo siento, el valor mínimo es 2");
            System.out.println("Introduzca un nuevo valor:");
            numero = sc.nextInt();
        }
        sc.close();
        
        return numero;
    }

    /**
     * Comprueba si un número es o no capicúa
     * @param int numero
     * @return boolean
     */
    public static boolean esCapicua(int numero) {
        return numero == voltea(numero) ;
    } 

    /**
     * Comprueba si un número es o no primo
     * @param int numero
     * @return boolean
     */
    public static boolean esPrimo(int numero) {

        int i = 2 ; 

        while ((i <= (numero/2)) && (numero%i!=0)) { 
            i++ ; 
        }

        return (i > (numero/2)) ;
    }

    /**
     * Devuelve el menor primo que es mayor al número que se pasa como parámetro.
     * @param numero
     * @return
     */
    public static int siguientePrimo(int numero) {

        int i ;

        for (i = numero+1; !esPrimo(i); i++) ;
        
        return i ;
    }

    /**
     * 
     * @param int base
     * @param int exponente
     * @return float
     */
    public static float potencia(int base, int exponente) {

        int potencia = 1 ;
        int i ;

        for ( i = 1; i <= exponente; i++) { potencia *= base ; }

        return (exponente >= 0)?potencia:1f/potencia ;

    }

    /**
     * Cuenta el total de dígitos de un número dado
     * @param long numero
     * @return int
     */
    public static int digitos(long numero) {

        int contador = 0 ;
        for (; numero > 0; numero/=10) { contador++ ; }

        return contador ;
    }

    /**
     * Invierte el número dado
     * @param long numero
     * @return long
     */
    public static long voltea(long numero) {

        long invertido = 0 ;
        int signo = (numero>0)?1:-1 ;

        // obtenemos el valor absoluto del número
        numero = Math.abs(numero) ;

        for ( ; numero > 0; numero/=10) {
            invertido = (invertido*10) + (numero%10) ;
        }

        return invertido * signo ;
    } 

    /**
     * Devuelve el dígito que está en la posición de un número entero. 
     * Se empieza contando por el 0 y de izquierda a derecha.
     * @param long numero
     * @param int posicion
     * @return int
     */
    public static int digitoN(long numero, int posicion) { 

        // giramos el número
        numero = voltea(numero) ;

        // buscamos la posición
        for( ; posicion > 0; posicion--) { numero /= 10 ; }
        return (int) numero%10 ;

    }

    /**
     * Devuelve la posición de la primera ocurrencia de un dígito dentro de un número 
     * entero. Si no se encuentra, devuelve -1.
     * @param long numero
     * @param int digito
     * @return int
     */
    public static int posicionDeDigito(long numero, int digito) { 

        int posicion = 0 ;

        // volteamos el número
        numero = voltea(numero) ;

        // buscamos el dígito
        while ((numero >0) && (numero%10!=digito)) {
            posicion++ ;
            numero /= 10 ;
        }

        return (numero>0)?posicion:-1 ;
    }

    /**
     * Le quita a un número n dígitos por detrás (por la derecha)
     * @param int n
     * @param long numero
     * @return long
     */
    public static long quitaPorDetras(int n, long numero) { 

        for ( ; n > 0; n--) { 
            numero /= 10 ; 
        }
        return numero ;
    }

    /**
     * Le quita a un número n dígitos por delante (por la izquierda)
     * @param int n
     * @param long numero
     * @return long
     */
    public static long quitaPorDelante(int n, long numero) { 

        // calculamos la longitud del número
        int digitosPrevistos = digitos(numero) - n ;
        
        // calculamos el resultado
        long resultado = voltea(quitaPorDetras(n, voltea(numero))) ;

        // calculamos el total de dígitos del resultado
        int digitosResultado = digitos(resultado) ;

        // si el total de digitos del resultado no es correcto multiplicamos por 10^n
        if (digitosResultado < digitosPrevistos) {
            resultado *= potencia(10, digitosPrevistos - digitosResultado) ;
        }

        return resultado ;
    }

    /**
     * Añade un dígito a un número por detrás (por la derecha)
     * @param digito
     * @param numero
     * @return
     */
    public static long pegaPorDetras(int digito, long numero) { 
        return (numero*10) + digito ;
    }

    /**
     * Añade un dígito a un número por detrás (por la izquierda)
     * @param digito
     * @param numero
     * @return
     */
    public static long pegaPorDelante(int digito, long numero) { 
        return voltea((voltea(numero) * 10) + digito) ;
    }

    /**
     * Toma como parámetros las posiciones inicial y final dentro de 
     * un número y devuelve el trozo correspondiente.
     * @param long numero
     * @param int inicio
     * @param int fin
     * @return long
     */
    public static long trozoDeNumero(long numero, int inicio, int fin) { 

        // obtenemos los digitos del numero
        int totalDigitos = digitos(numero) ;

        // eliminamos inicio digitos por delante
        numero = quitaPorDelante(inicio, numero) ;

        // eliminamos fin digitos por detrás
        numero = quitaPorDetras(totalDigitos - fin - 1, numero) ;

        return numero ;
    }

    /**
     * Pega dos números dados para formar uno.
     * @param int a
     * @param int b
     * @return long
     */
    public static long juntoNumeros(int a, int b) { 

        int digitosB = digitos(b) ;
        return (a * (int) potencia(10, digitosB)) + b ;
    }

    /**
     * Transforma un número que le introduzcas en codigo morse.
     * @param n
     * @return
     */
    public static String convierteEnMorse(long n) {
        //VARIABLES:
        int digit;
        String nMorse = "";

        //Le damos la vuelta al número:
        n = Matematicas.voltea(n);

        //Extraemos cada digito del número:
        do {
            digit = (int) n % 10;

            //Comprobamos que simbolo es en morse:
            switch (digit) {
                case 0: {
                    nMorse += "_ _ _ _ _";
                }break;
                case 1: {
                    nMorse += "· _ _ _ _";
                }break;
                case 2: {
                    nMorse += "· · _ _ _";
                }break;
                case 3: {
                    nMorse += "· · · _ _";
                }break;
                case 4: {
                    nMorse += "· · · · _";
                }break;
                case 5: {
                    nMorse += "· · · · ·";
                }break;
                case 6: {
                    nMorse += "_ · · · ·";
                }break;
                case 7: {
                    nMorse += "_ _ · · ·";
                }break;
                case 8: {
                    nMorse += "_ _ _ · ·";
                }break;
                case 9: {
                    nMorse += "_ _ _ _ ·";
                }break;
            }  
            n /= 10;
        } while (n > 0);
        return nMorse;

    }

    public static String convierteEnPalabras(long n) {
        //VARIABLES:
        int digit = 0;
        String numPalabras = "";

        //Invertimos el número para poder separar los digitos correctamente:
        n = voltea(n);
        for ( ;n > 0; n /= 10) {
            digit = (digit * 10) + ( (int) n % 10);
            switch (digit) {
                case 0:{
                    numPalabras += "cero";
                }break;

                case 1:{
                    numPalabras += "uno";
                }break;

                case 2:{
                    numPalabras += "dos";
                }break;

                case 3:{
                    numPalabras += "tres";
                }break;

                case 4:{
                    numPalabras += "cuatro";
                }break;

                case 5:{
                    numPalabras += "cinco";
                }break;
                
                case 6:{
                    numPalabras += "seis";
                }break;

                case 7:{
                    numPalabras += "siete";
                }break;

                case 8:{
                    numPalabras += "ocho";
                }break;

                case 9:{
                    numPalabras += "nueve";
                }break;
            }
            numPalabras += ", ";
        }
        return numPalabras;
    }

    public static long decimalBinario(long numDec) {
        //VARIABLES:
        long numBin = 0;
        long numBinTemp = 1;
        long numDecTemp;
        int exp = 0;

        //Calculamos el numero binario:
        do {
        //Indicar que posición tendra un 1:
        do {
            numDecTemp = numDec;
            numDecTemp -= Matematicas.potencia(2, exp);
            numBinTemp *= 10;
            exp++;
        } while (numDecTemp > 0);

        /*
        * En caso de que le numero ya de 0, procederemos a restar solo un exponente para que de esa cantidad,
        * en caso contrario, quitaremos hasta el ultimo numero que no diera negativo, y repetiremos el ciclo.
        */
        if (numDecTemp == 0) {
            exp--;
            numBinTemp /= 10;
        }
        else {
            exp -= 2;
            numBinTemp /= 100;
        }
        numDec -= Matematicas.potencia(2, exp);
        numBin += numBinTemp;

        //Restauramos los valores originales para empezar de nuevo:
        numBinTemp = 1;
        exp = 0;
        } while (numDec > 0);

        return numBin;
    }

    public static long binarioDecimal(long numBin) {
        //VARIABLES:
        long numDec = 0;
        int posicion;
        int digitos;

        //Calculamos el número de dígitos de un número:
        digitos = Matematicas.digitos(numBin);

        for (posicion = 0 ; posicion < digitos; posicion++) {
            if (numBin % 10 == 1) {
                numDec += Matematicas.potencia(2, posicion);
            }
            numBin /= 10;
        }

        return numDec;
    }
}