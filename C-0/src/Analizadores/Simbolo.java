package Analizadores;

public class Simbolo {
    String nombre;
    int codigo;
    private int direccion;

    public Simbolo() {
        codigo = -1;
        nombre = "";
    }

        Simbolo(int a,String b)
    {
        nombre = b;
        codigo = a;
    }

    public int getDireccion()
    {
        return direccion;
    }

    public void setDireccion(int direccion)
    {
        this.direccion = direccion;
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
