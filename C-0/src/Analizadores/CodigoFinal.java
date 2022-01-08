/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author mende
 */

import java.io.*;
import java.util.*;

public class CodigoFinal {

    private CodigoIntermedio codigoIntermedio;
    private PrintWriter fichero;
    private String archivoCF;

    public CodigoFinal(CodigoIntermedio CI, String nombreDelPrograma) {
        codigoIntermedio = CI;
        String nombreNuevo = nombreDelPrograma.substring(0, nombreDelPrograma.lastIndexOf("."));
        archivoCF = nombreNuevo.concat(".ens");
    }

    private void abrirFichero() throws IOException {
        fichero = new PrintWriter(
                new BufferedWriter(
                        new FileWriter(archivoCF)));
    }

    private void cerrarFichero() {
        fichero.close();
    }

    private void escribirLinea(String linea) {
        fichero.println(linea);
    }

    private void lineaBlanco() {
        fichero.println("");
    }

    public void traducirCodigo() throws IOException {
		Cuadrupla cuadrupla;
		abrirFichero();
		for(int i=0;i<codigoIntermedio.instrucciones.size();i++) {
			cuadrupla=(Cuadrupla)codigoIntermedio.instrucciones.get(i);
			procesarCuadrupla(cuadrupla);
		}
		cerrarFichero();
	}

    private void procesarCuadrupla(Cuadrupla cuadrupla) throws IOException {
        String op1, op2, inst, res;
        String linea = "                                ";
        op1 = cuadrupla.op1;
        op2 = cuadrupla.op2;
        inst = cuadrupla.nombre;
        res = cuadrupla.resul;
        if (inst.equals("CARGAR_DIRECCION")) {
            escribirLinea(linea + "MOVE /" + op1 + " , /" + res);
        } else if (inst.equals("CARGAR_VALOR")) {
            escribirLinea(linea + "MOVE #" + op1 + " , /" + res);
        } else if (inst.equals("SUMAR")) {
            escribirLinea(linea + "ADD /" + op1 + " , /" + op2);
            escribirLinea(linea + "MOVE .A , /" + res);
        } else if (inst.equals("RESTAR")) {
            escribirLinea(linea + "SUB /" + op1 + " , /" + op2);
            escribirLinea(linea + "MOVE .A , /" + res);
        } else if (inst.equals("MULTIPLICAR")) {
            escribirLinea(linea + "MUL /" + op1 + " , /" + op2);
            escribirLinea(linea + "MOVE .A , /" + res);
        } else if (inst.equals("DIVIDIR")) {
            escribirLinea(linea + "DIV /" + op1 + " , /" + op2);
            escribirLinea(linea + "MOVE .A , /" + res);
        } else if (inst.equals("OR")) {
            escribirLinea(linea + "OR /" + op1 + " , /" + op2);
            escribirLinea(linea + "MOVE .A , /" + res);
        } else if (inst.equals("AND")) {
            escribirLinea(linea + "AND /" + op1 + " , /" + op2);
            escribirLinea(linea + "MOVE .A , /" + res);
        } else if (inst.equals("MAYOR")) {
            escribirLinea(linea + "CMP /" + op2 + " , /" + op1);
            escribirLinea(linea + "BN $5");
            escribirLinea(linea + "MOVE #0 , /" + res);
            escribirLinea(linea + "BR $3");
            escribirLinea(linea + "MOVE #1 , /" + res);
        } else if (inst.equals("MENOR")) {
            escribirLinea(linea + "CMP /" + op1 + " , /" + op2);
            escribirLinea(linea + "BN $5");
            escribirLinea(linea + "MOVE #0 , /" + res);
            escribirLinea(linea + "BR $3");
            escribirLinea(linea + "MOVE #1 , /" + res);
        } else if (inst.equals("IGUAL")) {
            escribirLinea(linea + "CMP /" + op1 + " , /" + op2);
            escribirLinea(linea + "BZ $5");
            escribirLinea(linea + "MOVE #0 , /" + res);
            escribirLinea(linea + "BR $3");
            escribirLinea(linea + "MOVE #1 , /" + res);
        } else if (inst.equals("DISTINTO")) {
            escribirLinea(linea + "CMP /" + op1 + " , /" + op2);
            escribirLinea(linea + "BZ $5");
            escribirLinea(linea + "MOVE #1 , /" + res);
            escribirLinea(linea + "BR $3");
            escribirLinea(linea + "MOVE #0 , /" + res);
        } else if (inst.equals("ETIQUETA")) {
            String lin = res + ":" + linea;
            escribirLinea(lin.substring(0, linea.length()) + "NOP");
        } else if (inst.equals("SALTAR_CONDICION")) {
            escribirLinea(linea + "CMP #0 , /" + op1);
            escribirLinea(linea + "BZ /" + res);
        } else if (inst.equals("SALTAR_ETIQUETA")) {
            escribirLinea(linea + "BR /" + res);
        } else if (inst.equals("IMPRIMIR_ENTERO")) {
            escribirLinea(linea + "WRINT /" + op1);
        } else if (inst.equals("IMPRIMIR_CADENA")) {
            escribirLinea(linea + "WRSTR /" + op1);
        } else if (inst.equals("PONER_CADENA")) {
            String lin = op1 + ": DATA" + linea;
            escribirLinea(lin.substring(0, linea.length()) + res);
        } else if (inst.equals("FIN")) {
            escribirLinea(linea + "HALT");
        }
    }
    
}
