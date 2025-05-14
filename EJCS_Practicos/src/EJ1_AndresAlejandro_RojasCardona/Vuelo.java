package EJ1_AndresAlejandro_RojasCardona;

import java.util.Arrays;

public class Vuelo 
{
	private String codigo;
	private Aeropuerto [] ruta;
	
	public Vuelo(String codigo)
	{
		this.codigo = codigo;
		ruta = new Aeropuerto[3];
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
		
		if(ruta[2] ==null)
		{
			
			return "Origen: "+ruta[0].getNombre()+" Destino: "+ruta[1].getNombre();
		}
		
		return "Origen: "+ruta[0].getNombre()+" Escala: "+ruta[1].getNombre()+ " Destino "+ruta[2].getNombre();	
	}
	
}
