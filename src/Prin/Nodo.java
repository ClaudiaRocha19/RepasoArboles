/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Prin;

/**
 *
 * @author cmrocha
 */
public class Nodo {
    private int dato;
    private Nodo nodo_izq,nodo_der;
    public String toString(){
        return String.valueOf(dato);
    }
    public Nodo(int dato, Nodo nodo_izq, Nodo nodo_der) {
        this.dato = dato;
        this.nodo_izq = nodo_izq;
        this.nodo_der = nodo_der;
    }

    public Nodo(int dato) {
        this.dato = dato;
    }
    
    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setNodo_izq(Nodo nodo_izq) {
        this.nodo_izq = nodo_izq;
    }
    public int Fbalanceo(Nodo nodo){
        return altura(nodo.nodo_der)-altura(nodo.nodo_izq);
    }
    public int altura(Nodo raiz){
        if (raiz == null) {
            return -1;
        }else{
            return Math.max(altura(raiz.nodo_der), altura(raiz.nodo_izq));
        }
    }
    public int altura(){
        return altura(this);
    }
    public void setNodo_der(Nodo nodo_der) {
        this.nodo_der = nodo_der;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getNodo_izq() {
        return nodo_izq;
    }

    public Nodo getNodo_der() {
        return nodo_der;
    }
    
    
    
}
