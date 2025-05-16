package EJ1_AndresAlejandro_RojasCardona;


public class Aeropuerto 
{
	private String IATA;
	private String nombre;
	private Vuelo [] vuelos;
	
	public Aeropuerto(String IATA, String nombre) 
	{
		this.IATA = IATA;
		this.nombre = nombre;
		vuelos = new Vuelo[3];
	}
	
	
	///////////////////////////////////////
	public String getIATA() 
	{
		return IATA;
	}
	public void setIATA(String IATA) 
	{
		this.IATA = IATA;
	}
	///////////////////////////////////////
	
	///////////////////////////////////////
	public String getNombre() 
	{
		return nombre;
	}
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	///////////////////////////////////////
	
	///////////////////////////////////////
	public Vuelo[] getVuelos() 
	{
		return vuelos;
	}
	public void setVuelos(Vuelo vuelos, int i) 
	{
		this.vuelos[i] = vuelos;
	}
	///////////////////////////////////////
	
	public void getInfoAeropuerto()
	{
		System.out.println(toString());
	}
	
	public void viajes()
	{
		String viajes = new String();
		String [] diferenciador = new String[vuelos.length];
		
		//Con vuelos tengo todos los vuelos que lleva ese aeropuerto
		for (int i = 0; i < vuelos.length; i++) 
		{
			if(vuelos[i]==null);
			else
			{
				//De un vuelo en especifico cojo su ruta la cual es una secuencia de aeropuertos
				for (int j = 0; j < vuelos[i].getRuta().length; j++) 
				{
					if(vuelos[i].getRuta()[j] == null);
					//Si pasando por la ruta de un vuelo llego al mismo aeropuerto (comparando los codigos IATA) 
					else if(vuelos[i].getRuta()[j].getIATA().equals(IATA))
					{
						//Aquí comparo en qué punto de su ruta se encuentra el aeropuerto que estamos mirando
						if(j == 0)
						{
						diferenciador[i] = "El vuelo "+vuelos[i].getCodigo()+ " tiene su origen en este aeropuerto ("+IATA+") "+nombre;
						}
						else if(j == 1)
						{
							diferenciador[i] = viajes + "\nEl vuelo "+vuelos[i].getCodigo()+ " tiene su escala en este aeropuerto ("+IATA+") "+nombre;
						}
						else if(j == 2)
						{
							diferenciador[i] = viajes +"\nEl vuelo "+vuelos[i].getCodigo()+ " tiene su destino en este aeropuerto ("+IATA+") "+nombre;
						}
					}
				}
			}
		}
		for (int i = 0; i < diferenciador.length; i++) 
		{
			if(diferenciador[i] == null);
			else System.out.println(diferenciador[i]);
		}
	}
}
