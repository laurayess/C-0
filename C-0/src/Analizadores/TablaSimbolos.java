package Analizadores;

//Esta clase contiene la tabla de simbolos
import java.util.*;

public class TablaSimbolos {
    private Vector<Simbolo> tablaSimbolos;
    private Vector tablaTipos;

    public TablaSimbolos() {
        //Se inicializa la taba de tipo y de simbolos
        tablaSimbolos = new Vector();
        tablaTipos = new Vector();
        //Se inserta el tipo "int" que es el unico que se ocupara
	insertarTipo("int");
    }

    // Inserta un tipo
    public void insertarTipo(String tipo){
        tablaTipos.add(tipo);
    }

    // Se agrega un simbolo
     public void addSimbolo(String identificador) {
        Simbolo sim=new Simbolo(identificador, 5);
        tablaSimbolos.add(sim); 
            
    } 

    // ¿Existe un simbolo?
    public boolean existe(String identificador) {
        if(getSimbolo(identificador)!=null) return true;
        return false;
    }

    // Obtener un simbolo a partir de su id
    public Simbolo getSimbolo(String identificador) {
        Simbolo simbolo = null;
         
        for(Simbolo s:tablaSimbolos){
           
            if (s.getNombre().equals(identificador))return s; 
        }
        return simbolo;
    }

    
}
