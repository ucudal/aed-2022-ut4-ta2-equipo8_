package TA2;

public class TArbolBB<T> implements IArbolBB<T> {

    private TElementoAB<T> raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBB() {
        raiz = null;
    }

    @Override
    public boolean insertar(TElementoAB<T> unElemento) {
        if (!esVacia()) {
            return raiz.insertar(unElemento);
        }
        raiz = unElemento;
        return true;
    }

    public boolean insertarCont(TElementoAB<T> unElemento) {
        int[] cont = new int[1];
        cont[0] = 0;
        if (!esVacia()) {
            boolean res = raiz.insertar(unElemento, cont);
            System.out.println(cont[0]);
            return res;
        }
        raiz = unElemento;
        return true;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        if (this.raiz != null) {
            return raiz.buscar(unaEtiqueta);
        }
        return null;
    }

    public TElementoAB<T> buscarCont(Comparable unaEtiqueta) {
        int[] cont = new int[1];
        cont[0] = 0;
        if (this.raiz != null) {
            TElementoAB<T> elem = raiz.buscar(unaEtiqueta, cont);
            System.out.println(cont[0]);
            return elem;
        }
        return null;
    }

    @Override
    public String preOrden() {
        if (!esVacia()) {
            return this.raiz.preOrden();
        }
        return "";
    }

    @Override
    public String inOrden() {
        String resultado = "";
        if (this.raiz != null) {
            resultado += raiz.inOrden();
        }
        return resultado;
    }

    @Override
    public String postOrden() {
        String resultado = "";
        if (this.raiz != null) {
            resultado += raiz.postOrden();
        }
        return resultado;
    }

    @Override
    public void eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private boolean esVacia() {
        return this.raiz == null;
    }

}
