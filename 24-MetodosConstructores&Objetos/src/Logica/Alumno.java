/*
Constructores y Objetos Metodo Alumno

 */
package Logica;

/**
 *
 * @author eli
 */
public class Alumno {
    int id;
    String nombre;
    String apellido;

    public Alumno() {
    }

    public Alumno(int id, String nombre, String apellido) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
    }
    
    
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
