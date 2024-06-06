package br.com.catolicapb.grafoDirecionado;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GrafoDirecionado {
    private List<List<Integer>> listaAdjacencia;
    private int numVertices;

    public GrafoDirecionado(int numVertices) {
        this.numVertices = numVertices;
        listaAdjacencia = new ArrayList<>(numVertices);
        for (int i = 0; i < numVertices; i++) {
            listaAdjacencia.add(new LinkedList<>());
        }
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino) {
        listaAdjacencia.get(verticeOrigem).add(verticeDestino);
    }

    public void removerAresta(int verticeOrigem, int verticeDestino) {
        listaAdjacencia.get(verticeOrigem).remove((Integer) verticeDestino);
    }

    public void exibirGrafo() {
        int[][] matrizAdjacencia = new int[numVertices][numVertices];
        for (int i = 0; i < numVertices; i++) {
            for (int destino : listaAdjacencia.get(i)) {
                matrizAdjacencia[i][destino] = 1;
            }
        }

        for (int i = 0; i < numVertices; i++) {
            for (int j = 0; j < numVertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void exibirGrafoLista() {
        for (int i = 0; i < numVertices; i++) {
            System.out.print(i + ": ");
            for (int adj : listaAdjacencia.get(i)) {
                System.out.print(adj + " -> ");
            }
            System.out.println("null");
        }
    }

}
