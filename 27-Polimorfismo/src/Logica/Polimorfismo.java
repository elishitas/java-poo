/*
 En este vector tengo que guardar -> Consultor, Empleado, Jefe.
No podemos mezclar tipos de datos pero con polimorfismo podemos mezclar datos
Persona vector -> new persona con 5 posiciones

Persona es clase madre
Empleado, Consultor, Jefe clases hijas entonces se puede guardar.
-asignaciones-
 */
package Logica;

public class Polimorfismo {

    public static void main(String[] args) {
        
        Persona vector[] = new Persona [5];
        vector [0] = new Persona ();
        vector [1] = new Empleado();
        vector [2] = new Consultor();
        vector [3] = new Jefe ();
        //vector [4] = "Hola"; Aca tira error porque es de otro tipo
        
        Persona perso = new Persona ();
        Consultor consul = new Consultor ();
        
        perso = consul;
        //consul = perso; Clase hija no puede tomar la clase padre
        
        
    }
    
    
}
