package Logica;

public class Encapsulamient {


    public static void main(String[] args) {
        
        System.out.println("Hola Alumno!");
        System.out.println("---------------------");
        
        Alumno alumno1 = new Alumno(4, "Li", "Ara");
        Alumno alumno2 = new Alumno();
        
        System.out.println("id: " + alumno1.getId());
        System.out.println("Nombre: " + alumno1.getNombre());
        System.out.println("Apellido: " + alumno1.getApellido());
    }
    
}
