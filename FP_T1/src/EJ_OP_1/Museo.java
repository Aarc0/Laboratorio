package EJ_OP_1;

public class Museo 
{
	private double dinero;
	private Colegio[] cole;
	private int niñosd;
	private int niños;
	private int coles;
	
	///////////////////////////////////////
	public double getDinero() 
	{
		return dinero;
	}
	public void setDinero(double dinero) 
	{
		this.dinero = dinero;
	}
	///////////////////////////////////////	
	
	///////////////////////////////////////
	public Colegio[] getCole() 
	{
		return cole;
	}
	public void setCole(Colegio[] cole) 
	{
		this.cole = cole;
	}
	///////////////////////////////////////
	
	///////////////////////////////////////
	public int getNiñosd() 
	{
		return niñosd;
	}
	public void setNiñosd(int niñosd) 
	{
		this.niñosd = niñosd;
	}
	
	///////////////////////////////////////
	public int getNiños() 
	{
		return niños;
	}
	public void setNiños(int niños) 
	{
		this.niños = niños;
	}	
	///////////////////////////////////////

	///////////////////////////////////////
	public int getColes() 
	{
		return coles;
	}
	public void setColes(int coles) 
	{
		this.coles = coles;
	}
	///////////////////////////////////////
	
	
	public void cobro(Colegio[] cole)
	{
		//Alu tot
		int x = 0;
		
		//Disc tot
		int D = 0;
		
		//Coles totales
		int C = 0;
		
		//Recolectar dinero
		double Dinero = 0;
		
		
		//Recorre los colegios que hay
		for(int i = 0; i<cole.length;i++)
		{
			//Le digo que si el colegio en el indice 2 es u ingrese (U para saber si es público o privado)
			if(cole[i].getEstado().charAt(1) == 'u')
			{			
				//Esto me da la cantidad de alumnos totales del colegio publico
				x += cole[i].MostrarAlumnos();
				
				//Esto me da la cantidad total de alumnos discapacitados en el colegio público
				D += cole[i].Discapacitado();
				
				
				cole[i].ColePublico();
				C++;
			}
			else
			{
				//Esto me da la cantidad de alumnos totales del colegio privado
				x += cole[i].MostrarAlumnos();
				
				//Esto me da la cantidad total de alumnos discapacitados en el colegio privado
				D += cole[i].Discapacitado();
				
				C++;
			}
		}
		
		for (int i = 0; i < cole.length; i++) 
		{
			Dinero += cole[i].RecolectarDinero();
		}
		setDinero(Dinero);
		setNiñosd(D);
		setNiños(x);
		setColes(C);
	}
	
	
	
	public Museo(double dinero, int niñosd, int niños, int coles) 
	{
		this.dinero = dinero;
		this.niñosd = niñosd;
		this.niños = niños;
		this.coles = coles;
	}
	@Override
	public String toString() 
	{
		return "Museo [dinero recaudado=" + dinero + ", niños con dicapacidad=" + niñosd + ", niños totales=" + niños + ", colegios totales=" + coles + "]";
	}
	
	
	
	
}
