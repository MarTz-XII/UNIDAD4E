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
public class Arbol<E> {

    
    private NodoArbol<E> raiz,id,nombre,puesto,sueldo;
	
	public Arbol() {
		raiz=null;
                id=null;
                nombre=null;
                puesto=null;
                sueldo=null;
	}
	
	public void add(E item,int id,String nombre,String puesto, float  sueldo) {
		raiz=add(raiz,item,id,nombre,puesto,sueldo);
	}
	
	public NodoArbol<E> add(NodoArbol<E> raux,E item,int id,String nombre,String puesto,float sueldo){
		if(raux==null)
			return new NodoArbol<E>(item);
		Comparable citem=(Comparable)item;
		Comparable ritem=(Comparable)raux.getItem();
		if(citem.compareTo(ritem)<0)
				raux.setIzq(add(raux.getIzq(),item,id,nombre,puesto,sueldo));
		else if(citem.compareTo(ritem)>0)
			     raux.setDer(add(raux.getDer(),item,id,nombre,puesto,sueldo));
		return raux;     
	}
	
	
	public int cuentaHojas() {
		return cuentaHojas(raiz);
	}
	
	private int cuentaHojas(NodoArbol<E> raux) {
		if(raux==null)
			return 0;
		if(raux.getIzq()==null && raux.getDer()==null)
			return 1;
		return cuentaHojas(raux.getIzq())+cuentaHojas(raux.getDer());
	}
	
	public int altura() {
		return altura(raiz);
	}
	
	private int altura(NodoArbol<E> raux) {
		if(raux==null)
			return 0;
		int aizq=altura(raux.getIzq());
		int ader=altura(raux.getDer());
		return 1+(aizq>ader?aizq:ader); 
	}
	
	public int cuentaNodos() {
		return cuentaNodos(raiz);
	}
	
	private int cuentaNodos(NodoArbol<E> raux) {
		if(raux==null)
			return 0;
		return 1+cuentaNodos(raux.getIzq())+cuentaNodos(raux.getDer());
	}
	
	public NodoArbol<E> searchItem(E item){
		return searchItem(raiz,item);
	}
	
	private NodoArbol<E> searchItem(NodoArbol<E> raux,E item) {
		if(raux==null)
			return null;
		Comparable citem=(Comparable)item;
		Comparable ritem=(Comparable)raux.getItem();
		if(citem.compareTo(ritem)==0)
			return raux;
		if(citem.compareTo(ritem)<0)
			return searchItem(raux.getIzq(),item);
		return searchItem(raux.getDer(),item);
	}
        
       
        
        
	
	public String  getInOrden() {
		return  getInOrden(raiz,"");
	}
	
	private String  getInOrden(NodoArbol<E> raux,String a) {
		if(raux==null)
			return a;
		a=getInOrden(raux.getIzq(),a);
		a+=raux.getItem()+",";
		a=getInOrden(raux.getDer(),a);
		return a;
	}
	
	public String getPreOrden() {
		return getPreOrden(raiz,"");
	}
	
	private String getPreOrden(NodoArbol<E> raux,String a) {
		if(raux==null)
			return a;
		a+=raux.getItem()+",";
		a=getPreOrden(raux.getIzq(),a);
		a=getPreOrden(raux.getDer(),a);
		return a;
	}

	public String getPostOrden() {
		return getPostOrden(raiz,"");
	}
	
	private String getPostOrden(NodoArbol<E> raux,String a) {
		if(raux==null)
			return a;
		a=getPostOrden(raux.getIzq(),a);
		a=getPostOrden(raux.getDer(),a);
		return a+raux.getItem()+",";
	}

   
        
}

    

