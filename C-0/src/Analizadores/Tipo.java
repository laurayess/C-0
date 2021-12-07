/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Analizadores;

/**
 *
 * @author xeng_
 */
public class Tipo {
    
    int cod;
    String nombre;
    
    Tipo(){
        cod = -1;
        nombre = "";
    }
    
    void setCod(int c){
        cod = c;
    }
    
    void serNombre(String n){
        nombre = n;
    }
    
    int getCod(){
        return cod;
    }
    
    String getNombre(){
        return nombre;
    }
    
    
    
}
