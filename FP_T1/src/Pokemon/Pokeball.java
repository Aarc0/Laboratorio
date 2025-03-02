package Pokemon;

public class Pokeball 
{
	private int integridad;
	
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
	public Pokeball(int integridad) 
	{
		this.integridad = integridad;
	}
	/////////////////////////////////	
	
	@Override
    public String toString() {
		String integrity = String.valueOf(integridad);
        return integrity;
    }
	
	
	public int captura(String pok, int its, int integridad, int aux)
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
				else if(its == 2 && aux < 3)
				{
					System.out.println("¡Captura exitosa! "+pok+" ahora es tuyo.\n");	
					integridad -= 4;
				}
				else
				{
					System.out.println("Captura fallida, el entrenador no tiene suficiente espacio");
					return integridad;
				}
			}
			else if(integridad <0)	
			{
				return integridad;
			}
			else
			{
				System.out.println("\nNo hay pokeballs disponibles");
				return 0;
			}
		}
		return integridad;		
	}
	
}
