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
        
        System.out.println("Recorrido en PreOrden: " + arbol.preOrden());
        System.out.println("Recorrido en InOrden: " + arbol.inOrden());
        System.out.println("Recorrido en PostOrden: " + arbol.postOrden());
        
        String[] consultas = ManejadorArchivosGenerico.leerArchivo("src/consultaPrueba.txt");
        String[] resConsultas = new String[consultas.length];
        for (int i = 0; i < consultas.length; i++){
            if (arbol.buscarCont(Integer.parseInt(consultas[i])) != null){
                resConsultas[i] = "clave: " + arbol.buscarCont(Integer.parseInt(consultas[i])).getEtiqueta().toString() + " contador: " + arbol.cont[0]; 
            }
            else{
                resConsultas[i] = "";
            }
            System.out.println(resConsultas[i]);
        }
        ManejadorArchivosGenerico.escribirArchivo("src/resultadoConsultas.txt", resConsultas);
        // Modificamos el método escribirArchivo de la clase ManejadorArchivosGenerico para que imprima en el archivo de texto en un formato más amigable a la vista
    }
    
}
