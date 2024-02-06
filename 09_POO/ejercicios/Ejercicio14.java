package ejercicios;

public class Ejercicio14 {
    public static void main(String[] args) {
        //VARIABLES:
        final char SEPARADOR = '|';

        int nota;
        int primeraNota = 0;
        int compas;
        int compasRandom = ((int) (Math.random() * 7) + 1);
        int notaRandom;

        for (compas = 0; compas <= compasRandom ; compas++) {
            for (nota = 0; nota < 4 ; nota++) {
                notaRandom = ((int) (Math.random() * 7));

                    if (compas == compasRandom && nota == 3) {notaRandom = primeraNota;}
                    switch (notaRandom) {
                        case 0:
                            System.out.print("do ");
                        break;

                        case 1:
                            System.out.print("re ");
                        break;

                        case 2:
                            System.out.print("mi ");
                        break;

                        case 3:
                            System.out.print("fa ");
                        break;

                        case 4:
                            System.out.print("sol ");
                        break;

                        case 5:
                            System.out.print("la ");
                        break;

                        case 6:
                            System.out.print("si ");
                        break;
                    }

                    if (compas == 0 && nota == 0) {
                        primeraNota = notaRandom;
                    }

            }
            System.out.printf("%c ", SEPARADOR);
        }

        System.out.println(SEPARADOR);
    }
}
