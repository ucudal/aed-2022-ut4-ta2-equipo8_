package TA2;

public class TElementoAB<T> implements IElementoAB<T> {

    private Comparable etiqueta;
    private TElementoAB hijoIzq;
    private TElementoAB hijoDer;
    private T datos;

    /**
     * @param unaEtiqueta
     * @param unosDatos
     * @return
     */
    @SuppressWarnings("unchecked")
    public TElementoAB(Comparable unaEtiqueta, T unosDatos) {
        etiqueta = unaEtiqueta;
        datos = unosDatos;
    }

    @Override
    public Comparable getEtiqueta() {
        return this.etiqueta;
    }

    @Override
    public TElementoAB<T> getHijoIzq() {
        return this.hijoIzq;
    }

    @Override
    public TElementoAB<T> getHijoDer() {
        return this.hijoDer;
    }

    @Override
    public void setHijoIzq(TElementoAB<T> elemento) {
        this.hijoIzq = elemento;
    }

    @Override
    public void setHijoDer(TElementoAB<T> elemento) {
        this.hijoDer = elemento;
    }

    @Override
    public TElementoAB<T> buscar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public boolean insertar(TElementoAB<T> elemento, int[] cont) {
        cont[0]++;
        if (this.etiqueta.equals(elemento.getEtiqueta())) {      //El elemento ya existe en el arbol
            cont[0] = 0;
            return false;
        }
        if (this.etiqueta.compareTo(elemento.getEtiqueta()) > 0) {   //La etiqueta del elemento es menor a la del nodo en el que estoy
            if (this.hijoIzq == null) {
                this.hijoIzq = elemento;
                return true;
            } else {
                return this.hijoIzq.insertar(elemento, cont);
            }
        } else {                                                       //La etiqueta del elemento es mayor a la del nodo en el que estoy
            if (this.hijoDer == null) {
                this.hijoDer = elemento;
                return true;
            } else {
                return this.hijoDer.insertar(elemento, cont);
            }
        }
    }

    @Override
    public String preOrden() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.getEtiqueta().toString() + ", ");
        if (this.hijoIzq != null) {
            sb.append(this.hijoIzq.preOrden());
        }
        if (this.hijoDer != null) {
            sb.append(this.hijoDer.preOrden());
        }
        return sb.toString();
    }

    @Override
    public String inOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public String postOrden() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public T getDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public TElementoAB eliminar(Comparable unaEtiqueta) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean insertar(TElementoAB<T> elemento) {
        if (this.etiqueta.equals(elemento.getEtiqueta())) {      //El elemento ya existe en el arbol
            return false;
        }
        if (this.etiqueta.compareTo(elemento.getEtiqueta()) > 0) {   //La etiqueta del elemento es menor a la del nodo en el que estoy
            if (this.hijoIzq == null) {
                this.hijoIzq = elemento;
                return true;
            } else {
                return this.hijoIzq.insertar(elemento);
            }
        } else {                                                       //La etiqueta del elemento es mayor a la del nodo en el que estoy
            if (this.hijoDer == null) {
                this.hijoDer = elemento;
                return true;
            } else {
                return this.hijoDer.insertar(elemento);
            }
        }
    }

}
