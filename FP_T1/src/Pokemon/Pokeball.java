package Pokemon;

public class Pokeball 
{
	private int integridad;
	private int usos;
	
	/////////////////////////////////
	public int getIntegridad() 
	{
		return integridad;
	}
	public void setIntegridad(int integridad) 
	{
		this.integridad = integridad;
	}
	/////////////////////////////////

	/////////////////////////////////
	public int getUsos() 
	{
		return usos;
	}
	public void setUsos(int usos) 
	{
		this.usos = usos;
	}
	
	public Pokeball(int integridad, int usos) 
	{
		this.integridad = integridad;
	}
	/////////////////////////////////	
	
	public int usos(String pok, int its, int integridad)
	{
		while(its <3)
		{
			if(integridad > 0)
			{
				if(its < 2)
				{
					System.out.println("La captura de "+pok+" falló.");
					its++;
					integridad -= 4;
				}
				else
				{
					System.out.println("¡Captura exitosa! "+pok+" ahora es tuyo.");	
					integridad -= 4;
				}
			}
			else if(integridad <0)	
			{
				return integridad;
			}
			else
			{
				System.out.println("No hay pokeballs disponibles");
			}
		}
		return integridad;		
	}
	
}
