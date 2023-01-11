package Polimorfismo;

public class Circulo extends Forma{
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public double calcularCircunferencia(){

    }

    public double calcularArea(){
        return Math.PI * Math.pow(raio, 2);
    }
}
