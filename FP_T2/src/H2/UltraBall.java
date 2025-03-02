package H2;

public class UltraBall extends Pokeball
{
	private double potencia;

	//////////////////////////////////////////////
	public double getPotencia() 
	{
		return potencia;
	}
	public void setPotencia(int potencia) 
	{
		this.potencia = potencia;
	}
	//////////////////////////////////////////////
	
	public UltraBall(int integridad, double percent, double potencia)
	{
		super(integridad,percent);
		this.potencia = potencia;
	}
	
}
