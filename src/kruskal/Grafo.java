package kruskal;

public class Grafo {
       int[] vertices;
       static int[][] aristas;

    public Grafo(int n) {
        vertices = new int[n];
       aristas = new int [n][n];
    }
    
    public static void añadirArista(int vertice1, int vertice2, int peso){
        aristas[vertice1-1][vertice2-1] = peso;
    }
    
}