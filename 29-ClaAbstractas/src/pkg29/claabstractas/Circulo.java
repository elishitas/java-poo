
package pkg29.claabstractas;


public class Circulo extends Figura {
    //1.
    private double radio;
    
    //2.

    public Circulo() {
    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    public Circulo(double radio, double y, double x) {
        super(y, x);
        this.radio = radio;
    }
    
    
    //0.
    @Override
    public double calcularArea() {
        double pi = 3.14;
        double resultado = pi * radio * radio;
        return resultado;
    }
        
}
