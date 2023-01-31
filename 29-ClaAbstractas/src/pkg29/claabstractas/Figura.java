package pkg29.claabstractas;

//clase madre
//avisar que es abstract

public abstract class Figura {
    
    //0.Clases - Caracteristicas/Atributos-
    protected double y; //pos en x
    protected double x; //pos en y
    
    //2.Constructor
    protected Figura() {
    }

    protected Figura(double y, double x) {
        this.y = y;
        this.x = x;
    }
    
    //1.metodo
    //Declaro el metodo(sin llaves) y no pongo su implementacion
    public abstract double calcularArea();
    
    
    
    
}
