package br.com.catolicapb.grafo;

public class Grafo {
    private final int[][] matrizAdjacencia;
    private final int vertices;

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

    public boolean existeCiclo(int v, boolean[] visitado, int parente) {
        visitado[v] = true;

        for (int i = 0; i < vertices; i++) {

            System.out.println(i + " " +  visitado[i]);

            if (matrizAdjacencia[v][i] == 1) {
                if (!visitado[i]) {
                    if (existeCiclo(i, visitado, v)) {
                        System.out.println("entrei aqui");
                        return true;
                    }
                } else if (i != parente) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean verificarCiclo() {
        boolean[] visitado = new boolean[vertices];

        for (int i = 0; i < vertices; i++) {
            if (!visitado[i]) {
                if (existeCiclo(i, visitado, -1)) {
                    return true;
                }
            }
        }
        return false;
    }
}
