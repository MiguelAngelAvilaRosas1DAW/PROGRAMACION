package clases;

public class Profesor extends Persona{

    public String dni = "12345678F";

    /**
     * Constructor de la clase padre que llama a la clase padre.
     */
        public Profesor() {
            super();
        }

        public Profesor(String dni) {
            super(dni);
        }

        public void gritar() {
            System.out.println("OOOOOOOOHHHH!!!");
        }
}