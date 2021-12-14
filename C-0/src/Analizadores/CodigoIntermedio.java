/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author xeng_
 */
class CodigoIntermedio {
    public PrintWriter pw;
    public FileWriter fichero;
    public String ficheroSalida;
    Vector instrucciones;
    
    
    public CodigoIntermedio (String nombre){
        //Constructor
        ficheroSalida = nombre;
        fichero= null;
        crearInstrucciones();
    }
    
    void escribirLn(String cadena) {
        try
        {
            pw.println(cadena);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    void cerrarFicheroEscritura() {
        try {
        if (null != fichero)
            fichero.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    void escribir(String cadena) {
        try
        {
            pw.print(cadena);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    void abrirFicheroEscritura() {
        try
        {
            fichero = new FileWriter(ficheroSalida);
            pw = new PrintWriter(fichero);
        } catch (Exception e) {
            e.printStackTrace();
        }        
    }
    
    public void guardarCuadrupla(Cuadrupla cuadrupla) {
		instrucciones.addElement(cuadrupla);
	}
    
    private void crearInstrucciones() {
		instrucciones = new Vector();
	}
}
