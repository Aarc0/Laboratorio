package H4;

public class PokemonNoDisponible extends Exception
{
	private int posicion;
	
	public PokemonNoDisponible(int posicion)
	{
		this.posicion = posicion;
	}
	
	public void MostrarE1(int posicion)
	{
		System.out.println("La posicion "+posicion+" está fuera de los límites del equipo");
	}
	
	public void MostrarE2(int posicion)
	{
		System.out.println("No hay ningún Pokemon en la posición "+posicion+" del equipo");
	}
}
