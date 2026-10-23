package aula03;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Main{
public static void main(String[] args) {

    // Array (SÃO ESTATICOS)

    System.out.println("---------------Array-----------");

    String [] nomeNinjaArray = new String[5];
    nomeNinjaArray[0] = "Naruto";
    nomeNinjaArray[1] = "Wallyson";
    nomeNinjaArray[2] = "Helena";
    nomeNinjaArray[3] = "Natan";
    nomeNinjaArray[4] = "Fabio";

    System.out.println("Ninja: " + nomeNinjaArray[0]);

    //Array list (ELA É UM POUCO MAIS LENTA, SÃO MAIS FLEXIVEIS E MAIS USADAS)

    System.out.println("---------------Listas-----------");

    List<String> listaDeNinjas = new ArrayList<>();
    listaDeNinjas.add("Naruto");
    listaDeNinjas.add("Sasuke");
    listaDeNinjas.add("Wally");
    listaDeNinjas.add("Helena");
    listaDeNinjas.add("Natan");

    System.out.println(listaDeNinjas);

    //O Stacks são como pilhas, literalmente como uma pilha de algo, entao se eu crio uma lista 1,2,3 e 4, o 1 era o primeiro, quando coloco o dois ele fica em cima do 1 e sucessivamente, entao quando removo um item, o item removido é o ultimo a ser inserido

    System.out.println("---------------Stacks-----------");

    Stack<String> listaDeNinjaStack = new Stack<>();
    listaDeNinjaStack.push("Naruto");    
    listaDeNinjaStack.push("Wally");    
    listaDeNinjaStack.push("Natan");    
    listaDeNinjaStack.push("Matheus");    
    listaDeNinjaStack.push("Helena");  

    System.out.println("Mostrar pila de itens: " + listaDeNinjaStack);

    System.out.println("Tirar da pilha: " + listaDeNinjaStack.pop());
    System.out.println(listaDeNinjaStack);
    //O pekk mostrar qual o ultimo elemento da pilha, mas nao remove
    System.out.println(listaDeNinjaStack.peek());

     //Linked list Queue, ela é como se fosse uma fila, vamos trabalhar com cabeça e rabo, como se fosse uma cobra

        System.out.println("---------------queue-----------");

        Queue<String> listaQueue = new LinkedList<>();
        listaQueue.add("Narruto");
        listaQueue.add("Wally");
        listaQueue.add("Natan");
        listaQueue.add("Natalia");
        listaQueue.add("Joao");

        //mostrar fila 

        System.out.println("Lista: "+ listaQueue);

        //tirar um ninja da fila

        listaQueue.poll();

        System.out.println("fila de ninja depois do poll: "+ listaQueue );

        //como ver quem é o primeiro
        System.out.println(listaQueue.peek());

        //o primeiro  a entrar é o primeiro a sair!!!
        
        



    
}}