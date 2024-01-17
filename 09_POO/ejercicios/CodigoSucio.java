package ejercicios;

/**
* Práctica código sucio.
* @author Antonio J.Sánchez
* @author José David Quero
*/

import java.util.InputMismatchException;
import java.util.Scanner;

public class CodigoSucio {
    public static void main(String[] args) {
        //VARIABLES:
        int x;
        int M;
        int a;
        char j;
        String t;

        Scanner s = new Scanner(System.in);
        
        try{
            do {
                System.out.println("Seleccione una opción:");
                System.out.println("1. Opción 1");
                System.out.println("2. Opción 2");
                System.out.println("0. Salir");
                M = s.nextInt();
            

            switch (M) {
                case 1:{    

                    do {
                        System.out.print("Escribe un símbolo: ");
                        t = s.next();

                        System.out.print("Introduce un valor entero positivo:");
                        x = s.nextInt();

                        if (x < 0) {
                            System.out.println("El valor debe ser un numero igual o mayor a cero.");
                        }
                    } while (x < 0);
                    
                    f1(x, t.charAt(0));
                } break;

                case 2: {
                    System.out.print("Escribe un símbolo: ");
                    t = s.next();
                    System.out.println("Introduce un valor positivo e impar:");
                    j = t.charAt(0) ;
                    a = s.nextInt();
                    if (a > 0 && a % 2 != 0) {
                    f2(a,j);
                    } else {
                        System.out.println("El valor debe ser positivo e impar.");
                    }
                } break;

                case 0:{

                }break;

                default: {
                    System.out.println("Opción no válida");
                } break;

            }

        } while (M != 0);

        } catch(Exception e) {
        System.out.println("**Se ha producido un error en la inserción de datos.");
        } finally {
        s.close();
        }

    }

    private static void f1(int r, char f) {
        //VARIABLES:
        int i;
        int j;

        for (i = -r; i <= r; i++) {
            for (j = r; j <= r; j++) {
                if (i * i + j * j <= r * r && i * i + j * j > (r - 2) * (r - 1)) {
                    System.out.printf("%s ", f);
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println("");
        }
    }

    private static void f2(float a, char w) {
        //VARIABLES:
        int e;
        int i;
        int j;

        e = (int) a / 2;
        for (i = 0; i < a; i++) {
            for (j = 0; j < a; j++) {
                if (i < a / 2) {
                    if (j == e || j == a - e - 1) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }

                } else {
                    if (j == e || j == a - e - 1) {
                        System.out.print(w);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }

        if (i < a / 2) {
            e--;
        } else {
            e++;
        }
        System.out.println("");
    }
}