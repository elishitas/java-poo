/*
Herencia

 */
package LogicaHerencia;

public class HerenciaPOO {

    public static void main(String[] args) {
        
        Empleado emple= new Empleado();
        
        emple.getNombre();
        emple.getNum_legajo();
        
        Consultor consul = new Consultor();
        
        consul.getNombre();
        consul.getNombre_consultora();
    }
    
}
