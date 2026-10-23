package aula02;

public class Retangulo extends Forma {

    double base;
    double altura;

    Retangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    @Override
    double area() {
        return base * altura;
    }
    
}
