/*
Get trae
Set Setea
 */

package Logica;

public class GetSetPOO {

    public static void main(String[] args) {
        Alumno alumno1 = new Alumno();
        Alumno alumno2 = new Alumno(34, "Lisa", "Ara");
        
        System.out.println("La id de la alumna 2 es: " + alumno2.getId());
        System.out.println("El nombre de la alumna 2 es: " + alumno2.getNombre());
        System.out.println("El apellida de la alumna 2: " + alumno2.getApellido());
        
        System.out.println("-------------------");
        
        alumno1.setId(37);
        alumno1.setNombre("Fed");
        alumno1.setApellido("Sancha");
       
        System.out.println("La id de la alumna 1 es: " + alumno1.getId());
        System.out.println("El nombre de la alumna 1 es: " + alumno1.getNombre());
        System.out.println("El apellida de la alumna 1: " + alumno1.getApellido());
          
        System.out.println("-------------------");
        //acá cambio de valor
        alumno2.setId(35);
        
        System.out.println("La id de la alumna 2 es: " + alumno2.getId());
        System.out.println("El nombre de la alumna 2 es: " + alumno2.getNombre());
        System.out.println("El apellida de la alumna 2: " + alumno2.getApellido());
        
        
    }
    
    
}
