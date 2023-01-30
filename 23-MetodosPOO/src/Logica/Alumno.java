/*
Metodo Alumno

 */
package Logica;

public class Alumno {
    
    int id;
    String nombre;
    String apellido;
    
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
