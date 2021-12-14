package Analizadores;

//Esta clase contiene la tabla de simbolos
import java.util.*;

public class TablaSimbolos {
    private Vector<Simbolo> tablaDeSimbolos;
    private Vector tablaDeTipos;

    public TablaSimbolos() {
        //Se inicializa la taba de tipo y de simbolos
        tablaDeSimbolos = new Vector();
        tablaDeTipos = new Vector();
        //Se inserta el tipo "int" que es el unico que se ocupara
	insertarTipo("int");
    }

    // Inserta un tipo
    public void insertarTipo(String identificador){
        //tablaDeTipos.add(tipo);
        Tipo tipo=new Tipo(sizeTipo(), identificador);
        tablaDeTipos.add(tipo); 
    }

    // Se agrega un simbolo
     public void insertarSimbolo(String identificador) {
        Simbolo sim=new Simbolo(identificador, sizeSimbolos());
        tablaDeSimbolos.add(sim);
        System.out.println("Nombre: " + identificador + " Codigo: " + (sizeSimbolos() - 1));
    } 

    // ¿Existe un simbolo?
    public boolean existe(String identificador) {
        if(getSimbolo(identificador)!=null) return true;
        return false;
    }

    // Obtener un simbolo a partir de su id
    public Simbolo getSimbolo(String identificador) {
        Simbolo simbolo = null;
         
        for(Simbolo s:tablaDeSimbolos){
           
            if (s.getNombre().equals(identificador))return s; 
        }
        return simbolo;
        
    }
    
    public int sizeSimbolos(){
        return tablaDeSimbolos.size();
    }
    
    public int sizeTipo(){
        return tablaDeTipos.size();
    }

    
}
