package ejemplos;

import java.util.Scanner;

import java.util.InputMismatchException;

public class Ejemplo02 {
    public static void main(String[] args) {
        //VARIABLES:
        int[] numeros;
        numeros = new int[5];
        int valor;
        Scanner sc = new Scanner (System.in);

        numeros[0] = 8;
        numeros[1] = 33;
        numeros[2] = 200;
        numeros[3] = 150;
        numeros[4] = 11;

        System.out.println("Los valores del array son los siguientes: ");
        System.out.printf("0 = %d, 1 = %d, 2 = %d, 3 = %d y 4 = %d\n\n", numeros[0], numeros[1], numeros[2], numeros[3], numeros[4]);

        try{
        System.out.println("Indique el valor que quiere recibir:");
        valor = sc.nextInt();

        //FORMA 1 (LARGA):

        /*switch(valor) {
            case 0: {
                System.out.println(numeros[0]);
            } break;
            case 1: {
                System.out.println(numeros[1]);
            } break;
            case 2: {
                System.out.println(numeros[2]);
            } break;
            case 3: {
                System.out.println(numeros[3]);
            } break;
            case 4: {
                System.out.println(numeros[4]);
            } break;
        }*/

        //FORMA 2 (CORTA):
        System.out.printf("El valor de la celda es: %d", numeros[valor]);

    } catch (InputMismatchException e) {
        System.out.println("Valor incorrecto introducido, se esperaba un entero.");
    }  catch (ArrayIndexOutOfBoundsException r) {
        System.out.println("Valor incorrecto introducido, no existe el número en el array.");
    }
    }
}
