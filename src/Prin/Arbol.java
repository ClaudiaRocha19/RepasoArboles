/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prin;

import java.util.ArrayList;

/**
 *
 * @author cmrocha
 */
public class Arbol {
    Nodo raiz;
    String inorden = "";
    String preorden = "";
    String postorden = "";
    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }
    public Arbol(){
     
    }
    private void Insertar(int dato, Nodo nodop){
        if (raiz == null) {
            raiz = new Nodo(dato);
        }else{
            if (dato > nodop.getDato()) {
                if (nodop.getNodo_der()!= null) {
                    Insertar(dato,nodop.getNodo_der());
                }else{
                    nodop.setNodo_der(new Nodo(dato));
                }
            }
            if (dato < nodop.getDato()) {
                if (nodop.getNodo_izq()!= null) {
                    Insertar(dato,nodop.getNodo_izq());
                }else{
                    nodop.setNodo_izq(new Nodo(dato));
                }
            }
        }
    }
    public void Insertar(int dato){
        Insertar(dato,raiz);
    }                                                                                                                 
    public int FbalanceArbol(Nodo raiz){
        return (raiz.Fbalanceo(raiz));
    }
    public void Preorden(Nodo raiz){
        if (raiz != null) {
            
            preorden += raiz.toString()+" ";;
            
            Preorden(raiz.getNodo_izq());
            Preorden(raiz.getNodo_der());
        } 
    }

    public void setInorden(String inorden) {
        this.inorden = inorden;
    }

    public void setPreorden(String preorden) {
        this.preorden = preorden;
    }

    public void setPostorden(String postorden) {
        this.postorden = postorden;
    }
    public void Inorden(Nodo raiz){
        if (raiz != null) {
            Inorden(raiz.getNodo_izq());
//            System.out.println(raiz.getDato());
            
            inorden += raiz.toString()+" ";
            Inorden(raiz.getNodo_der());
        }
    }
    public void Postorden(Nodo raiz){
        if (raiz != null) {
            Postorden(raiz.getNodo_izq());
            Postorden(raiz.getNodo_der());
            
            postorden += raiz.toString()+" ";
        }
    }
    public void Niveles(Nodo raiz){
        ArrayList<Nodo> cola = new ArrayList<>();
        cola.add(raiz);
        while(!cola.isEmpty()){
            System.out.println(cola.get(0));
            
            if (cola.get(0).getNodo_izq()!= null) {
                cola.add(cola.get(0).getNodo_izq());
            }
            if (cola.get(0).getNodo_der()!= null) {
                cola.add(cola.get(0).getNodo_der());
            }
            cola.remove(0);
        }
    }
    public void Niveles(){
        Niveles(raiz);
    }
    public void Preorden(){
        Preorden(raiz);
    }
    public void Inorden(){
        Inorden(raiz);
    }
    public void Postorden(){
        Postorden(raiz);
    }
}
