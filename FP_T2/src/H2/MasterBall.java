package H2;

public class MasterBall extends Pokeball
{
	private double estabilidad;

	public MasterBall(int integridad, double percent, double estabilidad) 
	{
		super(integridad, percent);
		this.estabilidad = estabilidad;
	}

	public double getEstabilidad() 
	{
		return estabilidad;
	}

	public void setEstabilidad(double estabilidad) 
	{
		this.estabilidad = estabilidad;
	}
	
	
		
}
