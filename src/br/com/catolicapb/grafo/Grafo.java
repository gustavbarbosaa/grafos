package br.com.catolicapb.grafo;

public class Grafo {
    private int[][] matrizAdjacencia;
    private int vertices;

    public Grafo (int numVertices){
        this.vertices = numVertices;
        matrizAdjacencia = new int[numVertices][numVertices];
    }

    public void adicionarAresta(int verticeOrigem, int verticeDestino){
        matrizAdjacencia[verticeOrigem][verticeDestino] = 1;
        matrizAdjacencia[verticeDestino][verticeOrigem] = 1;
    }

    public void removerAresta(int verticeOrigem, int verticeDestino){
        matrizAdjacencia[verticeOrigem][verticeDestino] = 0;
        matrizAdjacencia[verticeDestino][verticeOrigem] = 0;
    }

    public void exibirGrafo() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(matrizAdjacencia[i][j] + " ");
            }
            System.out.println();
        }
    }
}
