package Analizadores;

public class Simbolo {
    //Número de orden en la tabla
    int codigo;
    //Nombre del simbolo
    String nombre;
    int direccion;

    Simbolo() {
        codigo = -1;
        nombre = "";
    }

    Simbolo(String n, int c) {
        nombre = n;
        codigo = c;
    }
    
    void setCodigo(int c){
        codigo = c;
    }
    
    void setNombre(String n){
        nombre = n;
    }

    int getCodigo() {
        return codigo;
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
