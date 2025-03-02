package H2;

public class SuperBall extends Pokeball 
{
	private int fallo;

	//////////////////////////////////////////////
	public int getFallo() 
	{
		return fallo;
	}

	public void setFallo(int fallo) 
	{
		this.fallo = fallo;
	}
	//////////////////////////////////////////////

	public SuperBall(int integridad, double percent, int fallo) 
	{
		super(integridad, percent);
		this.fallo = fallo;
	}	

}
