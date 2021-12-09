package Analizadores;

public class Simbolo
{
    String id;
    int valor;
    private int direccion;

    public int getDireccion()
    {
        return direccion;
    }

    public void setDireccion(int direccion)
    {
        this.direccion = direccion;
    }
    Simbolo()
    {
        id = "";
        valor = 0;
    }
    
    Simbolo(int a,String b)
    {
        id = b;
        valor = a;
    }

    Simbolo(String id, int valor)
    {
        this.id = id;
        this.valor = valor;
    }

    int getValor() {
        return valor;
    }

    String getId()
    {
        return id;
    }
}
