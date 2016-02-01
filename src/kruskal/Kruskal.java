package kruskal;

public class Kruskal {

    public static void main(String[] args) {
        Grafo grafo = new Grafo(7);
        grafo.añadirArista(1,2,1);
        grafo.añadirArista(1,5,6);
        grafo.añadirArista(1,4,4);
        grafo.añadirArista(2,2,3);
        grafo.añadirArista(2,4,5);
        grafo.añadirArista(3,6,6);
        grafo.añadirArista(3,4,5);
        grafo.añadirArista(3,4,7);
        grafo.añadirArista(4,3,5);
        grafo.añadirArista(4,4,7);
        grafo.añadirArista(5,7,7);
        grafo.añadirArista(5,6,8);
        grafo.añadirArista(6,3,7);
        
        for (int i = 0; i<7; i++){
            for(int j = 0; j<7; j++){
                System.out.println(grafo.aristas[i][j]);
            }
        }
    }
    Particion particion = new Particion();
    
    
}
