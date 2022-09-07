package TA2;



/**
 *
 * @author ernesto
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String[] claves1 = ManejadorArchivosGenerico.leerArchivo("src/claves1.txt");
        
        TArbolBB arbol = new TArbolBB();
        
        for(int i = 0; i < claves1.length; i++){
            TElementoAB<Integer> elemento = new TElementoAB(Integer.parseInt(claves1[i]),null);
            arbol.insertar(elemento);
        }
        
        System.out.println(arbol.preOrden());
    }
    
}
