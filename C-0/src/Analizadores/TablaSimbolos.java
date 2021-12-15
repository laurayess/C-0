

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
/* public class TablaSimbolos
{
    public HashMap tabla;
    public int tamano;

    public TablaSimbolos()
    {
        tabla = new HashMap();
        tamano = 0;
    }
    void setSimbolo(Simbolo s)
    {
        int cod=s.getValor();
        tabla.put(s, cod);
        setSimbolo(s);
    }
    void setDireccionSimbolo(String id, int d)
    {
        Simbolo sim= new Simbolo(id,d);
        
    }
    Simbolo getSimbolo(String id)
    {
        Simbolo sim=null;
        for(int i=0;i<this.tabla.size();i++)
        {
            sim= getSimbolo(i);
            if(sim.getId().equals(id))
            {
                break;
            }
            else
            {
                sim=null;
            }
        }
        return sim;
    }
    
    Simbolo getSimbolo(int id)
    {
        return (Simbolo) tabla.get(id);
    }
    // Inserta un simbolo
    public void insertar(String identificador, int valor) {
        if (!existe(identificador)) {
            tamano++;
            tabla.put(tamano, new Simbolo(identificador, valor));
            //System.out.println("Ident: " + identificador + " Valor: " + valor);
        }
    } */

    // Se agrega un simbolo
    public void insertarSimbolo(String identificador) {
        Simbolo sim=new Simbolo(sizeSimbolos(), identificador);
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

    Simbolo getSimbolo(int id)
    {
        return (Simbolo) tablaDeSimbolos.get(id);
    }
    
    public int sizeSimbolos(){
        return tablaDeSimbolos.size();
    }
    
    public int sizeTipo(){
        return tablaDeTipos.size();
    }
    
    void insertarSimbolo(Simbolo s)
    {
        int cod=s.getCodigo();
	tablaDeSimbolos.setElementAt(s,cod);
    }

    void setDireccionSimbolo(String id, int d)
    {   //CAMBIO SEGUN EL LIBRO
        Simbolo sim= getSimbolo(id);
        sim.setDireccion(d);
        insertarSimbolo(sim);
    }
    

    
    
}
