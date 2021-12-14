package Analizadores;

import java.util.Stack;

public class Pila{
    public Stack pila;

    public Pila (){
        pila = new Stack();
    }

    public void apilar (int n){
        pila.push(n);
    }

    public void desapilar (){
        pila.pop();
    }

    public int verCima(){
        /*int ultimoE = Integer.parseInt(pila.peek().toString());
        return ultimoE;*/
        return ((Integer)pila.lastElement()).intValue();
    }

}