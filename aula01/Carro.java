package aula01;
public class Carro {
    String marca;
    String modelo;
    int ano;
    String cor;

    
    Carro(String marca, String modelo, int ano, String cor){
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    Carro(){
    }

    @Override 
    public String toString(){
        return this.cor + " " +this.ano+ " " +this.marca+ " " +this.modelo;
    }


}
