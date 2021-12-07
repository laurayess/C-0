package Analizadores;

//Esta clase contiene la tabla de simbolos
import java.util.*;

public class TablaSimbolos {
    public HashMap tabla;
    public int tamano;

    public TablaSimbolos() {
        tabla = new HashMap();
        tamano = 0;
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
            if (s.getNombre().equals(identificador)) {
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
            if (s.getNombre().equals(identificador)) {
                retorno = s.getCodigo();
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
                if (s.getNombre().equals(identificador)) {
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
            System.out.println(s.getNombre() + " " + s.getCodigo());
        }
    }
}
