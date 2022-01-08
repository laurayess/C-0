package Analizadores;
public class Cuadrupla {

	 String nombre;
	 String op1;
	 String op2;
	 String resul;

	public Cuadrupla(String n,String p1,String p2,String r)
        {
            nombre = n;
            op1 = p1;
            op2 = p2;
            resul = r;
	}

	public String getNombre()
        {
            return nombre;
	}

	public String getOp1()
        {
            return op1;
	}

	public String getOp2()
        {
		return op2;
	}
	public String getResultado()
        {
		return resul;
	}
}