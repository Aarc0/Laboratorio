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
	
	@Override
	public String toString()
	{
		String info = "El aeropuerto de " +nombre+ "cuenta con el código "+IATA+" y los vuelos " ;
		String vuelo = "";
		
		for (int i = 0; i < vuelos.length; i++) 
		{
			vuelo = vuelo + vuelos[i].getCodigo() +" "; 
		}
		
		return "El aeropuerto de "+nombre+" cuenta con el código "+IATA+" y los vuelos: "+vuelo;
	}
}
