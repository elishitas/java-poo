
package Logica;


public class Consultor extends Persona {
    int id_consultora;
    String nombre_consultora;

    public Consultor() {
    }

    public Consultor(int id_consultora, String nombre_consultora, int id, String nombre, String apellido, String domicilio, int telefono) {
        super(id, nombre, apellido, domicilio, telefono);
        this.id_consultora = id_consultora;
        this.nombre_consultora = nombre_consultora;
    }

    public int getId_consultora() {
        return id_consultora;
    }

    public void setId_consultora(int id_consultora) {
        this.id_consultora = id_consultora;
    }

    public String getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(String nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
