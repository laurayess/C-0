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
        int ultimoE = pila.peek();
        return ultimoE;
    }

}