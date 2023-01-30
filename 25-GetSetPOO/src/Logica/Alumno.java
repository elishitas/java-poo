/*

Get & Set  Alumno
Get trae
Set Setea

 */
package Logica;
//(1) POO
public class Alumno {
    
    //2-Creacion de clase
    int id;
    String nombre;
    String apellido;
    
    //4 - Instanciamos la clase para la creacion del objeto -> Luego vas al main
    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //5-Get y Set -> Luego lo llamo en el main

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    
    
    //3-metodos
        public void mostrarNombre(){
        System.out.println("Hola, soy un alumno y se mostrar mi nombre");
        
    }
    
    public void saberAprobado(double calificacion){
        
        if(calificacion >= 6){
            System.out.println("Aprobe la materia!");
        }
        else{
            System.out.println("Uh! No aprobé ");
        }
    }
}
