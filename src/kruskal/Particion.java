package kruskal;

public class Particion {
    
    int[] conjunto = null;
    
    public static void inicializa (int[] conjunto, int n){
        for (int i = 0; i < conjunto.length; i++) {
            conjunto[i] = 0;
        }
    }
    
    public static int buscar (int[] conjunto, int n, int x){
        int i = x;
        
        while(conjunto[i] > 0){
            i = conjunto[i];
        }
        return i;
    }
    
    
    public static void fusionar(int[] conjunto, int n, int a, int b){
        if(conjunto[a] == conjunto[b]){
            conjunto[a] -= 1;
            conjunto[b] = a;
        }else{
            if(conjunto[a] < conjunto[b]){
                conjunto[b] = a;
            }else{
                conjunto[a] = b;
            }
            
        }
            
    
    }
}
