/*
 */
package LogicaHerencia;

public class Persona {
    //2- La plantilla de la clase
    int id;
    String dni;
    String nombre;
    String domicilio;
    String telefono;
    
    //4- objeto

    public Persona() {
    }

    public Persona(int id, String dni, String nombre, String domicilio, String telefono) {
        this.id = id;
        this.dni = dni;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.telefono = telefono;
    }
    

    //5-get y set    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    //3-metodo -comportantimiento -todavia no lo tiene-
    
    
}
