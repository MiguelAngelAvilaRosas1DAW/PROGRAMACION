import clases.Alumno;
import clases.Persona;


public class CentroEducativo {

    private static final int MAXALUMNOS = 100 ;
    public static void main(String[] args) {
       
        int opcion;
        int num = 0;
        Alumno[] alumnos = new Alumno[MAXALUMNOS] ;

        do {
            
            menu() ;

            System.out.print("Opción? ") ;
            opcion = Integer.parseInt(System.console().readLine()) ;

            switch (opcion) {
                case 1:
                    introducirAlumno(alumnos, num);
                    num++;
                break;

                case 2:
                    modificarAlumno(alumnos);
                break;

                case 3:
                    buscarAlumno(alumnos);
                break;

                case 4:
                    mostrarListado(alumnos, num);
                break;
            }
        } while (opcion!=0) ;

    }

    /**
     * Muestra un menú en pantalla
     */
    public static void menu() {

        System.out.println("CENTRO EDUCATIVO HEDY LAMARR") ;
        System.out.println("============================") ;
        System.out.println("0. Salir") ;
        System.out.println("1. Introducir alumno") ;
        System.out.println("2. Modificar alumno *****") ;
        System.out.println("3. Buscar alumno por dni") ;
        System.out.println("4. Mostrar listado de alumnos") ;

    }

    /**
     * introducirAlumno:
     * Solicita los datos de un alumno, lo crea e introduce 
     * en el array.
     */
    public static void introducirAlumno(Alumno[] alumnos,int num) {
        //VARIABLES:
        String nombre;
        String apellido;
        String dni;
        int edad;

        

        //Pedimos los datos al usuario:
        System.out.print("Introduce el nombre: ");
        nombre = System.console().readLine();

        System.out.print("Introduce el apellido: ");
        apellido = System.console().readLine();

        System.out.print("Introduce el DNI: ");
        dni = System.console().readLine();

        System.out.print("Introduce el edad: ");
        edad = Integer.parseInt(System.console().readLine());

        //Introducimos los datos del alumno:
        alumnos[num] = new Alumno(dni);
        alumnos[num].setNombre(nombre);
        alumnos[num].setApellido(apellido);
        alumnos[num].setEdad(edad);
    }

    /**
     * modificarAlumno:
     * Modifica los datos de un alumno anterior con nuevos datos, buscandolo apartir de su DNI.
     */
    public static void modificarAlumno(Alumno[] alumnos) {
        //VARIABLES:
        String dniBuscador;
        boolean dniEncontrado = false;
        int num;

        System.out.print("Introduzca el DNI del alumno: ");
        dniBuscador = System.console().readLine();

        for (num = 0 ; num < MAXALUMNOS && dniEncontrado == false; num++) {
            if (alumnos[num].getDni().equals(dniBuscador)) {
                dniEncontrado = true;
            }
            
        }
        if (dniEncontrado == true) {
            introducirAlumno(alumnos, num);
        }
        else {
            System.out.println("El DNI no fue encontrado.");
        }
        
    }
    /**
     * BuscarAlumno:
     * Solicita el DNI del alumno y lo busca en el array.
     * Si lo encuentra, muestra la información del alumno;
     * en otro caso, se indica que no se ha encontrado.
     */
    
     public static void buscarAlumno(Alumno[] alumnos) {
        //VARIABLES:
        String dniBuscador;
        boolean dniEncontrado = false;
        int num;

        System.out.print("Introduzca el nombre del alumno: ");
        dniBuscador = System.console().readLine();

        for (num = 0 ; num < MAXALUMNOS && dniEncontrado == false; num++) {
            if (alumnos[num].getDni() == dniBuscador) {
                dniEncontrado = true;
            }
            
        }
        if (dniEncontrado == true) {
            mostrarListado(alumnos, num);
        }
        else {
            System.out.println("El DNI no fue encontrado.");
        }
     }

     /**
      * mostrarListado :
      * Muestra un listado de todos los alumnos almacenados
      * en el array, separando cada uno de ellos por una 
      * línea.
      * 12345678A, Pedro Pérez, 18 años
      * ---------
      * 23456789B, Alicia Gutiérrez, 22 años
      */
     public static void mostrarListado(Alumno[] alumnos,int num) {
        int x;

        for (x = 0 ; x <= num ; x++) {
            System.out.printf("%s, %s %s, %d años\n", alumnos[num].getDni(), alumnos[num].getNombre(), alumnos[num].getApellido(), alumnos[num].getEdad());
            System.out.println("---------");
        }
     }

}
