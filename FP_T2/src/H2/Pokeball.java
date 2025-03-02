package H2;

public class Pokeball
{
	protected int integridad, percent;
	
	
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
	public int getPercent() 
	{
		return percent;
	}
	public void setPercent(int percent) 
	{
		this.percent = percent;
	}
	//////////////////////////////////////////////

	public Pokeball(int integridad, int percent)
	{
		this.integridad = integridad;
		this.percent = percent;
	}
	
}


