package Analizadores;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Lista{
    public ArrayList<String> lista;

    public Lista(){
        lista = new ArrayList<String>();
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