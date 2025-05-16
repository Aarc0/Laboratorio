package EJ1_AndresAlejandro_RojasCardona;

import java.util.Arrays;

public class Vuelo 
{
	private String codigo, ruta_t;
	private Aeropuerto [] ruta;
	
	
	
	public Vuelo(String codigo)
	{
		this.codigo = codigo;
		ruta = new Aeropuerto[3];
	}

	
	public String getRuta_t() 
	{
		return ruta_t;
	}
	public void setRuta_t(String ruta_t) 
	{
		this.ruta_t = ruta_t;
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
		this.ruta = ruta.clone();
	}
	/////////////////////////////////////

	@Override
	public String toString() 
	{
		return "El vuelo "+codigo+" tiene la siguiente secuencia de aeropuertos: \n"+ruta_t;	
	}
	
}
