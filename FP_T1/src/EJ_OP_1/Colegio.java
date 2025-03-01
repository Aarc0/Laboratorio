package EJ_OP_1;

public class Colegio 
{
	private String estado;
	private Alumnos [] alumnos;
	
	///////////////////////////////////////
	public String getEstado() 
	{
		return estado;
	}
	public void setEstado(String estado) 
	{
		this.estado = estado;
	}
	///////////////////////////////////////
	
	///////////////////////////////////////
	public Alumnos[] getAlumnos()
	{
		return alumnos;
	}
	public void setAlumnos(Alumnos[] alumnos) 
	{
		this.alumnos = alumnos;
	}
	///////////////////////////////////////
	
	public Colegio(String estado, Alumnos[] alumnos)
	{
		this.estado = estado;
		this.alumnos = alumnos;
	}
	
	
	//Para mostrar datos separados de un array hay que pasarle primero el array y luego en el metodo configurar la posición a la que se quiere llegar
	
	//Aquí establezco lo que tiene que pagar cada niño
	public int MostrarAlumnos()
	{
		int i;
		for (i = 0; i < alumnos.length; i++) 
		{
			if(alumnos[i].getEdad()<10) alumnos[i].setPago(1);
			else alumnos[i].setPago(2);
		}
		return i;
	}
	public int Discapacitado()
	{
		int x = 0;
		for (int i = 0; i < alumnos.length; i++) 
		{
			//Esta linea comprueba que no sean discapacitados
			if(alumnos[i].getDiscapacitado().charAt(0) == 'N');
			else
			{
				double y = alumnos[i].getPago();
				y *= 0.5;
				alumnos[i].setPago(y);
				x++;
			}
		}
		return x;
	}
	
	public void ColePublico()
	{
		for (int i = 0; i < alumnos.length; i++) 
		{
			double y = alumnos[i].getPago();
			y *= 0.25;
			y = alumnos[i].getPago() - y; 
			alumnos[i].setPago(y);
		}
	}
		
	public double RecolectarDinero()
	{
		double x = 0;	
		for (int i = 0; i < alumnos.length; i++) 
		{
			x+=alumnos[i].getPago();
		}	
		return x;
	}
	
	
	
}
