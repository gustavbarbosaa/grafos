package br.com.catolicapb;

import br.com.catolicapb.grafo.Grafo;
import br.com.catolicapb.grafoDirecionado.GrafoDirecionado;

public class Main {
    public static void main(String[] args) {
//        Grafo grafo = new Grafo(4);
//        grafo.adicionarAresta(0,1);
//        grafo.adicionarAresta(0,3);
//        grafo.adicionarAresta(1,2);
//        grafo.adicionarAresta(2,3);
//        grafo.exibirGrafo();
//
//        if (grafo.verificarCiclo()) {
//            System.out.println("existe ciclo");
//        } else {
//            System.out.println("não existe ciclo");
//        }

        GrafoDirecionado grafo = new GrafoDirecionado(5);

        grafo.adicionarAresta(0, 1);
        grafo.adicionarAresta(0, 2);
        grafo.adicionarAresta(1, 2);
        grafo.adicionarAresta(2, 0);
        grafo.adicionarAresta(2, 3);
        grafo.adicionarAresta(3, 3);

        System.out.println("Lista de Adjacência do Grafo:");
        grafo.exibirGrafoLista();

        grafo.removerAresta(2, 0);

        System.out.println("Lista de Adjacência do Grafo após remover a aresta (2, 0):");
        grafo.exibirGrafoLista();
    }
}
