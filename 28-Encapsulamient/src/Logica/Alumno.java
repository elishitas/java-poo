//public desde cualquier clase podemos acceder a ese metodo
//Tmb a los atributos
// Por estandar todos los atributos de una clase deben ser privados
//para protegerlos
package Logica;

public class Alumno {
    //int id;
    //String nombre;
    //String apellido;
    //-> Ahora lo cambiamos a privado
    private int id;
    private String nombre;
    private String apellido;

    
    //Lo puedo usar porque mi constructor es publico
    //Si alumno es hija de persona como en el ej anterior se puede usar:
    //Protected
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
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
}
