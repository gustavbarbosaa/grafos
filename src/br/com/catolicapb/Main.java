package br.com.catolicapb;

import br.com.catolicapb.grafo.Grafo;

public class Main {
    public static void main(String[] args) {
        Grafo grafo = new Grafo(4);
        grafo.adicionarAresta(0,1);
        grafo.adicionarAresta(0,3);
        grafo.adicionarAresta(1,2);
        grafo.adicionarAresta(2,3);
        grafo.exibirGrafo();

        if (grafo.verificarCiclo()) {
            System.out.println("existe ciclo");
        } else {
            System.out.println("não existe ciclo");
        }
    }
}
