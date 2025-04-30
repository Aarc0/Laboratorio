package H5;

public class PokeballsAgotadasException extends Exception
{
	private Nombre nombre;
	public PokeballsAgotadasException(Nombre nombre)
	{
		this.nombre = nombre;
	}
	
	public String toString() 
	{
		return "\nERROR: Se le han agotado todas las Pokeball al entrenador "+nombre;
	}
	
	public void mostrarError()
	{
		System.err.println(toString());
	}
}
