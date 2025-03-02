package H2;

public class Pokeball
{
	protected int integridad;
	protected double percent;
	
	
	//////////////////////////////////////////////
	public int getIntegridad() 
	{
		return integridad;
	}
	public void setIntegridad(int integridad) 
	{
		this.integridad = integridad;
	}
	//////////////////////////////////////////////

	//////////////////////////////////////////////
	public double getPercent() 
	{
		return percent;
	}
	public void setPercent(double percent) 
	{
		this.percent = percent;
	}
	//////////////////////////////////////////////

	public Pokeball(int integridad, double percent)
	{
		this.integridad = integridad;
		this.percent = percent;
	}
	
}


