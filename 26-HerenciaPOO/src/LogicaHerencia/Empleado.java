/*
 */
package LogicaHerencia;

public class Empleado extends Persona{
    
    //2-Clase
    int num_legajo;
    String cargo;
    Double sueldo;
    
    //4-Instancia con constructor -objeto-
    public Empleado() {
    }

    public Empleado(int num_legajo, 
            String cargo, 
            Double sueldo, 
            int id, 
            String dni, 
            String nombre, 
            String domicilio, 
            String telefono) {
        //super clase (clase madre)
        super(id, dni, nombre, domicilio, telefono);
        this.num_legajo = num_legajo;
        this.cargo = cargo;
        this.sueldo = sueldo;
    }
    
    //5-Get y Set

    public int getNum_legajo() {
        return num_legajo;
    }

    public void setNum_legajo(int num_legajo) {
        this.num_legajo = num_legajo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSueldo() {
        return sueldo;
    }

    public void setSueldo(Double sueldo) {
        this.sueldo = sueldo;
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
