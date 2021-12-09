package Analizadores;

//Esta clase contiene la tabla de simbolos
import java.util.*;

public class TablaSimbolos
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
    }

    // ¿Existe un simbolo?
    public boolean existe(String identificador) {
        boolean retorno = false;
        Simbolo s;
        for (int i = 1; i <= tamano; i++) {
            s = (Simbolo) tabla.get(i);
            if (s.getId().equals(identificador)) {
                retorno = true;
                break;
            }
        }
        return retorno;
    }

    // Obtener valor
    public int getValor(String identificador) {
        int retorno = 0;
        Simbolo s;
        for (int i = 1; i <= tamano; i++) {
            s = (Simbolo) tabla.get(i);
            if (s.getId().equals(identificador)) {
                retorno = s.getValor();
                break;
            }
        }
        
        return retorno;
    }

    public void putSimbolo(String identificador, int valor) {
        Simbolo s;
        if (!existe(identificador))
            insertar(identificador, valor);
        else {
            for (int i = 1; i <= tamano; i++) {
                s = (Simbolo) tabla.get(i);
                if (s.getId().equals(identificador)) {
                    tabla.put(i, new Simbolo(identificador, valor));
                    break;
                }
            }
        }
    }

    public void listar() {
        Simbolo s;
        for (int i = 1; i <= tamano; i++) {
            s = (Simbolo) tabla.get(i);
            System.out.println(s.getId() + " " + s.getValor());
        }
    }
}
