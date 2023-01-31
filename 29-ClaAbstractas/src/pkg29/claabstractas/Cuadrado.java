
package pkg29.claabstractas;

//implementar todos los metodos abstractos
public class Cuadrado extends Figura {
    
    private double lado;

    public Cuadrado() {
    }

    public Cuadrado(double lado, double y, double x) {
        super(y, x);
        this.lado = lado;
    }
    
    

    @Override //sobreescritura de metodos -tengo el mismo metodo de mi clase madre pero lo implemento como yo quiero.
    public double calcularArea() {
        double resultado = lado * lado;
        return resultado;
    }
    
}
