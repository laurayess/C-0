package Analizadores;

public class Simbolo {
    //Número de orden en la tabla
    public int codigo;
    //Nombre del simbolo
    public String nombre;
    private int direccion;

    public Simbolo() {
        codigo = -1;
        nombre = "";
    }

    public Simbolo(String n, int c) {
        this.nombre = n;
        this.codigo = c;
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
    
    public String toString(){
        return nombre;
    }
}
