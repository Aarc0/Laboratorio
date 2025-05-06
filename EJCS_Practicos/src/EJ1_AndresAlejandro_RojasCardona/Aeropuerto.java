package EJ1_AndresAlejandro_RojasCardona;

import java.util.Arrays;

public class Aeropuerto 
{
	private String codigo;
	private String nombre;
	private Vuelo [] vuelos;
	
	///////////////////////////////////////
	public String getCodigo() 
	{
		return codigo;
	}
	public void setCodigo(String codigo) 
	{
		this.codigo = codigo;
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
	public void setVuelos(Vuelo[] vuelos) 
	{
		this.vuelos = vuelos;
	}
	///////////////////////////////////////
	
	public void getInfoAeropuerto()
	{
		System.out.println(toString());
	}
	
	@Override
	public String toString()
	{
		return "El aeropuerto de "+nombre+" cuenta con el código "+codigo+" y los vuelos: "+Arrays.toString(vuelos);
	}
}
