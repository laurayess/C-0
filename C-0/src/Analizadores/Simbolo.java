package Analizadores;

public class Simbolo {
    
    int cod;
    String nombre;
    int direccion;

    Simbolo() {
        cod = -1;
        nombre = "";
    }

    Simbolo(String n, int c) {
        nombre = n;
        cod = c;
    }
    
    void setCodigo(int c){
        cod = c;
    }
    
    void setNombre(String n){
        nombre = n;
    }

    int getCodigo() {
        return cod;
    }

    String getNombre() {
        return nombre;
    }
    
    void setDireccion(int d){
        direccion = d;
    }
    
    int getDireccion(){
        return direccion;
    }
}
