package clases;

public class Alumno extends Persona{

    public String dni = "12345678F";

    /**
     * Constructor de la clase padre que llama a la clase padre.
     */
        public Alumno() {
            super();
        }

        public Alumno(String dni) {
            super(dni);
        }

        public void gritar() {
            System.out.println("AAAAAAAAHHHH!!!");
        }

}