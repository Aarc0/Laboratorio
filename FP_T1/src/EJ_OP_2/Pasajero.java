package EJ_OP_2;

public class Pasajero 
{
	private Maleta maleta;
	private String nacionalidad;
	private String ID;

	public Pasajero(Maleta maleta, String nacionalidad, String ID) 
	{
		this.maleta = maleta;
		this.nacionalidad = nacionalidad;
		this.ID = ID;	
	}

	///////////////////////////////////////////
	public Maleta getMaleta() 
	{
		return maleta;
	}
	public void setMaleta(Maleta maleta) 
	{
		this.maleta = maleta;
	}
	///////////////////////////////////////////

	///////////////////////////////////////////
	public String getNacionalidad() 
	{
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) 
	{
		this.nacionalidad = nacionalidad;
	}
	///////////////////////////////////////////

	///////////////////////////////////////////
	public String getID() 
	{
		return ID;
	}
	public void setID(String iD) 
	{
		ID = iD;
	}
	///////////////////////////////////////////

	
}
