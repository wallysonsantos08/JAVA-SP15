package aula02;

public class Circulo  extends Forma{

    double raio;

    
    Circulo (double raio){
        this.raio = raio;
    }
    

    @Override
    double area() {
        return Math.PI * raio * raio;
    }


    @Override
    String mostrarArea() {
        System.out.println("Sua area é de"+area());
    }

   
    
}
