package aula04;
import java.util.LinkedList;
import java.util.Queue;


public class Main {
    public static void main(String[] args) {

    //Iniciar uma likd list

    LinkedList<Ninja> listaDeNinjas = new LinkedList<>();

    //adicionar os ninjas na minha linked list

    listaDeNinjas.add(new Ninja("Naruto", "Vila da folha", 17));

    listaDeNinjas.add(new Ninja("Wallyson", "Vila da folha", 23));

    listaDeNinjas.add(new Ninja("Helena", "Vila da folha", 22));

    listaDeNinjas.add(new Ninja("Marcos", "Vila da folha", 24));

    listaDeNinjas.add(new Ninja("Manu", "Vila da folha", 14));

    listaDeNinjas.add(new Ninja("Natalia", "Vila da folha", 33));

    listaDeNinjas.add(new Ninja("Natasha", "Vila da folha", 12));

    listaDeNinjas.add(new Ninja("Diana", "Vila da folha", 44));

    listaDeNinjas.add(new Ninja("Jose", "Vila da folha", 70));

    //listar os ninjas

    System.out.println("-------------------------");

    System.out.println("Lista de ninjas:  "+ listaDeNinjas);

    for (Ninja ninja : listaDeNinjas) {
        System.out.println(ninja);
    }

    //Adicionar o ninja no inicio da lista

    System.out.println("-------------------------");

    listaDeNinjas.addFirst(new Ninja("Messi", "Barcelona", 40));

    System.out.println(listaDeNinjas);
    
    //remover o ninja no inicio da list

    System.out.println("-------------------------");

    listaDeNinjas.removeFirst();
    System.out.println(listaDeNinjas);

    //listar os ninjas

    System.out.println("-------------------------");

    for (Ninja listaAtualizada : listaDeNinjas) {
        System.out.println(listaAtualizada);
    }

    //procurar um ninja por indice

    System.out.println("-------------------------");

    Ninja terceiroNinja = listaDeNinjas.get(2);
    System.out.println(terceiroNinja);






       

        
    }
}
