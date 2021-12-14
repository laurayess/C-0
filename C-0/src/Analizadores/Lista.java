package Analizadores;

import java.util.ArrayList;
import java.util.List;

public class Lista{
    public List lista;

    public Lista(){
        lista = new List();
    }

    public void addCadena(String cad){
        lista.add(cad);
    }

    public String getCadena(int i){
        return lista.get(i);
    }

    public int size(){
        return lista.size();
    }
}