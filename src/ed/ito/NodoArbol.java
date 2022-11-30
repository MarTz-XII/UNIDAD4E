/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ed.ito;

/**
 *
 * @author Gus_m
 */
public class NodoArbol<E> {
	
	private E item;
	private NodoArbol<E> izq,der,raiz;
	
	public NodoArbol(E item) {
		this.item=item;
		this.izq=null;
		this.der=null;
	}
	public E getItem() {
		return item;
	}
	public void setItem(E item) {
		this.item = item;
	}
	public NodoArbol<E> getIzq() {
		return izq;
	}
	public void setIzq(NodoArbol<E> izq) {
		this.izq = izq;
	}
	public NodoArbol<E> getDer() {
		return der;
	}
	public void setDer(NodoArbol<E> der) {
		this.der = der;
                
	}
	public void imprimirDato() {
        System.out.println(this.getDato());
    }

    boolean getDato() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}





