package EJ1_AndresAlejandro_RojasCardona;

public class Vuelo 
{
	private String codigo;
	private Aeropuerto [] ruta;
	
	public Vuelo(String codigo, int n)
	{
		this.codigo = codigo;
		this.ruta = new Aeropuerto[n];
	}
	
	/////////////////////////////////////
	public String getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
	}
	/////////////////////////////////////
	
	/////////////////////////////////////
	public Aeropuerto[] getRuta() 
	{
		return ruta;
	}
	public void setRuta(Aeropuerto [] ruta) 
	{
		this.ruta = ruta;
	}
	/////////////////////////////////////	
	
	
	
	
}
