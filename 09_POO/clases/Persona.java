package clases;

public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private String dni;
    private int edad;

    //El metodo "get" devuelve un resultado.
    
    public Persona() {}

    public Persona(String dni) {
        this.dni = dni;
    }

    public abstract void gritar();
    
    public String getNombre() {
        return this.nombre;
    }

    public String getApellido() {
        return this.apellido;
    }

    public String getDni() {
        return this.dni;
    }

    public int getEdad() {
        return this.edad;
    }

    //El metodo "set" establece una variable.
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String toString() {
        return this.nombre + " " + this.apellido;
    }
    
    public void setEdad(int edad) {
        this.edad = edad;
    }
}
