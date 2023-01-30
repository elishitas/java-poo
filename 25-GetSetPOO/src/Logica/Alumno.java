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
    
    //4- Objeto - Es una instacia de una clase
    //Constructor
    //4.1 main
    
    public Alumno() { //constructor vacio
    }

    public Alumno(int id, String nombre, String apellido) { //constructor con parametros
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    //5-Get y Setter con Insert Code
    //5.1 main

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

