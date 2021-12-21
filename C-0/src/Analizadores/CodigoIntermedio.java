/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.*;

/**
 *
 * @author xeng_
 */
class CodigoIntermedio {
    String nombreFichero = null;
    PrintWriter ficheroEscritura;
    BufferedReader ficheroLectura;
    ArrayList instrucciones;

	
	// Constructor
	public CodigoIntermedio(String nombre) {
                instrucciones = new ArrayList();
		nombreFichero = nombre;
		ficheroLectura = null;
		ficheroEscritura = null;
		
	}   

	// Abre el fichero de donde leer el codigo intermedio
	public void abrirFicheroLectura(){
            try {
                ficheroLectura = new BufferedReader(new FileReader(nombreFichero));
            } catch (Exception e) {
                System.out.println(Texto.errorAbrirFicheroLectura);
            }
            
	}

	// Cierra el fichero de lectura
	public void cerrarFicheroLectura(){
            try {
                ficheroLectura.close();
            } catch (Exception e) {
                System.out.println(Texto.errorCerrarFicheroLectura);
            }
	}

	// Abre un nuevo fichero donde guardar codigo
	public void abrirFicheroEscritura(){
            try {
                ficheroEscritura = new PrintWriter(new BufferedWriter(new FileWriter(nombreFichero)));
            } catch (Exception e) {
                System.out.println(Texto.errorAbrirFicheroEscritura);
            }
		
	}

	// Cierra el fichero de escritura
	public void cerrarFicheroEscritura() {
                escribirInstruccionCI();
		ficheroEscritura.close();
	}
        
        public void escribirInstruccionCI(){
            Cuadrupla cuadrupla;
            for(int i=0;i<instrucciones.size();i++) {
			cuadrupla = (Cuadrupla)instrucciones.get(i);
			ficheroEscritura.println(cuadrupla.getNombre()+ " "+cuadrupla.getOp1()+
			" "+cuadrupla.getOp2()+" "+cuadrupla.getResultado());
		}
        }

	// Guarda una cuadrupla en el fichero abierto
	public void guardarCuadrupla(Cuadrupla cuadrupla) {
		instrucciones.add(cuadrupla);
	}
    
    
    
    
    /*
    public PrintWriter pw;
    public FileWriter fichero;
    public String ficheroSalida;
    Vector instrucciones;
    PrintWriter ficheroEscritura;
    
    String nombreFichero = null;
    
    
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

*/
        
}
