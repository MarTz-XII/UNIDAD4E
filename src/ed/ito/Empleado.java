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
public class Empleado <E> {
    
  private NodoArbol <E> raiz;
    
  public int id;
  public String nombre;
  public String puesto;
  public float sueldo;
  
  NodoArbol <E>Der;
  NodoArbol <E>Izq;
  
  public Empleado (int id, String nombre, String puesto, float sueldo){
      this.id=id;
      this.nombre=nombre;
      this.puesto=puesto;
      this.sueldo=sueldo;
      Der=null;
      Izq=null;
      
      
  }
  public void mostrar(){
      System.out.println("id: "+id+ "Nombre: "+nombre+ "Puesto "+puesto);  
      System.out.println("Sueldo"+sueldo);
  }  
  
    public static void main(String[] args) {
        
        Arbol n = new Arbol(); 
         n.add(n, 34454, "Luis", "Presidente", 5000);
         n.add(n, 56567, "Pedro", "Diputado", 3000);
         
    }
  
   
    }
    
     
    
 
    

    
     
 
    
    


    
    

