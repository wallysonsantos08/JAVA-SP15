package aula05;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        
        //LISTAS

        List<String> ninjas = new ArrayList<>();
        ninjas.add("Naruto");
        ninjas.add("Wallyson");
        ninjas.add("Helena");
        ninjas.add("Natan");

        System.out.println("ninjas: "+ ninjas);

        System.out.println("==========================================");

        //lista set, o set nao trabalha com ordenaçaõ ele serve para não haver duplicatas, ou seja se por acaso eu tiver dois itens repetidos, so vai contar o primeiro, e o segundo ele ira ignorar.

        Set<String> ninjasSet = new HashSet<>();

        ninjasSet.add("Naruto");
        ninjasSet.add("Wallyson");
        ninjasSet.add("Helena");
        ninjasSet.add("Naruto");

        System.out.println(ninjasSet);

        //Para remover voce deve expecficar o item, pois não tem como colocar seu indice, ou seja se eu quero remover o wallyson, eu litearlmente tenho que escrever seu nome.

        System.out.println("==========================================");

        ninjasSet.remove("Wallyson");

        System.out.println(ninjasSet);

        //Voce pode transfomar uma lista em uma lista set, exemplo:

        System.out.println("==========================================");

        List<String> listaNormal = new ArrayList<>();

        listaNormal.add("item1");
        listaNormal.add("item2");
        listaNormal.add("item3");
        listaNormal.add("item1");

        System.out.println(listaNormal);

         System.out.println("==========================================");

        Set<String> listaSet = new HashSet<>();
        listaSet.addAll(listaNormal);
        System.out.println(listaSet);

        //TreeSet, usamos quando nao  queremos uma duplicata e quando queremos uma ordem logica, se a lista for string ele vai ordenar em ordem alfabetica, se for uma lista interger, ele vai ordenar na ordem numerica, e ele pode repitir, ja o hashset nao trabalha com duplicatas, e tambem nao liga para ordenação

        System.out.println("==========================================");

        Set<String> listaTreSet = new TreeSet<>();
        listaTreSet.addAll(ninjas);
        System.out.println(listaTreSet);

        //tambem temos o linkedhashset, nao tem duplicatas, e a sua ordem é a ordem dos itens adicionados!!!

        System.out.println("==========================================");

        Set<String> listaLinkedHashSet = new LinkedHashSet<>();
        listaLinkedHashSet.addAll(ninjas);
        System.out.println(listaLinkedHashSet);

    }
}
