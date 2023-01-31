
package LogicaHerencia;

public class Consultor extends Persona{
    int num_consultora;
    int nombre_consultora;

    public Consultor() {
    }

    public Consultor(int num_consultora, 
            int nombre_consultora, 
            int id, 
            String dni, 
            String nombre, 
            String domicilio, 
            String telefono) {
        super(id, dni, nombre, domicilio, telefono);
        this.num_consultora = num_consultora;
        this.nombre_consultora = nombre_consultora;
    }

    public int getNum_consultora() {
        return num_consultora;
    }

    public void setNum_consultora(int num_consultora) {
        this.num_consultora = num_consultora;
    }

    public int getNombre_consultora() {
        return nombre_consultora;
    }

    public void setNombre_consultora(int nombre_consultora) {
        this.nombre_consultora = nombre_consultora;
    }

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
    
    

    
    
}
