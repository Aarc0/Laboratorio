package H_Final;

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

	public Pokeball(int integridad)
	{
		this.integridad = integridad;
		this.percent = 0.1;
	}
	public boolean captura(Pokemon pok)
	{
		double random = Math.random();
		boolean b = false;

			System.out.println("Usando la "+this.getClass().getSimpleName()+" probabilida de captura: "+ (this.percent*100)+"% | Integridad: "+this.integridad);
			if(this.percent >= random)
			{
				System.out.println("¡Captura exitosa! "+pok.getNombre()+" ahora es tuyo");
				b = true;
				setIntegridad(this.integridad-4);
				return b;
			}
			else
			{
				System.out.println("La captura de "+pok.getNombre()+" falló");
				setIntegridad(this.integridad-4);
			}
		return b;
	}
	@Override
	public String toString() 
	{
		return "Pokeball probabilidad de captura: " + (percent*100)+ "%, integridad:" + integridad;
	}
	
	
	
}


